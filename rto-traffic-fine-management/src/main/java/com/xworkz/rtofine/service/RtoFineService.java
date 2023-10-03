package com.xworkz.rtofine.service;

import java.util.List;

import com.xworkz.rtofine.dto.RtoFineDTO;

public interface RtoFineService {
	boolean onSave(RtoFineDTO dto);

	List<RtoFineDTO> getAll();
}
