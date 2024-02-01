package com.xworkz.rto.repo;

import java.util.List;

import com.xworkz.rto.dto.RtoDTO;
import com.xworkz.rto.entity.RtoEntity;

public interface RtoRepo {
	boolean approveApplication(int id);

	RtoEntity checkPasswordLogin(String email, String password);

	RtoEntity findByEmail(String email);

	List<RtoEntity> findByState(String state);

	boolean save(RtoDTO dto);

	void update(RtoDTO dto);

	RtoEntity verifyEmailAndOtp(String email, String otp);
}
