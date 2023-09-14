package com.xworkz.aircondition.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.aircondition.dto.AirCondDto;

@Component
@RequestMapping("/")
public class AirCondController {
	public AirCondController() {
		System.out.println("Invoked AirCondController");
	}

	@GetMapping("/message")
	public String getMessage(Model model) {
		model.addAttribute("msg", "Welcome! Browse our selection of air conditioners.");
		return "index.jsp";
	}

	@GetMapping("/getInfo")
	public String getDetails(Model model) {
		System.out.println("Invoked getDetails method");
		List<AirCondDto> dtos = new ArrayList<>();
		dtos.add(new AirCondDto("Voltas 2023 Model 1.5 Ton 3 Star Split Inverter AC", 32990.78, "Voltas", "White"));
		dtos.add(new AirCondDto("LG Convertible 5-in-1 Cooling 2023 Model 1.5 Ton 3 Star Split Dual Inverter 2 Way Swing",
				35990.34, "LG", "Navy Blue"));
		dtos.add(new AirCondDto(
				"Panasonic Convertible 7-in-1 with Additional AI Mode Cooling 2023 Model 1.5 Ton 3 Star Split Inverter with 2 Way Swing",
				36490.88, "Panasonic", "Light Blue"));
		dtos.add(new AirCondDto(
				"Godrej 5-in-1 Convertible Cooling 2023 Model 1 Ton 3 Star Split Inverter i-sense Technology with Blue Fin Anti Corrosive Coating AC",
				29490.77, "Godrej", "White Gold"));
		model.addAttribute("dto", dtos);
		return "index.jsp";
	}
}
