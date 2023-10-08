package com.xworkz.rtofine.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.rtofine.dto.RtoFineDTO;
import com.xworkz.rtofine.entity.RtoFineEntity;

@Repository
public class RtoFineRepoImpl implements RtoFineRepo {

	@Autowired
	EntityManagerFactory factory;

	@Override
	public boolean onSave(RtoFineDTO dto) {
		System.out.println("Invoked repository onSave");
		System.out.println("DTO: " + dto);
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
		System.out.println("Entity: " + entity);
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		manager.persist(entity);
		transaction.commit();
		manager.close();
		return true;
	}

	@Override
	public List<RtoFineEntity> getAll() {
		System.out.println("Invoked repository getAll");
		EntityManager manager = factory.createEntityManager();
		Query query = manager.createNamedQuery("findAll");
		List<RtoFineEntity> entities = query.getResultList();
		entities.stream().forEach(System.out::println);
		return entities;
	}

	@Override
	public RtoFineEntity searchById(int id) {
		System.out.println("Invoked repository searchById");
		EntityManager manager = factory.createEntityManager();
		return manager.find(RtoFineEntity.class, id);
	}

	@Override
	public List<RtoFineEntity> searchByName(String userName) {
		System.out.println("Invoked repository searchByName");
		EntityManager manager = factory.createEntityManager();
		Query searchQuery = manager.createNamedQuery("searchByName");
		searchQuery.setParameter("uname", userName);
		List<RtoFineEntity> entities = searchQuery.getResultList();
		entities.stream().forEach(System.out::println);
		return entities;
	}

	@Override
	public List<RtoFineEntity> searchByEmail(String email) {
		System.out.println("Invoked repository searchByEmail");
		EntityManager manager = factory.createEntityManager();
		Query searchQuery = manager.createNamedQuery("searchByEmail");
		searchQuery.setParameter("uemail", email);
		List<RtoFineEntity> entities = searchQuery.getResultList();
		entities.stream().forEach(System.out::println);
		return entities;
	}

	@Override
	public boolean deleteById(int id) {
		System.out.println("Invoked repository deleteById");
		EntityManager manager = factory.createEntityManager();
		RtoFineEntity entity = manager.find(RtoFineEntity.class, id);
		EntityTransaction transaction = manager.getTransaction();
		if (entity != null) {
			System.out.println(entity);
			transaction.begin();
			manager.remove(entity);
			transaction.commit();
			manager.close();
			return true;
		}
		return false;
	}

	@Override
	public boolean deleteByEmail(String email) {
		System.out.println("Invoked repository deleteByEmail");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		RtoFineEntity entity = null;
		Query deleteQuery = manager.createNamedQuery("searchByEmail");
		deleteQuery.setParameter("uemail", email);
		List<RtoFineEntity> entities = deleteQuery.getResultList();

		if (!entities.isEmpty()) {
			for (RtoFineEntity en : entities) {
				entity = manager.find(RtoFineEntity.class, en.getId());
			}
			transaction.begin();
			manager.remove(entity);
			transaction.commit();
			manager.close();
			return true;
		}
		return false;
	}

	@Override
	public boolean deleteByName(String userName) {
		System.out.println("Invoked repository deleteByName");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		RtoFineEntity entity = null;
		Query deleteQuery = manager.createNamedQuery("searchByName");
		deleteQuery.setParameter("uname", userName);
		List<RtoFineEntity> entities = deleteQuery.getResultList();

		if (!entities.isEmpty()) {
			for (RtoFineEntity en : entities) {
				entity = manager.find(RtoFineEntity.class, en.getId());
			}
			transaction.begin();
			manager.remove(entity);
			transaction.commit();
			manager.close();
			return true;
		}
		return false;
	}

	@Override
	public boolean onUpdate(RtoFineDTO dto) {
		System.out.println("Invoked repository onUpdate");
		EntityManager manager = factory.createEntityManager();
		RtoFineEntity entity = new RtoFineEntity();
		if (dto != null) {
			BeanUtils.copyProperties(dto, entity);
		}
		manager.getTransaction().begin();
		manager.merge(entity);
		manager.getTransaction().commit();
		manager.close();
		return true;
	}
}
