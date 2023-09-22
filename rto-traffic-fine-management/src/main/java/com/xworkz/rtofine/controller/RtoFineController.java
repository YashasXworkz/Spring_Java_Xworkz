package com.xworkz.rtofine.controller;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.rtofine.dto.RtoTrafficFineDTO;

@Component
@RequestMapping("/")
public class RtoFineController {
	public RtoFineController() {
		System.out.println("Invoked RtoFineController");
	}

	@PostMapping("/save")
	public String onSave(@ModelAttribute RtoTrafficFineDTO dto, Model model) {
		System.out.println("Invoked onSave method");
		model.addAttribute("rto", dto);
		return "success.jsp";
	}
}
