package com.xworkz.fashion_factory.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.xworkz.fashion_factory.dto.FashionFactDTO;
import com.xworkz.fashion_factory.service.FashionFactService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("/")
public class FashionFactController {

	@Autowired
	private FashionFactService service;

	public FashionFactController() {
		System.out.println("Invoked FashionFactController");
	}

	@GetMapping("delete")
	public String delete(@RequestParam int id, Model model) {
		boolean deleted = service.validateAndDelete(id);
		if (deleted) {
			model.addAttribute("succ", "Deleted");
		} else {
			model.addAttribute("err", "Failed to delete");
		}
		return "findbyfields";
	}

	@GetMapping("readAll")
	public String getAll(Model model) {
		List<FashionFactDTO> dtos = service.findAll();
		if (!dtos.isEmpty()) {
			log.info(dtos.toString());
			model.addAttribute("dtos", dtos);
		} else {
			model.addAttribute("err", "No records found");
		}
		return "findall";
	}

	@PostMapping("save")
	public String onSave(@ModelAttribute FashionFactDTO dto, Model model) {
		Set<ConstraintViolation<FashionFactDTO>> violations = service.validateAndSave(dto);
		List<String> violationMessages = new ArrayList<>();
		if (violations.isEmpty()) {
			model.addAttribute("succ", "Saved");
		} else {
			for (ConstraintViolation<FashionFactDTO> violation : violations) {
				violationMessages.add(violation.getMessage());
			}
			model.addAttribute("err", violationMessages);
		}
		return "register";
	}

	@GetMapping("findByEmail")
	public String searchByEmail(@RequestParam String email, Model model) {
		FashionFactDTO dto = service.findByEmail(email);
		if (dto != null) {
			model.addAttribute("d", dto);
		} else {
			model.addAttribute("err", "Not Found");
		}
		return "findbyfields";
	}

	@GetMapping("findByName")
	public String searchByName(@RequestParam String name, Model model) {
		FashionFactDTO dto = service.findByName(name);
		if (dto != null) {
			model.addAttribute("d", dto);
		} else {
			model.addAttribute("err", "Not Found");
		}
		return "findbyfields";
	}

	@GetMapping("showEmail")
	public String showUpdateByEmail(@RequestParam String email, Model model) {
		FashionFactDTO dto = service.findByEmail(email);
		model.addAttribute("d", dto);
		return "updatebyemailform";
	}

	@GetMapping("showId")
	public String showUpdateById(@RequestParam int id, Model model) {
		FashionFactDTO dto = service.findById(id);
		model.addAttribute("d", dto);
		return "updatebyidform";
	}

	@PostMapping("updateByEmail")
	public String updateByEmail(@ModelAttribute FashionFactDTO dto, Model model) {
		boolean updated = service.updateByEmail(dto);
		if (updated) {
			model.addAttribute("succ", "Updated By Email");
		} else {
			model.addAttribute("err", "Failed to update");
		}
		return "findbyfields";
	}

	@PostMapping("updateById")
	public String updateById(@ModelAttribute FashionFactDTO dto, Model model) {
		Set<ConstraintViolation<FashionFactDTO>> violations = service.validateAndUpdate(dto);
		List<String> violationMessages = new ArrayList<>();
		if (violations.isEmpty()) {
			model.addAttribute("succ", "Updated");
		} else {
			for (ConstraintViolation<FashionFactDTO> violation : violations) {
				violationMessages.add(violation.getMessage());
			}
			violationMessages.add("Failed to update");
			model.addAttribute("err", violationMessages);
		}
		return "findbyfields";
	}
}
