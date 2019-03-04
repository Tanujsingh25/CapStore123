package com.cg.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Inventory {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int inventory_id;

	@OneToOne
	@JoinColumn(name = "product_id")
	private Product products;

	@OneToOne
	@JoinColumn(name = "merchant_id")
	private Merchant merchants;

	public Inventory() {
	}

	public Inventory(int inventory_id, Product products, Merchant merchants) {
		super();
		this.inventory_id = inventory_id;
		this.products = products;
		this.merchants = merchants;
	}

	public Inventory(Product products, Merchant merchants) {
		super();
		this.products = products;
		this.merchants = merchants;
	}

	public int getInventory_id() {
		return inventory_id;
	}

	public void setInventory_id(int inventory_id) {
		this.inventory_id = inventory_id;
	}

	public Product getProducts() {
		return products;
	}

	public void setProducts(Product products) {
		this.products = products;
	}

	public Merchant getMerchants() {
		return merchants;
	}

	public void setMerchants(Merchant merchants) {
		this.merchants = merchants;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + inventory_id;
		result = prime * result + ((merchants == null) ? 0 : merchants.hashCode());
		result = prime * result + ((products == null) ? 0 : products.hashCode());
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
		Inventory other = (Inventory) obj;
		if (inventory_id != other.inventory_id)
			return false;
		if (merchants == null) {
			if (other.merchants != null)
				return false;
		} else if (!merchants.equals(other.merchants))
			return false;
		if (products == null) {
			if (other.products != null)
				return false;
		} else if (!products.equals(other.products))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Inventory [inventory_id=" + inventory_id + ", products=" + products + ", merchants=" + merchants + "]";
	}
}