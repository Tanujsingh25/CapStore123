package com.cg.bean;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Coupon {
	@Id
	private String coupon_code;
	private double discount_value;
	private Date coupon_start_date;
	private Date coupon_expiry_date;

	public Coupon() {
	}

	public Coupon(String coupon_code, double discount_value, Date coupon_start_date, Date coupon_expiry_date) {
		super();
		this.coupon_code = coupon_code;
		this.discount_value = discount_value;
		this.coupon_start_date = coupon_start_date;
		this.coupon_expiry_date = coupon_expiry_date;
	}

	public Coupon(double discount_value, Date coupon_start_date, Date coupon_expiry_date) {
		super();
		this.discount_value = discount_value;
		this.coupon_start_date = coupon_start_date;
		this.coupon_expiry_date = coupon_expiry_date;
	}

	public String getCoupon_code() {
		return coupon_code;
	}

	public void setCoupon_code(String coupon_code) {
		this.coupon_code = coupon_code;
	}

	public double getDiscount_value() {
		return discount_value;
	}

	public void setDiscount_value(double discount_value) {
		this.discount_value = discount_value;
	}

	public Date getCoupon_start_date() {
		return coupon_start_date;
	}

	public void setCoupon_start_date(Date coupon_start_date) {
		this.coupon_start_date = coupon_start_date;
	}

	public Date getCoupon_expiry_date() {
		return coupon_expiry_date;
	}

	public void setCoupon_expiry_date(Date coupon_expiry_date) {
		this.coupon_expiry_date = coupon_expiry_date;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((coupon_code == null) ? 0 : coupon_code.hashCode());
		result = prime * result + ((coupon_expiry_date == null) ? 0 : coupon_expiry_date.hashCode());
		result = prime * result + ((coupon_start_date == null) ? 0 : coupon_start_date.hashCode());
		long temp;
		temp = Double.doubleToLongBits(discount_value);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		Coupon other = (Coupon) obj;
		if (coupon_code == null) {
			if (other.coupon_code != null)
				return false;
		} else if (!coupon_code.equals(other.coupon_code))
			return false;
		if (coupon_expiry_date == null) {
			if (other.coupon_expiry_date != null)
				return false;
		} else if (!coupon_expiry_date.equals(other.coupon_expiry_date))
			return false;
		if (coupon_start_date == null) {
			if (other.coupon_start_date != null)
				return false;
		} else if (!coupon_start_date.equals(other.coupon_start_date))
			return false;
		if (Double.doubleToLongBits(discount_value) != Double.doubleToLongBits(other.discount_value))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Coupon [coupon_code=" + coupon_code + ", discount_value=" + discount_value + ", coupon_start_date="
				+ coupon_start_date + ", coupon_expiry_date=" + coupon_expiry_date + "]";
	}
}