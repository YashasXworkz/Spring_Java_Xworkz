package com.xworkz.rto.entity;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "user_info")
@Data
@NoArgsConstructor
@NamedQueries({ @NamedQuery(name = "user.findByEmail", query = "SELECT u FROM UserEntity u WHERE u.emailAddress = :em "),
		@NamedQuery(name = "user.findByState", query = "SELECT u FROM UserEntity u WHERE u.state = :st"),
		@NamedQuery(name = "user.llrApplStatus", query = "SELECT u FROM UserEntity u WHERE (u.applicationNumber = :applNoOrPhNo OR u.phoneNumber = :applNoOrPhNo) AND u.dob = :dob"),
		@NamedQuery(name = "user.findByApplNo", query = "SELECT u FROM UserEntity u WHERE u.applicationNumber = :applNo") })
public class UserEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String firstName;
	private String middleName;
	private String lastName;
	private String gender;
	private String country;
	private String state;
	private String dob;
	private int age;
	private String bloodGroup;
	private String qualification;
	private String placeOfBirth;
	private String rtoOffice;
	private String emailAddress;
	private long phoneNumber;
	private long aadharNumber;
	private String presentAddress;
	private String permanentAddress;
	private int presentPincode;
	private int permanentPincode;
	private boolean organDonation;
	private LocalDateTime registeredTime;
	private LocalDateTime loggedInTime;
	private String applicationNumber;
	private String applicationStatus;
}
