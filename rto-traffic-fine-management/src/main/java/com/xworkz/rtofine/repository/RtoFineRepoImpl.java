package com.xworkz.rtofine.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

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
		entity.setVehicleNumber(dto.getVehicleNumber().toUpperCase());
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

	@Override
	public List<RtoFineEntity> getAll() {
		System.out.println("Invoked repository getAll");
		EntityManager manager = factory.createEntityManager();
		Query query = manager.createNamedQuery("findAll");
		List<RtoFineEntity> res = query.getResultList();
		res.stream().forEach(System.out::println);
		return res;
	}

	@Override
	public List<RtoFineEntity> searchByName(String userName) {
		System.out.println("Invoked repository searchByName");
		EntityManager manager = factory.createEntityManager();
		Query searchQuery = manager.createNamedQuery("searchByName");
		searchQuery.setParameter("uname", userName);
		List<RtoFineEntity> res = searchQuery.getResultList();
		return res;
	}
}
