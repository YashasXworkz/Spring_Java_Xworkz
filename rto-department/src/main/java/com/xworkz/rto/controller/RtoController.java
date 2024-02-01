package com.xworkz.rto.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Set;

import javax.servlet.http.HttpSession;
import javax.validation.ConstraintViolation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.xworkz.rto.dto.RtoDTO;
import com.xworkz.rto.dto.UserDTO;
import com.xworkz.rto.service.MailService;
import com.xworkz.rto.service.RtoService;
import com.xworkz.rto.service.UserService;
import com.xworkz.rto.util.Encryption;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("/")
public class RtoController {

	@Autowired
	public RtoService rtoService;

	@Autowired
	public UserService userService;

	@Autowired
	public MailService mailService;

	@Autowired
	public Encryption encryption;

	public RtoController() {
		log.info("Invoked RtoController");
	}

	@GetMapping("approveUser")
	public String approveUser(@RequestParam int id, Model model) {
		boolean approved = rtoService.approveApplication(id);
		if (approved) {
			model.addAttribute("succ", "User Approved Successfully");
		} else {
			model.addAttribute("err", "Failed to Approve User");
		}
		return "rtoprofile";
	}

	@PostMapping("forgotpassword")
	public String forgotPassword(@RequestParam String email, @RequestParam(required = false) String otp, String action,
			Model model) {
		if (action.equalsIgnoreCase("Send")) {
			RtoDTO rto = rtoService.findbyEmail(email);
			if (rto != null) {
				String code = String.valueOf((new Random().nextInt(90000) + 10000));
				boolean isEmailSent = mailService.mailSend(email, code);
				if (isEmailSent) {
					rto.setOtp(code);
					rtoService.update(rto);
					model.addAttribute("email", email);
					model.addAttribute("succ", "OTP Sent Successfully");
				} else {
					model.addAttribute("err", "Failed to send OTP email. Please try again.");
				}
			} else {
				model.addAttribute("err", "Email Not Found");
			}
			return "forgotpassword";
		} else if (action.equalsIgnoreCase("Verify")) {
			RtoDTO rto = rtoService.verifyEmailAndOtp(email, otp);
			if (rto != null) {
				rto.setOtp(null);
				rtoService.update(rto);
				model.addAttribute("email", email);
				model.addAttribute("succ", "OTP Verified Successfully");
				return "resetpassword";
			} else {
				model.addAttribute("email", email);
				model.addAttribute("err", "Incorrect code");
				return "forgotpassword";
			}
		}
		return "forgotpassword";
	}

	@PostMapping("rtosave")
	public String onSave(@ModelAttribute RtoDTO dto, Model model) {
		List<String> violationMessages = new ArrayList<>();
		boolean emailExists = rtoService.checkEmailExists(dto.getEmail());
		if (emailExists) {
			violationMessages.add("Email Already exists");
		}
		if (!dto.getPassword().equals(dto.getConfirmPassword())) {
			violationMessages.add("Password do not match");
		}
		Set<ConstraintViolation<RtoDTO>> violations = rtoService.save(dto);
		if (!violations.isEmpty()) {
			for (ConstraintViolation<RtoDTO> violation : violations) {
				violationMessages.add(violation.getMessage());
			}
		}
		if (!violationMessages.isEmpty()) {
			model.addAttribute("err", violationMessages);
		} else {
			model.addAttribute("succ", "Registered Successfully!");
		}
		return "rtosignup";
	}

	@PostMapping("rtologin")
	public String rtoLogin(@RequestParam String email, @RequestParam String password, Model model, HttpSession session) {
		RtoDTO rto = rtoService.checkPasswordLogin(email, password);
		if (rto != null) {
			log.info(rto.toString());
			session.setAttribute("rto", rto);
			List<UserDTO> users = userService.findByState(rto.getState());
			if (!users.isEmpty()) {
				users.forEach(user -> log.info(user.toString()));
				session.setAttribute("users", users);
			} else {
				session.setAttribute("err", "No users found for the rto's state.");
			}
			return "redirect:/rtoprofile.jsp";
		} else {
			model.addAttribute("err", "Invalid Credentials");
			return "rtologin";
		}
	}

	@PostMapping("updatepassword")
	public String updatePassword(@RequestParam String email, @RequestParam String newPassword,
			@RequestParam String confirmPassword, Model model) {
		RtoDTO rto = rtoService.findbyEmail(email);
		if (rto != null) {
			rto.setPassword(encryption.encrypt(newPassword));
			rto.setConfirmPassword(encryption.encrypt(confirmPassword));
			rtoService.update(rto);
			model.addAttribute("succ", "Password updated successfully");
		} else {
			model.addAttribute("err", "Something went wrong");
		}
		return "resetpassword";
	}
}