package com.xworkz.rtofine.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RtoFineDTO {
	private String userName;
	private String email;
	private long phoneNumber;
	private String violationType;
	private double fineAmount;
	private String date;
	private String vehicleNumber;
	private String location;
	private String issuedBy;
	private String paymentStatus;
}
