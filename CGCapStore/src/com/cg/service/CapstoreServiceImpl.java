package com.cg.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cg.bean.Merchant;
import com.cg.bean.User_details;
import com.cg.dao.CapstoreDao;

@Service
public class CapstoreServiceImpl implements CapstoreService{
	@Autowired
	private CapstoreDao capstoreDao;
	public CapstoreDao getCapstoreDao() {
		return capstoreDao;
	}
	public void setCapstoreDao(CapstoreDao capstoreDao) {
		this.capstoreDao = capstoreDao;
	}
	public CapstoreServiceImpl() {
		super();
	}
	@Override
	public User_details findByEmail(String email) {
		return capstoreDao.findByEmail(email);
	}
	@Override
	public List<User_details> getAllCustomers() {
		return capstoreDao.getAllCustomers();
	}
	@Override
	public List<Merchant> getAllThirdPartyMerchants() {
		return capstoreDao.getAllThirdPartyMerchants();
	}
	@Override
	public List<Merchant> getAllInHouseMerchants() {
		return capstoreDao.getAllInHouseMerchants();
	}
	
}
