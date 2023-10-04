package com.xworkz.rtofine.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.rtofine.dto.RtoFineDTO;
import com.xworkz.rtofine.entity.RtoFineEntity;
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

	@Override
	public List<RtoFineDTO> getAll() {
		System.out.println("Invoked service getAll");
		List<RtoFineEntity> entities = repo.getAll();
		List<RtoFineDTO> dtos = new ArrayList<>();

		for (RtoFineEntity en : entities) {
			RtoFineDTO dto = new RtoFineDTO();
			BeanUtils.copyProperties(en, dto);
			dtos.add(dto);
		}
		dtos.stream().forEach(System.out::println);
		return dtos;
	}

	@Override
	public List<RtoFineDTO> searchByName(String userName) {
		System.out.println("Invoked service getAll");
		List<RtoFineEntity> entities = repo.searchByName(userName);
		List<RtoFineDTO> dtos = new ArrayList<>();

		for (RtoFineEntity en : entities) {
			RtoFineDTO dto = new RtoFineDTO();
			BeanUtils.copyProperties(en, dto);
			dtos.add(dto);
		}
		dtos.stream().forEach(System.out::println);
		return dtos;
	}
}
