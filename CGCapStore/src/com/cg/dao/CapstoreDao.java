package com.cg.dao;

import com.cg.bean.User;

public interface CapstoreDao {
	public User findByEmail(String email);
}
