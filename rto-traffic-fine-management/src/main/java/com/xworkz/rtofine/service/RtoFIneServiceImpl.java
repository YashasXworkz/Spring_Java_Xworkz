package com.xworkz.rtofine.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.rtofine.dto.RtoFineDTO;
import com.xworkz.rtofine.entity.RtoFineEntity;
import com.xworkz.rtofine.repository.RtoFineRepo;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

@Service
public class RtoFIneServiceImpl implements RtoFineService {

	@Autowired
	private RtoFineRepo repo;

	@Override
	public boolean onSave(RtoFineDTO dto) {
		System.out.println("Invoked service onSave");
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<RtoFineDTO>> violations = validator.validate(dto);
		if (violations.isEmpty()) {
			System.out.println(dto);
			repo.onSave(dto);
			return true;
		} else {
			System.out.println("Error");
			System.out.println(violations);
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
	public RtoFineDTO searchById(int id) {
		System.out.println("Invoked service searchById");
		RtoFineDTO dto = new RtoFineDTO();
		if (id != 0) {
			RtoFineEntity entity = repo.searchById(id);
			if (entity != null) {
				BeanUtils.copyProperties(entity, dto);
			} else {
				System.out.println("entity is null");
				return null;
			}
		} else {
			System.out.println("Invalid id");
		}
		return dto;
	}

	@Override
	public List<RtoFineDTO> searchByName(String userName) {
		System.out.println("Invoked service searchByName");
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

	@Override
	public List<RtoFineDTO> searchByEmail(String email) {
		System.out.println("Invoked service searchByEmail");
		List<RtoFineEntity> entities = repo.searchByEmail(email);
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
	public boolean deleteById(int id) {
		System.out.println("Invoked service deleteById");
		return repo.deleteById(id);
	}

	@Override
	public boolean deleteByEmail(String email) {
		System.out.println("Invoked service deleteByEmail");
		return repo.deleteByEmail(email);
	}

	@Override
	public boolean deleteByName(String userName) {
		System.out.println("Invoked service deleteByName");
		return repo.deleteByName(userName);
	}

	@Override
	public boolean onUpdate(RtoFineDTO dto) {
		System.out.println("Invoked service onUpdate");
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<RtoFineDTO>> violations = validator.validate(dto);
		if (violations.isEmpty()) {
			System.out.println(dto);
			repo.onUpdate(dto);
			return true;
		} else {
			System.out.println("Error");
			System.out.println(violations);
			return false;
		}
	}
}
