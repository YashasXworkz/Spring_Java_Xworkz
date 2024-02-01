package com.xworkz.rto.repo;

import java.util.List;

import com.xworkz.rto.dto.UserDTO;
import com.xworkz.rto.entity.UserEntity;

public interface UserRepo {
	boolean checkEmailExists(String email);

	List<UserEntity> findByState(String state);

	UserEntity findUser(String applNoOrPhNo, String dob);

	boolean saveUser(UserDTO dto);

	void updateUser(UserDTO dto);

	UserEntity findUser(String applNo);
}
