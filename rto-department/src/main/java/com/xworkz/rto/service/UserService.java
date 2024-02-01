package com.xworkz.rto.service;

import java.util.List;

import com.xworkz.rto.dto.UserDTO;

public interface UserService {
	boolean checkEmailExists(String email);

	List<UserDTO> findByState(String state);

	UserDTO findUser(String applNoOrPhNo, String dob);

	boolean saveUser(UserDTO dto);

	UserDTO findUser(String applNo);
}
