package com.cg.dao;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import org.springframework.stereotype.Repository;

import com.cg.bean.Address;
import com.cg.bean.Merchant;
import com.cg.bean.User_details;

@Repository
@Transactional
public class CapstoreDaoImpl implements CapstoreDao{
	
	public CapstoreDaoImpl() {
		super();
	}
	@PersistenceContext
	EntityManager entityManager;
	
	public EntityManager getEntityManager() {
		return entityManager;
	}
	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
	
	@Override
	public User_details findByEmail(String email) {
		Query query = entityManager.createQuery("from User_details u where u.email=:email ");
		query.setParameter("email", email);
		//System.out.println("dao details................."+(User_details)query.getSingleResult());
		return (User_details)query.getSingleResult();
	}
	@Override
	public List<User_details> getAllCustomers() {
		Query query = entityManager.createQuery("from User_details u where u.user_type=:type");
		query.setParameter("type", "Customer");
		return query.getResultList();
	}
	@Override
	public List<Merchant> getAllThirdPartyMerchants() {
		Query query = entityManager.createQuery("from Merchant u where u.merchant_type=:type");
		query.setParameter("type", "3rdPartyMerchant");
		return query.getResultList();
	}
	@Override
	public List<Merchant> getAllInHouseMerchants() {
		Query query = entityManager.createQuery("from Merchant u where u.merchant_type=:type");
		query.setParameter("type", "inHouseMerchant");
		return query.getResultList();
	}
	@Override
	public List<Address> getCustomerAddress(String user_id) {
		Query query = entityManager.createQuery("from Address a where a.user.user_id=:user_id");
		query.setParameter("user_id", user_id);
		return query.getResultList();
	}
	
}
