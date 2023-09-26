package com.xworkz.rtofine.repository;

import org.springframework.stereotype.Component;

import com.xworkz.rtofine.dto.RtoFineDTO;

@Component
public class RtoFineRepoImpl implements RtoFineRepo {

	@Override
	public boolean onSave(RtoFineDTO dto) {
		System.out.println("Invoked repo onSave method");
		return true;
	}
}
