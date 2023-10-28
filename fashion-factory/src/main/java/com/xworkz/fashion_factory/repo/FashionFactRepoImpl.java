package com.xworkz.fashion_factory.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Query;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.fashion_factory.dto.FashionFactDTO;
import com.xworkz.fashion_factory.entity.FashionFactEntity;

@Repository
public class FashionFactRepoImpl implements FashionFactRepo {

	@Autowired
	private EntityManagerFactory factory;

	@Override
	public boolean delete(int id) {
		EntityManager manager = factory.createEntityManager();
		FashionFactEntity entity = manager.find(FashionFactEntity.class, id);
		manager.getTransaction().begin();
		manager.remove(entity);
		manager.getTransaction().commit();
		manager.close();
		return true;
	}

	@Override
	public List<FashionFactEntity> findAll() {
		System.out.println("Invoked repo findAll");
		EntityManager manager = factory.createEntityManager();
		Query query = manager.createNamedQuery("getAll");
		List<FashionFactEntity> entities = query.getResultList();
		entities.stream().forEach(System.out::println);
		return entities;
	}

	@Override
	public FashionFactEntity findByEmail(String email) {
		EntityManager manager = factory.createEntityManager();
		Query query = manager.createNamedQuery("searchByEmail");
		query.setParameter("em", email);
		try {
			return (FashionFactEntity) query.getSingleResult();
		} catch (NoResultException e) {
			return null;
		}
	}

	@Override
	public FashionFactEntity findById(int id) {
		System.out.println("Invoked repo findById");
		EntityManager manager = factory.createEntityManager();
		return manager.find(FashionFactEntity.class, id);
	}

	@Override
	public FashionFactEntity findByName(String name) {
		System.out.println("Invoked repo findByName");
		EntityManager manager = factory.createEntityManager();
		Query searchQuery = manager.createNamedQuery("searchByName");
		searchQuery.setParameter("n", name);
		try {
			return (FashionFactEntity) searchQuery.getSingleResult();
		} catch (NoResultException e) {
			return null;
		}
	}

	@Override
	public void onUdapte(FashionFactDTO dto) {
		System.out.println("Invoked repo onUpdate");
		EntityManager manager = factory.createEntityManager();
		FashionFactEntity entity = new FashionFactEntity();
		BeanUtils.copyProperties(dto, entity);
		manager.getTransaction().begin();
		manager.merge(entity);
		manager.getTransaction().commit();
		manager.close();
	}

	@Override
	public void save(FashionFactDTO dto) {
		System.out.println("Invoked repo save");
		EntityManager manager = factory.createEntityManager();
		FashionFactEntity entity = new FashionFactEntity();
		BeanUtils.copyProperties(dto, entity);
		manager.getTransaction().begin();
		manager.persist(entity);
		manager.getTransaction().commit();
		manager.close();
	}

	@Override
	public boolean updateByEmail(FashionFactDTO dto) {
		EntityManager manager = factory.createEntityManager();
		Query query = manager.createNamedQuery("updateByEmail");
		// Modified Fields
		query.setParameter("n", dto.getName());
		query.setParameter("ph", dto.getPhoneNo());
		// Existing Email Field
		query.setParameter("email", dto.getEmail());
		manager.getTransaction().begin();
		int row = query.executeUpdate();
		manager.getTransaction().commit();
		if (row > 0) {
			return true;
		} else {
			return false;
		}
	}
}
