package com.xworkz.rtofine.service;

import java.util.List;

import com.xworkz.rtofine.dto.RtoFineDTO;

public interface RtoFineService {
	boolean onSave(RtoFineDTO dto);

	List<RtoFineDTO> getAll();

	RtoFineDTO searchById(int id);

	List<RtoFineDTO> searchByName(String userName);

	List<RtoFineDTO> searchByEmail(String email);

	boolean deleteById(int id);

	boolean deleteByEmail(String email);

	boolean deleteByName(String userName);

	boolean onUpdate(RtoFineDTO dto);
}
