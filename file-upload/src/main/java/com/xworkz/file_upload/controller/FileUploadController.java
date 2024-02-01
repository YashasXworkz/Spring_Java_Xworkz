package com.xworkz.file_upload.controller;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping("/")
public class FileUploadController {

	@PostMapping("upload")
	public String uploadFile(@RequestParam("file") MultipartFile file, Model model) {
		System.out.println("Upload File Running ");
		if (file.isEmpty()) {
			model.addAttribute("message", "Please select a file to upload");
			return "index";
		}
		try {
			String fileContentType = file.getContentType();
			String filename = file.getOriginalFilename();
			System.out.println("File Name is: " + filename + " content type is " + fileContentType);
			byte[] bytes = file.getBytes();
			Path path = Paths.get("D://filesave//" + file.getOriginalFilename());
			Files.write(path, bytes);
			model.addAttribute("message", "You successfully uploaded '" + file.getOriginalFilename() + "'");
		} catch (IOException e) {
			e.printStackTrace();
		}
		return "index";
	}
}
