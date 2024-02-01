package com.xworkz.rto.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Service;

import com.xworkz.rto.config.MailConfig;

@Service
public class MailServiceImpl implements MailService {

	@Autowired
	public MailConfig config;

	@Override
	public boolean mailSend(String email, String otp) {
		try {
			SimpleMailMessage message = new SimpleMailMessage();
			message.setTo(email);
			message.setSubject("Login OTP");
			message.setText("Your OTP for login is: " + otp);
			config.mailConfig().send(message);
			System.out.println("OTP Sent Successfully");
			return true;
		} catch (Exception e) {
			System.out.println("Failed to send OTP email: " + e.getMessage());
			return false;
		}
	}
}
