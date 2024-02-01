package com.xworkz.rto.service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.rto.dto.RtoDTO;
import com.xworkz.rto.entity.RtoEntity;
import com.xworkz.rto.repo.RtoRepo;

@Service
public class RtoServiceImpl implements RtoService {

	@Autowired
	public RtoRepo repo;

	@Override
	public boolean approveApplication(int id) {
		return repo.approveApplication(id);
	}

	@Override
	public boolean checkEmailExists(String email) {
		return repo.findByEmail(email) != null;
	}

	@Override
	public RtoDTO checkPasswordLogin(String email, String password) {
		if (email != null && password != null) {
			RtoEntity entity = repo.checkPasswordLogin(email, password);
			if (entity != null) {
				RtoDTO dto = new RtoDTO();
				BeanUtils.copyProperties(entity, dto);
				dto.setLoggedInTime(LocalDateTime.now());
				repo.update(dto);
				return dto;
			} else {
				System.out.println("Entity not found for the given credentials");
				return null;
			}
		} else {
			System.out.println("Email or password null");
			return null;
		}
	}

	@Override
	public RtoDTO findbyEmail(String email) {
		RtoEntity entity = repo.findByEmail(email);
		if (entity != null) {
			RtoDTO dto = new RtoDTO();
			BeanUtils.copyProperties(entity, dto);
			return dto;
		} else {
			return null;
		}
	}

	@Override
	public List<RtoDTO> findByState(String state) {
		List<RtoEntity> entities = repo.findByState(state);
		List<RtoDTO> dtos = new ArrayList<>();
		for (RtoEntity en : entities) {
			RtoDTO dto = new RtoDTO();
			BeanUtils.copyProperties(en, dto);
			dtos.add(dto);
		}
		return dtos;
	}

	@Override
	public Set<ConstraintViolation<RtoDTO>> save(RtoDTO dto) {
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<RtoDTO>> violations = validator.validate(dto);
		if (violations.isEmpty()) {
			repo.save(dto);
		} else {
			System.out.println("Violations Present");
		}
		return violations;
	}

	@Override
	public void update(RtoDTO dto) {
		repo.update(dto);
	}

	@Override
	public RtoDTO verifyEmailAndOtp(String email, String otp) {
		if (email != null && otp != null) {
			RtoEntity entity = repo.verifyEmailAndOtp(email, otp);
			if (entity != null) {
				RtoDTO dto = new RtoDTO();
				BeanUtils.copyProperties(entity, dto);
				return dto;
			} else {
				System.out.println("Entity not found for the given credentials");
				return null;
			}
		} else {
			System.out.println("Email or otp is null");
			return null;
		}
	}
}
