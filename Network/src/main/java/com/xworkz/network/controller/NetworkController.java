package com.xworkz.network.controller;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.network.dto.NetworkDTO;

@Component
@RequestMapping("/")
public class NetworkController {
	public NetworkController() {
		System.out.println("Invoked NetworkController");
	}

	@GetMapping("/click")
	public String getMessage(Model model) {
		System.out.println("Invoked getMessage");
		model.addAttribute("message", "Hello");
		return "index.jsp";
	}

	@GetMapping("/show")
	public String getTraineeName(Model model) {
		System.out.println("Invoked getTraineeName");
		List<String> details = new ArrayList<>();
		details.add("Yashas");
		details.add("Darshan");
		details.add("Pavan");
		details.add("Krishan");
		details.add("Abhishek");
		details.add("Bharath");
		model.addAttribute("detailsName", details);
		return "index.jsp";
	}

	@GetMapping("/dtosList")
	public String getDTODetailsByList(Model model) {
		System.out.println("Invoked getDTODetails");
		List<NetworkDTO> myList = new ArrayList<>();
		myList.add(new NetworkDTO("Yashas", "yashas@gmail.com", 3434343434L, "Bangalore", "BSc"));
		myList.add(new NetworkDTO("Pavan", "pavan@gmail.com", 3456789121L, "Bangalore", "BCA"));
		myList.add(new NetworkDTO("Bharath", "bharath@gmail.com", 6464654566L, "Bangalore", "BE"));
		myList.add(new NetworkDTO("Krishna", "krishna@gmail.com", 4235262372L, "Bangalore", "BE"));
		myList.add(new NetworkDTO("Yashas", "yashas@gmail.com", 3434343434L, "Bangalore", "BSc"));
		model.addAttribute("dtol", myList);
		return "index.jsp";
	}

	@GetMapping("/dtosSet")
	public String getDTODetailsBySet(Model model) {
		System.out.println("Invoked getDTODetails");
		Set<NetworkDTO> mySet = new HashSet<>();
		mySet.add(new NetworkDTO("Yashas", "yashas@gmail.com", 3434343434L, "Bangalore", "BSc"));
		mySet.add(new NetworkDTO("Pavan", "pavan@gmail.com", 3456789121L, "Bangalore", "BCA"));
		mySet.add(new NetworkDTO("Bharath", "bharath@gmail.com", 6464654566L, "Bangalore", "BE"));
		mySet.add(new NetworkDTO("Krishna", "krishna@gmail.com", 4235262372L, "Bangalore", "BE"));
		// Duplicate DTO
		mySet.add(new NetworkDTO("Yashas", "yashas@gmail.com", 3434343434L, "Bangalore", "BSc"));
		model.addAttribute("dtos", mySet);
		return "index.jsp";
	}
}
