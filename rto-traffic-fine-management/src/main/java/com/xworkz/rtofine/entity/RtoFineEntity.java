package com.xworkz.rtofine.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "fine_info")
public class RtoFineEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
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
