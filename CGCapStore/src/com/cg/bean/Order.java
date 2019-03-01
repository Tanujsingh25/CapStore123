package com.cg.bean;

import java.util.Date;

public class Order {
	private String order_id;
	private double total_amount;
	private String address;
	private String order_status; //shipped || in transit || out for delivery  || delivered || out for pickup||returned  
	private Date order_date;
	private int quantity;
	private boolean status_of_transaction;     
	private boolean refund_request;
	private Date refund_request_date;
	private Date eligible_return_date;
	public Order() {
		super();
	}
	public Order(String order_id, double total_amount, String address, String order_status, Date order_date) {
		super();
		this.order_id = order_id;
		this.total_amount = total_amount;
		this.address = address;
		this.order_status = order_status;
		this.order_date = order_date;
	}
	public String getOrder_id() {
		return order_id;
	}
	public void setOrder_id(String order_id) {
		this.order_id = order_id;
	}
	public double getTotal_amount() {
		return total_amount;
	}
	public void setTotal_amount(double total_amount) {
		this.total_amount = total_amount;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getOrder_status() {
		return order_status;
	}
	public void setOrder_status(String order_status) {
		this.order_status = order_status;
	}
	public Date getOrder_date() {
		return order_date;
	}
	public void setOrder_date(Date order_date) {
		this.order_date = order_date;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ((order_date == null) ? 0 : order_date.hashCode());
		result = prime * result + ((order_id == null) ? 0 : order_id.hashCode());
		result = prime * result + ((order_status == null) ? 0 : order_status.hashCode());
		long temp;
		temp = Double.doubleToLongBits(total_amount);
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
		Order other = (Order) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (order_date == null) {
			if (other.order_date != null)
				return false;
		} else if (!order_date.equals(other.order_date))
			return false;
		if (order_id == null) {
			if (other.order_id != null)
				return false;
		} else if (!order_id.equals(other.order_id))
			return false;
		if (order_status == null) {
			if (other.order_status != null)
				return false;
		} else if (!order_status.equals(other.order_status))
			return false;
		if (Double.doubleToLongBits(total_amount) != Double.doubleToLongBits(other.total_amount))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Order [order_id=" + order_id + ", total_amount=" + total_amount + ", address=" + address
				+ ", order_status=" + order_status + ", order_date=" + order_date + "]";
	}
}
