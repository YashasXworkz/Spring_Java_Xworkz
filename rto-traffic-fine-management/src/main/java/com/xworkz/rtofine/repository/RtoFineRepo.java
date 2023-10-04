package com.xworkz.rtofine.repository;

import java.util.List;

import com.xworkz.rtofine.dto.RtoFineDTO;
import com.xworkz.rtofine.entity.RtoFineEntity;

public interface RtoFineRepo {
	boolean onSave(RtoFineDTO dto);

	List<RtoFineEntity> getAll();

	List<RtoFineEntity> searchByName(String userName);
}
