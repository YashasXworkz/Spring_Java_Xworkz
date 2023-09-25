package com.xworkz.rtofine.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.rtofine.dto.RtoFineDTO;
import com.xworkz.rtofine.service.RtoFineService;

@Component
@RequestMapping("/")
public class RtoFineController {

	@Autowired
	private RtoFineService service;

	public RtoFineController() {
		System.out.println("Invoked RtoFineController");
	}

	public static void main(String[] args) {
		System.out.println("Invoked main method");
	}

	@PostMapping("/save")
	public String onSave(@ModelAttribute RtoFineDTO dto, Model model) {
		System.out.println("Invoked onSave method");
		service.onSave(dto);
		model.addAttribute("d", dto);
		return "success.jsp";
	}
}
