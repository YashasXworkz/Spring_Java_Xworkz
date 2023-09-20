package com.xworkz.network.controller;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.xworkz.network.dto.NetworkDTO;
import com.xworkz.network.dto.ProductDto;
import com.xworkz.network.dto.StudentDto;

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

	@PostMapping("/onSave")
	public String getUserDetails(@RequestParam String uname, @RequestParam String uemail, @RequestParam Long uphone,
			String uplace, Model model) {
		System.out.println("Invoked getUserDetails method");
		List userDetials = new ArrayList<>();
		userDetials.add(uname);
		userDetials.add(uemail);
		userDetials.add(uphone);
		userDetials.add(uplace);
		System.out.println(userDetials);
		if (uplace.equalsIgnoreCase("bangalore")) {
			model.addAttribute("user", userDetials);
		} else {
			model.addAttribute("err", "User not from bangalore");
		}
		return "register.jsp";
	}

	@PostMapping("/onProdSave")
	public String getProductDetails(@RequestParam String prodName, @RequestParam int ratings, @RequestParam int prodPrice,
			@RequestParam int quantity, @RequestParam String reviews, Model model) {
		System.out.println("Invoked getProductDetails method");
		List<ProductDto> prodDetails = new ArrayList<>();
		prodDetails.add(new ProductDto(prodName.toUpperCase(), ratings, prodPrice, quantity, reviews, prodPrice * quantity));
		System.out.println(prodDetails);
		model.addAttribute("prod", prodDetails);
		return "product.jsp";
	}

	@PostMapping("/onMarks")
//	@RequestMapping(method = RequestMethod.POST, value = "/onMarks")
	public String getStudentResults(@RequestParam String sname, @RequestParam int phy, @RequestParam int chem,
			@RequestParam int math, @RequestParam int kan, @RequestParam int eng, @RequestParam int prog, Model model) {
		System.out.println("Invoked getStudentResults");
		List<StudentDto> studDetails = new ArrayList<>();
		int[] marks = { phy, chem, math, kan, eng, prog };
		int totalMarks = 0;
		for (int i = 0; i < marks.length; i++) {
			totalMarks += marks[i];
		}
		double percentage = totalMarks / marks.length;

		int highestMarks = marks[0];
		for (int i = 0; i < marks.length; i++) {
			if (highestMarks < marks[i]) {
				highestMarks = marks[i];
			}
		}

		int lowestMarks = marks[0];
		for (int i = 0; i < marks.length; i++) {
			if (lowestMarks > marks[i]) {
				lowestMarks = marks[i];
			}
		}
		studDetails.add(new StudentDto(sname.toUpperCase(), marks, totalMarks, percentage, highestMarks, lowestMarks));
		System.out.println(studDetails);
		model.addAttribute("stud", studDetails);
		return "student.jsp";
	}
}
