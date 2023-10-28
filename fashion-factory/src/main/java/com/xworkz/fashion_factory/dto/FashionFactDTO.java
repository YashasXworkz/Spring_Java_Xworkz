package com.xworkz.fashion_factory.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class FashionFactDTO {
	private int id;
	@NotBlank(message = "Name is required")
	@Size(max = 8, message = "A name can have up to 8 characters.")
	private String name;
	@NotBlank
	@Email(message = "Invalid email format")
	private String email;
	@Min(value = 1000000000L, message = "The phone number must be 10 digits.")
	@Max(value = 9999999999L, message = "The phone number can't be more than 10 digits.")
	private long phoneNo;
}
