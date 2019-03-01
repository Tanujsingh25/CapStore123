package com.cg.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.bean.User;
import com.cg.dao.CapstoreDaoImpl;

@Service
public class CapstoreServiceImpl implements CapstoreService{
	@Autowired
	private CapstoreDaoImpl capstoreDao;
	public CapstoreDaoImpl getCapstoreDao() {
		return capstoreDao;
	}
	public void setCapstoreDao(CapstoreDaoImpl capstoreDao) {
		this.capstoreDao = capstoreDao;
	}
	public CapstoreServiceImpl() {
		super();
	}
	@Override
	public User findByEmail(String email) {
		return capstoreDao.findByEmail(email);
	}
	
}
