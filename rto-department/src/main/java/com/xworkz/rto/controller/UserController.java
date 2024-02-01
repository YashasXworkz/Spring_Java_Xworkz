package com.xworkz.rto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.xworkz.rto.dto.UserDTO;
import com.xworkz.rto.service.UserService;

@Controller
@RequestMapping("/")
public class UserController {

	@Autowired
	public UserService userService;

	public UserController() {
		System.out.println("Invoked UserController");
	}

	@PostMapping("llrapplstatus")
	public String userLLRApplStatus(@RequestParam String applNoOrPhNo, @RequestParam String dob, Model model) {
		UserDTO user = userService.findUser(applNoOrPhNo, dob);
		if (user != null) {
			model.addAttribute("user", user);
			return "userprofile";
		} else {
			model.addAttribute("err", "Invalid credentials");
			return "userllrapplstatus";
		}
	}

	@PostMapping("usersave")
	public String userSave(@ModelAttribute UserDTO dto, Model model) {
		boolean emailExists = userService.checkEmailExists(dto.getEmailAddress());
		if (emailExists) {
			model.addAttribute("err", "Email already exists. Please use a different email.");
		} else {
			boolean saved = userService.saveUser(dto);
			if (saved) {
				model.addAttribute("succ",
						"Application Submitted Successfully! Your reference number is " + dto.getApplicationNumber() + ".");
			} else {
				model.addAttribute("err", "Something went wrong while saving the user.");
			}
		}
		return "userregister";
	}

	@PostMapping("checkUser")
	public String findUser(@RequestParam String applNo, Model model) {
		UserDTO user = userService.findUser(applNo);
		if (user != null) {
			model.addAttribute("user", user);
			return "userdlapply";
		} else {
			model.addAttribute("err", "Not Found");
			return "userdl";
		}
	}
}
