package com.xworkz.rtofine.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "rtofine")
@NamedQuery(name = "findAll", query = "SELECT en FROM RtoFineEntity en")
public class RtoFineEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "r_id")
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
