package com.xworkz.rto.service;

import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;

import com.xworkz.rto.dto.RtoDTO;

public interface RtoService {
	boolean approveApplication(int id);

	boolean checkEmailExists(String email);

	RtoDTO checkPasswordLogin(String email, String password);

	RtoDTO findbyEmail(String email);

	List<RtoDTO> findByState(String state);

	Set<ConstraintViolation<RtoDTO>> save(RtoDTO dto);

	void update(RtoDTO dto);

	RtoDTO verifyEmailAndOtp(String email, String otp);
}
