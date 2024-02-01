package com.xworkz.rto.dto;

import java.time.LocalDateTime;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class RtoDTO {
	private int id;
	@NotBlank
	@Size(min = 3, max = 20, message = "Firstname should be min 3 & max 20 characters")
	private String firstName;
	@NotBlank
	@Size(max = 2, message = "Lastname should be max 2 character")
	private String lastName;
	@Email(message = "Invalid email format")
	@NotBlank
	private String email;
	@Min(value = 1000000000L, message = "Phonenumber must be 10 digits")
	@Max(value = 9999999999L, message = "Phonenumber can't be more than 10 digits")
	private long phoneNumber;
	@NotBlank
	private String dob;
	@NotBlank
	@Size(min = 6, message = "Password must be min 6 characters")
	private String password;
	@NotBlank
	private String confirmPassword;
	private String state;
	private String district;
	private LocalDateTime registeredTime;
	private LocalDateTime loggedInTime;
	private String otp;
	private int failedLoginCount;
}
