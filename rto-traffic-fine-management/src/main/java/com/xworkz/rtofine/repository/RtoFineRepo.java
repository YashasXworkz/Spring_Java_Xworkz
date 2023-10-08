package com.xworkz.rtofine.repository;

import java.util.List;

import com.xworkz.rtofine.dto.RtoFineDTO;
import com.xworkz.rtofine.entity.RtoFineEntity;

public interface RtoFineRepo {
	boolean onSave(RtoFineDTO dto);

	List<RtoFineEntity> getAll();

	RtoFineEntity searchById(int id);

	List<RtoFineEntity> searchByName(String userName);

	List<RtoFineEntity> searchByEmail(String email);

	boolean deleteById(int id);

	boolean deleteByEmail(String email);

	boolean deleteByName(String userName);

	boolean onUpdate(RtoFineDTO dto);
}
