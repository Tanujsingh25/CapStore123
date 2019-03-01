package com.cg.bean;

public class Product {
	private String product_id;
	private String product_name;
	private String description;
	private double price;
	private String category;
	private String subcategory;
	private int sold_quantity;
	private int avail_stock;
	private float discount;
	private int no_of_views;
	public Product() {	}
	
	public Product(String product_id, String product_name, String description, double price, String category,
			String subcategory, int sold_quantity, int avail_stock, float discount, int no_of_views) {
		super();
		this.product_id = product_id;
		this.product_name = product_name;
		this.description = description;
		this.price = price;
		this.category = category;
		this.subcategory = subcategory;
		this.sold_quantity = sold_quantity;
		this.avail_stock = avail_stock;
		this.discount = discount;
		this.no_of_views = no_of_views;
	}

	public String getProduct_id() {
		return product_id;
	}

	public void setProduct_id(String product_id) {
		this.product_id = product_id;
	}

	public String getProduct_name() {
		return product_name;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getSubcategory() {
		return subcategory;
	}

	public void setSubcategory(String subcategory) {
		this.subcategory = subcategory;
	}

	public int getSold_quantity() {
		return sold_quantity;
	}

	public void setSold_quantity(int sold_quantity) {
		this.sold_quantity = sold_quantity;
	}

	public int getAvail_stock() {
		return avail_stock;
	}

	public void setAvail_stock(int avail_stock) {
		this.avail_stock = avail_stock;
	}

	public float getDiscount() {
		return discount;
	}

	public void setDiscount(float discount) {
		this.discount = discount;
	}

	public int getNo_of_views() {
		return no_of_views;
	}

	public void setNo_of_views(int no_of_views) {
		this.no_of_views = no_of_views;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + avail_stock;
		result = prime * result + ((category == null) ? 0 : category.hashCode());
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + Float.floatToIntBits(discount);
		result = prime * result + no_of_views;
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((product_id == null) ? 0 : product_id.hashCode());
		result = prime * result + ((product_name == null) ? 0 : product_name.hashCode());
		result = prime * result + sold_quantity;
		result = prime * result + ((subcategory == null) ? 0 : subcategory.hashCode());
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
		Product other = (Product) obj;
		if (avail_stock != other.avail_stock)
			return false;
		if (category == null) {
			if (other.category != null)
				return false;
		} else if (!category.equals(other.category))
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (Float.floatToIntBits(discount) != Float.floatToIntBits(other.discount))
			return false;
		if (no_of_views != other.no_of_views)
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		if (product_id == null) {
			if (other.product_id != null)
				return false;
		} else if (!product_id.equals(other.product_id))
			return false;
		if (product_name == null) {
			if (other.product_name != null)
				return false;
		} else if (!product_name.equals(other.product_name))
			return false;
		if (sold_quantity != other.sold_quantity)
			return false;
		if (subcategory == null) {
			if (other.subcategory != null)
				return false;
		} else if (!subcategory.equals(other.subcategory))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Product [product_id=" + product_id + ", product_name=" + product_name + ", description=" + description
				+ ", price=" + price + ", category=" + category + ", subcategory=" + subcategory + ", sold_quantity="
				+ sold_quantity + ", avail_stock=" + avail_stock + ", discount=" + discount + ", no_of_views="
				+ no_of_views + "]";
	}
	
	
	
}
