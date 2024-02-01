package com.xworkz.rto.service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.rto.dto.UserDTO;
import com.xworkz.rto.entity.UserEntity;
import com.xworkz.rto.repo.UserRepo;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	public UserRepo repo;

	@Override
	public boolean checkEmailExists(String email) {
		return repo.checkEmailExists(email);
	}

	@Override
	public List<UserDTO> findByState(String state) {
		List<UserEntity> entities = repo.findByState(state);
		List<UserDTO> dtos = new ArrayList<>();
		for (UserEntity en : entities) {
			UserDTO dto = new UserDTO();
			BeanUtils.copyProperties(en, dto);
			dtos.add(dto);
		}
		return dtos;
	}

	@Override
	public UserDTO findUser(String applNoOrPhNo, String dob) {
		UserEntity entity = repo.findUser(applNoOrPhNo, dob);
		if (entity != null) {
			UserDTO dto = new UserDTO();
			BeanUtils.copyProperties(entity, dto);
			dto.setLoggedInTime(LocalDateTime.now());
			repo.updateUser(dto);
			return dto;
		} else {
			return null;
		}
	}

	@Override
	public boolean saveUser(UserDTO dto) {
		if (dto != null) {
			String code = String.valueOf(new Random().nextInt(900) + 100);
			String applicationNumber = null;
			if (dto.getState().equals("Andhra Pradesh")) {
				applicationNumber = "AP2023LLR" + code;
			} else if (dto.getState().equals("Maharashtra")) {
				applicationNumber = "MH2023LLR" + code;
			} else if (dto.getState().equals("Tamil Nadu")) {
				applicationNumber = "TN2023LLR" + code;
			} else if (dto.getState().equals("Karnataka")) {
				applicationNumber = "KA2023LLR" + code;
			} else if (dto.getState().equals("Kerala")) {
				applicationNumber = "KL2023LLR" + code;
			} else if (dto.getState().equals("Gujarat")) {
				applicationNumber = "GJ2023LLR" + code;
			} else if (dto.getState().equals("Uttar Pradesh")) {
				applicationNumber = "UP2023LLR" + code;
			} else if (dto.getState().equals("Rajasthan")) {
				applicationNumber = "RJ2023LLR" + code;
			} else if (dto.getState().equals("West Bengal")) {
				applicationNumber = "WB2023LLR" + code;
			} else if (dto.getState().equals("Bihar")) {
				applicationNumber = "BR2023LLR" + code;
			}
			dto.setApplicationNumber(applicationNumber);
			return repo.saveUser(dto);
		} else {
			return false;
		}
	}

	@Override
	public UserDTO findUser(String applNo) {
		UserEntity entity = repo.findUser(applNo);
		if (entity != null) {
			UserDTO dto = new UserDTO();
			BeanUtils.copyProperties(entity, dto);
			dto.setLoggedInTime(LocalDateTime.now());
			repo.updateUser(dto);
			return dto;
		} else {
			return null;
		}
	}
}
