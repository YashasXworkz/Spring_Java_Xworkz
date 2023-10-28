package com.xworkz.fashion_factory.service;

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

import com.xworkz.fashion_factory.dto.FashionFactDTO;
import com.xworkz.fashion_factory.entity.FashionFactEntity;
import com.xworkz.fashion_factory.repo.FashionFactRepo;

@Service
public class FashionFactServiceImpl implements FashionFactService {

	@Autowired
	private FashionFactRepo repo;

	@Override
	public List<FashionFactDTO> findAll() {
		List<FashionFactEntity> entities = repo.findAll();
		List<FashionFactDTO> dtos = new ArrayList<>();
		FashionFactEntity entity = new FashionFactEntity();
		for (FashionFactEntity en : entities) {
			FashionFactDTO dto = new FashionFactDTO();
			BeanUtils.copyProperties(en, dto);
			dtos.add(dto);
		}
		dtos.stream().forEach(System.out::println);
		return dtos;
	}

	@Override
	public FashionFactDTO findByEmail(String email) {
		FashionFactDTO dto = new FashionFactDTO();
		if (email != null) {
			FashionFactEntity entity = repo.findByEmail(email);
			if (entity != null) {
				BeanUtils.copyProperties(entity, dto);
			} else {
				System.out.println("entity is null");
				return null;
			}
		} else {
			System.out.println("email is null");
		}
		return dto;
	}

	@Override
	public FashionFactDTO findById(int id) {
		FashionFactDTO dto = new FashionFactDTO();
		if (id != 0) {
			FashionFactEntity entity = repo.findById(id);
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
	public FashionFactDTO findByName(String name) {
		FashionFactDTO dto = new FashionFactDTO();
		if (name != null) {
			FashionFactEntity entity = repo.findByName(name);
			if (entity != null) {
				BeanUtils.copyProperties(entity, dto);
			} else {
				System.out.println("Entity is null");
				return null;
			}
		} else {
			System.out.println("name is null");
		}
		return dto;
	}

	@Override
	public boolean updateByEmail(FashionFactDTO dto) {
		return repo.updateByEmail(dto);
	}

	@Override
	public boolean validateAndDelete(int id) {
		if (id != 0) {
			return repo.delete(id);
		} else {
			return false;
		}
	}

	@Override
	public Set<ConstraintViolation<FashionFactDTO>> validateAndSave(FashionFactDTO dto) {
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<FashionFactDTO>> violations = validator.validate(dto);
		if (violations.isEmpty()) {
			repo.save(dto);
			System.out.println("Data saved successfully");
			return violations;
		} else {
			System.out.println("Failed to save");
			return violations;
		}
	}

	@Override
	public Set<ConstraintViolation<FashionFactDTO>> validateAndUpdate(FashionFactDTO dto) {
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<FashionFactDTO>> violations = validator.validate(dto);
		if (violations.isEmpty()) {
			repo.onUdapte(dto);
			System.out.println("Data updated successfully");
			return violations;
		} else {
			System.out.println("Failed to update");
			return violations;
		}
	}
}
