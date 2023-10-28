package com.xworkz.fashion_factory.service;

import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;

import com.xworkz.fashion_factory.dto.FashionFactDTO;

public interface FashionFactService {
	List<FashionFactDTO> findAll();

	FashionFactDTO findByEmail(String email);

	FashionFactDTO findById(int id);

	FashionFactDTO findByName(String name);

	boolean updateByEmail(FashionFactDTO dto);

	boolean validateAndDelete(int id);

	Set<ConstraintViolation<FashionFactDTO>> validateAndSave(FashionFactDTO dto);

	Set<ConstraintViolation<FashionFactDTO>> validateAndUpdate(FashionFactDTO dto);
}
