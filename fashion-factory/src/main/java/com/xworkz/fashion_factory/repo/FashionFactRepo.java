package com.xworkz.fashion_factory.repo;

import java.util.List;

import com.xworkz.fashion_factory.dto.FashionFactDTO;
import com.xworkz.fashion_factory.entity.FashionFactEntity;

public interface FashionFactRepo {
	boolean delete(int id);

	List<FashionFactEntity> findAll();

	FashionFactEntity findByEmail(String email);

	FashionFactEntity findById(int id);

	FashionFactEntity findByName(String name);

	void onUdapte(FashionFactDTO dto);

	void save(FashionFactDTO dto);

	boolean updateByEmail(FashionFactDTO dto);
}
