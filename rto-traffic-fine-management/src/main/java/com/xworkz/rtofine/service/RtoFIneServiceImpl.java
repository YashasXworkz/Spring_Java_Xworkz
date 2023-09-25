package com.xworkz.rtofine.service;

import org.springframework.stereotype.Component;

import com.xworkz.rtofine.dto.RtoFineDTO;

@Component
public class RtoFIneServiceImpl implements RtoFineService {

	@Override
	public boolean onSave(RtoFineDTO dto) {
		System.out.println("Invoked onSave service method");
		System.out.println(dto);
		return true;
	}
}
