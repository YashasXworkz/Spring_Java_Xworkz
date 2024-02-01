package com.xworkz.rto.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.xworkz.rto.dto.RtoDTO;
import com.xworkz.rto.service.MailService;
import com.xworkz.rto.service.RtoService;
import com.xworkz.rto.util.Encryption;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("/")
public class AdminController {

	@Autowired
	public RtoService rtoService;

	@Autowired
	public MailService mailService;

	@Autowired
	public Encryption encryption;

	public AdminController() {
		System.out.println("Invoked AdminController");
	}

	@PostMapping("adminlogin")
	public String adminLogin(@RequestParam String email, @RequestParam String password, Model model, HttpSession session) {
		RtoDTO admin = rtoService.findbyEmail(email);
		if (admin != null) {
			if (encryption.encrypt(password).equals(admin.getPassword())) {
				admin.setFailedLoginCount(0);
				rtoService.update(admin);
				session.setAttribute("admin", admin);
				log.info("Admin {} logged in successfully", email);
				return "redirect:/adminprofile.jsp";
			} else {
				model.addAttribute("email", email);
				if (admin.getFailedLoginCount() == 3) {
					// Forgot Password - RtoController Class
					model.addAttribute("err", "Account blocked. Please "
							+ "<a href=\"forgotpassword.jsp\" class=\"text-primary\">reset password</a>" + " using email.");
					return "adminlogin";
				} else {
					log.warn("Invalid password attempt for email {}", email);
					model.addAttribute("err", "Invalid password. Attempts remaining: " + (3 - admin.getFailedLoginCount()));
					admin.setFailedLoginCount(admin.getFailedLoginCount() + 1);
					rtoService.update(admin);
					return "adminlogin";
				}
			}
		} else {
			model.addAttribute("err", "Email Not Found");
			return "adminlogin";
		}
	}

	@PostMapping("findbystate")
	public String findRtosByState(@RequestParam String state, Model model) {
		log.info("Searching for RTOs in state {}", state);
		List<RtoDTO> rtos = rtoService.findByState(state);
		if (!rtos.isEmpty()) {
			log.info("Found {} RTOs in state {}", rtos.size(), state);
			model.addAttribute("state", state);
			model.addAttribute("rtos", rtos);
		} else {
			log.warn("No RTOs found in state {}", state);
			model.addAttribute("err", "No RTOs found in state " + state);
		}
		return "adminprofile";
	}
}
