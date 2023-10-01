package com.xworkz.rtofine.service;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.rtofine.dto.RtoFineDTO;
import com.xworkz.rtofine.repository.RtoFineRepo;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

@Component
public class RtoFIneServiceImpl implements RtoFineService {

	@Autowired
	private RtoFineRepo repo;

	@Override
	public boolean onSave(RtoFineDTO dto) {
		System.out.println("Invoked service onSave method");
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<RtoFineDTO>> violation = validator.validate(dto);
		if (violation.isEmpty()) {
			repo.onSave(dto);
			System.out.println(dto);
			return true;
		} else {
			System.out.println("Error");
			System.out.println(violation);
			return false;
		}
	}
}
