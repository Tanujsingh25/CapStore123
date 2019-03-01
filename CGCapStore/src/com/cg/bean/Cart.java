package com.cg.bean;

import javax.persistence.OneToOne;

public class Cart {
	private String cart_id;
	private double total_amount;
	@OneToOne
	private User user;
	public Cart() {		}
	
}
