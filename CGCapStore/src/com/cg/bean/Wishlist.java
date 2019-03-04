package com.cg.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Wishlist {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int wishlist_id;

	@OneToOne
	@JoinColumn(name = "product_id")
	private Product product;

	@OneToOne
	@JoinColumn(name = "user_id")
	private User_details user;

	public Wishlist() {
	}
	
	public Wishlist(int wishlist_id, Product product, User_details user) {
		super();
		this.wishlist_id = wishlist_id;
		this.product = product;
		this.user = user;
	}

	public Wishlist(Product product, User_details user) {
		super();
		this.product = product;
		this.user = user;
	}

	public int getWishlist_id() {
		return wishlist_id;
	}

	public void setWishlist_id(int wishlist_id) {
		this.wishlist_id = wishlist_id;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public User_details getUser() {
		return user;
	}

	public void setUser(User_details user) {
		this.user = user;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((product == null) ? 0 : product.hashCode());
		result = prime * result + ((user == null) ? 0 : user.hashCode());
		result = prime * result + wishlist_id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Wishlist other = (Wishlist) obj;
		if (product == null) {
			if (other.product != null)
				return false;
		} else if (!product.equals(other.product))
			return false;
		if (user == null) {
			if (other.user != null)
				return false;
		} else if (!user.equals(other.user))
			return false;
		if (wishlist_id != other.wishlist_id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Wishlist [wishlist_id=" + wishlist_id + ", product=" + product + ", user=" + user + "]";
	}
}