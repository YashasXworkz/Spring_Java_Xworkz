package com.xworkz.rtofine.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.xworkz.rtofine.dto.RtoFineDTO;
import com.xworkz.rtofine.service.RtoFineService;

@Controller
@RequestMapping("/")
public class RtoFineController {

	@Autowired
	private RtoFineService service;

	public RtoFineController() {
		System.out.println("Invoked RtoFineController constructor");
	}

	@PostMapping("save")
	public String onSave(@ModelAttribute RtoFineDTO dto, Model model) {
		System.out.println("Invoked controller onSave method");
		boolean saved = service.onSave(dto);
		if (saved) {
			model.addAttribute("succ", "Record saved successfully!");
			return "register";
		}
		model.addAttribute("err", "Failed to save the record!");
		return "register";
	}

	@GetMapping("readAll")
	public String findAll(Model model) {
		System.out.println("Invoked controller findAll");
		List<RtoFineDTO> dtos = service.getAll();
		if (!dtos.isEmpty()) {
			dtos.stream().forEach(System.out::println);
			model.addAttribute("dtos", dtos);
			return "findall";
		} else {
			model.addAttribute("noData", "No records found.");
			return "findall";
		}
	}

	@GetMapping("findById")
	public String searchById(@RequestParam int id, Model model) {
		System.out.println("Invoked controller searchById");
		RtoFineDTO dto = service.searchById(id);
		if (dto != null) {
			model.addAttribute("d", dto);
			return "findbyfields";
		} else {
			model.addAttribute("notFound", "No records found for the provided ID.");
			return "findbyfields";
		}
	}

	@GetMapping("findByName")
	public String searchByName(@RequestParam String userName, Model model) {
		System.out.println("Invoked controller searchByName");
		List<RtoFineDTO> dtos = service.searchByName(userName);
		if (!dtos.isEmpty()) {
			dtos.stream().forEach(System.out::println);
			model.addAttribute("size", dtos.size());
			model.addAttribute("dto", dtos);
			return "findbyfields";
		} else {
			model.addAttribute("notFound", "No records found for the provided name.");
			return "findbyfields";
		}
	}

	@GetMapping("findByEmail")
	public String searchByEmail(@RequestParam String email, Model model) {
		System.out.println("Invoked controller searchByEmail");
		List<RtoFineDTO> dtos = service.searchByEmail(email);
		if (!dtos.isEmpty()) {
			model.addAttribute("dto", dtos);
			return "findbyfields";
		} else {
			model.addAttribute("notFound", "No records found for the provided email address.");
			return "findbyfields";
		}
	}

	@GetMapping("deleteById")
	public String deleteById(@RequestParam int id, Model model) {
		System.out.println("Invokd controller deleteById");
		boolean deleted = service.deleteById(id);
		if (deleted) {
			model.addAttribute("succ", "Record deleted successfully!");
			return "findall";
		} else {
			model.addAttribute("err", "Failed to delete the record!");
			return "findall";
		}
	}

	@GetMapping("deleteByEmail/{email}")
	public String deleteByEmail(@PathVariable String email, Model model) {
		System.out.println("Invokd controller deleteById");
		boolean deleted = service.deleteByEmail(email);
		if (deleted) {
			model.addAttribute("succ", "Record deleted successfully!");
			return "findbyfields";
		} else {
			model.addAttribute("err", "Failed to delete the record!");
			return "findbyfields";
		}
	}

	@GetMapping("deleteByName/{userName}")
	public String deleteByName(@PathVariable String userName, Model model) {
		System.out.println("Invokd controller deleteById");
		boolean deleted = service.deleteByName(userName);
		if (deleted) {
			model.addAttribute("succ", "Record deleted successfully!");
			return "findbyfields";
		} else {
			model.addAttribute("err", "Failed to delete the record!");
			return "findbyfields";
		}
	}

	@GetMapping("edit")
	public String edit(@RequestParam int id, Model model) {
		System.out.println("Invoked controller edit");
		RtoFineDTO dto = service.searchById(id);
		model.addAttribute("d", dto);
		return "update";
	}

	@PostMapping("onUpdate")
	public String onUpdate(@ModelAttribute RtoFineDTO dto, Model model) {
		System.out.println("Invoked controller onUdpate");
		boolean updated = service.onUpdate(dto);
		if (updated) {
			model.addAttribute("succ", "Record updated successfully!");
		} else {
			model.addAttribute("err", "Failed to update the record!");
		}
		return "findall";
	}
}
