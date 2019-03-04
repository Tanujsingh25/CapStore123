package com.cg.dao;

import java.util.List;

import com.cg.bean.Merchant;
import com.cg.bean.User_details;

public interface CapstoreDao {
	public User_details findByEmail(String email);
	public List<User_details> getAllCustomers();
	public List<Merchant> getAllThirdPartyMerchants();
	public List<Merchant> getAllInHouseMerchants();
}
