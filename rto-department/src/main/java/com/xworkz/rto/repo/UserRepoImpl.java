package com.xworkz.rto.repo;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Query;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.rto.dto.UserDTO;
import com.xworkz.rto.entity.UserEntity;

@Repository
public class UserRepoImpl implements UserRepo {

	@Autowired
	public EntityManagerFactory factory;

	@Override
	public boolean checkEmailExists(String email) {
		EntityManager manager = factory.createEntityManager();
		try {
			Query query = manager.createNamedQuery("user.findByEmail").setParameter("em", email);
			query.getSingleResult();
			return true;
		} catch (NoResultException e) {
			return false;
		}
	}

	@Override
	public List<UserEntity> findByState(String state) {
		EntityManager manager = factory.createEntityManager();
		Query query = manager.createNamedQuery("user.findByState").setParameter("st", state);
		return query.getResultList();
	}

	@Override
	public UserEntity findUser(String applNoOrPhNo, String dob) {
		EntityManager manager = factory.createEntityManager();
		try {
			Query query = manager.createNamedQuery("user.llrApplStatus");
			query.setParameter("applNoOrPhNo", applNoOrPhNo);
			query.setParameter("dob", dob);
			return (UserEntity) query.getSingleResult();
		} catch (NoResultException e) {
			return null;
		}
	}

	@Override
	public boolean saveUser(UserDTO dto) {
		EntityManager manager = factory.createEntityManager();
		dto.setRegisteredTime(LocalDateTime.now());
		dto.setApplicationStatus("Pending");
		UserEntity entity = new UserEntity();
		BeanUtils.copyProperties(dto, entity);
		manager.getTransaction().begin();
		manager.persist(entity);
		manager.getTransaction().commit();
		manager.close();
		return true;
	}

	@Override
	public void updateUser(UserDTO dto) {
		EntityManager manager = factory.createEntityManager();
		UserEntity entity = manager.find(UserEntity.class, dto.getId());
		if (entity != null) {
			BeanUtils.copyProperties(dto, entity);
			manager.getTransaction().begin();
			manager.merge(entity);
			manager.getTransaction().commit();
		} else {
			System.out.println("Entity not found for the given ID: " + dto.getId());
		}
	}

	@Override
	public UserEntity findUser(String applNo) {
		EntityManager manager = factory.createEntityManager();
		try {
			Query query = manager.createNamedQuery("user.findByApplNo");
			query.setParameter("applNo", applNo);
			return (UserEntity) query.getSingleResult();
		} catch (NoResultException e) {
			return null;
		}
	}
}
