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

@Data
@NoArgsConstructor
@Entity
@Table(name = "rto_info")
@NamedQueries({ @NamedQuery(name = "findByEmail", query = "SELECT en FROM RtoEntity en WHERE en.email=:em"),
		@NamedQuery(name = "verifyEmailAndOtp", query = "SELECT en FROM RtoEntity en WHERE en.email=:em AND en.otp=:otp"),
		@NamedQuery(name = "findByState", query = "SELECT en FROM RtoEntity en WHERE en.state=:st"),
		@NamedQuery(name = "checkPasswordLogin", query = "SELECT en FROM RtoEntity en WHERE en.email=:em AND en.password=:psw"), })
public class RtoEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String firstName;
	private String lastName;
	private String email;
	private long phoneNumber;
	private String dob;
	private String password;
	private String confirmPassword;
	private String state;
	private String district;
	private LocalDateTime registeredTime;
	private LocalDateTime loggedInTime;
	private String otp;
	private int failedLoginCount;
}
