package com.xworkz.rtofine.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.rtofine.dto.RtoFineDTO;
import com.xworkz.rtofine.entity.RtoFineEntity;

@Component
public class RtoFineRepoImpl implements RtoFineRepo {

	@Autowired
	EntityManagerFactory factory;

	@Override
	public boolean onSave(RtoFineDTO dto) {
		System.out.println("Invoked repo onSave method");
		System.out.println(dto);
		RtoFineEntity entity = new RtoFineEntity();
		entity.setUserName(dto.getUserName());
		entity.setEmail(dto.getEmail());
		entity.setPhoneNumber(dto.getPhoneNumber());
		entity.setViolationType(dto.getViolationType());
		entity.setFineAmount(dto.getFineAmount());
		entity.setDate(dto.getDate());
		entity.setVehicleNumber(dto.getVehicleNumber());
		entity.setLocation(dto.getLocation());
		entity.setIssuedBy(dto.getIssuedBy());
		entity.setPaymentStatus(dto.getPaymentStatus());
		System.out.println(entity);
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		manager.persist(entity);
		transaction.commit();
		return true;
	}
}
