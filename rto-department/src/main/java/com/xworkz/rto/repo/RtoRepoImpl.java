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

import com.xworkz.rto.dto.RtoDTO;
import com.xworkz.rto.entity.RtoEntity;
import com.xworkz.rto.entity.UserEntity;
import com.xworkz.rto.util.Encryption;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Repository
public class RtoRepoImpl implements RtoRepo {

	@Autowired
	public EntityManagerFactory factory;

	@Autowired
	public Encryption encryption;

	@Override
	public boolean approveApplication(int id) {
		EntityManager manager = factory.createEntityManager();
		UserEntity entity = manager.find(UserEntity.class, id);
		if (entity != null) {
			entity.setApplicationStatus("Approved");
			manager.getTransaction().begin();
			manager.merge(entity);
			manager.getTransaction().commit();
			manager.close();
			return true;
		} else {
			return false;
		}
	}

	@Override
	public RtoEntity checkPasswordLogin(String email, String password) {
		RtoEntity entity = findByEmail(email);
		if (entity != null) {
			if (encryption.encrypt(password).equals(entity.getPassword())) {
				log.info("Password match for email {}", email);
				return entity;
			} else {
				log.warn("Invalid password attempt for email {}", email);
				return null;
			}
		} else {
			log.warn("Email {} not found", email);
			return null;
		}
	}

	/*
	 * EntityManager manager = factory.createEntityManager();
	 * Query loginQuery = manager.createNamedQuery("checkPasswordLogin");
	 * loginQuery.setParameter("em", email);
	 * loginQuery.setParameter("psw", password);
	 * try {
	 * return (RtoEntity) loginQuery.getSingleResult();
	 * } catch (NoResultException e) {
	 * return null;
	 * }
	 */

	@Override
	public RtoEntity findByEmail(String email) {
		EntityManager manager = factory.createEntityManager();
		Query searchQuery = manager.createNamedQuery("findByEmail").setParameter("em", email);
		try {
			return (RtoEntity) searchQuery.getSingleResult();
		} catch (NoResultException e) {
			return null;
		}
	}

	@Override
	public List<RtoEntity> findByState(String state) {
		EntityManager manager = factory.createEntityManager();
		Query query = manager.createNamedQuery("findByState").setParameter("st", state);
		return query.getResultList();
	}

	@Override
	public boolean save(RtoDTO dto) {
		EntityManager manager = factory.createEntityManager();
		RtoEntity existingEntity = findByEmail(dto.getEmail());
		if (existingEntity == null) {
			dto.setPassword(encryption.encrypt(dto.getPassword()));
			dto.setConfirmPassword(encryption.encrypt(dto.getConfirmPassword()));
			dto.setRegisteredTime(LocalDateTime.now());
			RtoEntity entity = new RtoEntity();
			BeanUtils.copyProperties(dto, entity);
			manager.getTransaction().begin();
			manager.persist(entity);
			manager.getTransaction().commit();
			manager.close();
			return true;
		} else {
			return false;
		}
	}

	@Override
	public void update(RtoDTO dto) {
		EntityManager manager = factory.createEntityManager();
		RtoEntity entity = manager.find(RtoEntity.class, dto.getId());
		if (entity != null) {
			BeanUtils.copyProperties(dto, entity);
			manager.getTransaction().begin();
			manager.merge(entity);
			manager.getTransaction().commit();
			manager.close();
			log.info("RTO with ID {} updated successfully", dto.getId());
		} else {
			log.warn("Entity not found for ID: {}", dto.getId());
		}
	}

	@Override
	public RtoEntity verifyEmailAndOtp(String email, String otp) {
		EntityManager manager = factory.createEntityManager();
		Query loginQuery = manager.createNamedQuery("verifyEmailAndOtp");
		loginQuery.setParameter("em", email);
		loginQuery.setParameter("otp", otp);
		try {
			return (RtoEntity) loginQuery.getSingleResult();
		} catch (NoResultException e) {
			return null;
		}
	}
}
