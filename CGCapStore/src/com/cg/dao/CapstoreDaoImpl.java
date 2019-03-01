package com.cg.dao;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import org.springframework.stereotype.Repository;

import com.cg.bean.User;

@Repository
@Transactional
public class CapstoreDaoImpl implements CapstoreDao{
	@PersistenceContext
	EntityManagerFactory entityManager = Persistence.createEntityManagerFactory("JPA-PU");
	public EntityManagerFactory getEntityManager() {
		return entityManager;
	}
	public void setEntityManager(EntityManagerFactory entityManager) {
		this.entityManager = entityManager;
	}

	@Override
	public User findByEmail(String email) {
		return entityManager.createEntityManager().find(User.class, email);
	}
	
}
