package com.xworkz.rtofine.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RtoFineDTO {
	private int id;
	@NotBlank(message = "Username is required")
	@Size(max = 10, message = "Username can have up to 10 characters")
	private String userName;
	@NotBlank(message = "Email is required")
	@Email(message = "Invalid email format")
	private String email;
	@Min(value = 1000000000L, message = "Phonenumber must be 10 digits")
	@Max(value = 9999999999L, message = "Phonenumber can't be more than 10 digits")
	private long phoneNumber;
	@NotBlank(message = "Violation type is required")
	private String violationType;
	@Positive(message = "Fine amount must be positive number")
	private double fineAmount;
	@NotBlank(message = "Date is required")
	private String date;
	@NotBlank(message = "Vehicle number is required")
	@NotEmpty
	private String vehicleNumber;
	@NotBlank(message = "Location is required")
	@NotNull
	private String location;
	@NotBlank(message = "Issued by is required")
	@NotNull
	private String issuedBy;
	@NotNull
	@NotBlank(message = "Payment status is required")
	private String paymentStatus;
}
