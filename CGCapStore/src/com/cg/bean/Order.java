package com.cg.bean;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="order_details")
public class Order {
	@Id
	private String order_id;
	private double total_amount;
	private String address;
	private String order_status; // shipped || in transit || out for delivery || delivered || out for
									// pickup||returned
	private Date order_date;
	private int quantity;
	private boolean status_of_transaction;
	private boolean refund_request;
	private Date refund_request_date;
	private Date eligible_return_date;

	@OneToOne
	@JoinColumn(name = "user_id")
	private User_details user;

	@OneToOne
	@JoinColumn(name = "coupon_id")
	private Coupon coupon;

	public Order() {
	}

	public Order(String order_id, double total_amount, String address, String order_status, Date order_date,
			int quantity, boolean status_of_transaction, boolean refund_request, Date refund_request_date,
			Date eligible_return_date, User_details user, Coupon coupon) {
		super();
		this.order_id = order_id;
		this.total_amount = total_amount;
		this.address = address;
		this.order_status = order_status;
		this.order_date = order_date;
		this.quantity = quantity;
		this.status_of_transaction = status_of_transaction;
		this.refund_request = refund_request;
		this.refund_request_date = refund_request_date;
		this.eligible_return_date = eligible_return_date;
		this.user = user;
		this.coupon = coupon;
	}

	public Order(double total_amount, String address, String order_status, Date order_date, int quantity,
			boolean status_of_transaction, boolean refund_request, Date refund_request_date, Date eligible_return_date,
			User_details user, Coupon coupon) {
		super();
		this.total_amount = total_amount;
		this.address = address;
		this.order_status = order_status;
		this.order_date = order_date;
		this.quantity = quantity;
		this.status_of_transaction = status_of_transaction;
		this.refund_request = refund_request;
		this.refund_request_date = refund_request_date;
		this.eligible_return_date = eligible_return_date;
		this.user = user;
		this.coupon = coupon;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ((coupon == null) ? 0 : coupon.hashCode());
		result = prime * result + ((eligible_return_date == null) ? 0 : eligible_return_date.hashCode());
		result = prime * result + ((order_date == null) ? 0 : order_date.hashCode());
		result = prime * result + ((order_id == null) ? 0 : order_id.hashCode());
		result = prime * result + ((order_status == null) ? 0 : order_status.hashCode());
		result = prime * result + quantity;
		result = prime * result + (refund_request ? 1231 : 1237);
		result = prime * result + ((refund_request_date == null) ? 0 : refund_request_date.hashCode());
		result = prime * result + (status_of_transaction ? 1231 : 1237);
		long temp;
		temp = Double.doubleToLongBits(total_amount);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((user == null) ? 0 : user.hashCode());
		return result;
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

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public boolean isStatus_of_transaction() {
		return status_of_transaction;
	}

	public void setStatus_of_transaction(boolean status_of_transaction) {
		this.status_of_transaction = status_of_transaction;
	}

	public boolean isRefund_request() {
		return refund_request;
	}

	public void setRefund_request(boolean refund_request) {
		this.refund_request = refund_request;
	}

	public Date getRefund_request_date() {
		return refund_request_date;
	}

	public void setRefund_request_date(Date refund_request_date) {
		this.refund_request_date = refund_request_date;
	}

	public Date getEligible_return_date() {
		return eligible_return_date;
	}

	public void setEligible_return_date(Date eligible_return_date) {
		this.eligible_return_date = eligible_return_date;
	}

	public User_details getUser() {
		return user;
	}

	public void setUser(User_details user) {
		this.user = user;
	}

	public Coupon getCoupon() {
		return coupon;
	}

	public void setCoupon(Coupon coupon) {
		this.coupon = coupon;
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
		if (coupon == null) {
			if (other.coupon != null)
				return false;
		} else if (!coupon.equals(other.coupon))
			return false;
		if (eligible_return_date == null) {
			if (other.eligible_return_date != null)
				return false;
		} else if (!eligible_return_date.equals(other.eligible_return_date))
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
		if (quantity != other.quantity)
			return false;
		if (refund_request != other.refund_request)
			return false;
		if (refund_request_date == null) {
			if (other.refund_request_date != null)
				return false;
		} else if (!refund_request_date.equals(other.refund_request_date))
			return false;
		if (status_of_transaction != other.status_of_transaction)
			return false;
		if (Double.doubleToLongBits(total_amount) != Double.doubleToLongBits(other.total_amount))
			return false;
		if (user == null) {
			if (other.user != null)
				return false;
		} else if (!user.equals(other.user))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Order [order_id=" + order_id + ", total_amount=" + total_amount + ", address=" + address
				+ ", order_status=" + order_status + ", order_date=" + order_date + ", quantity=" + quantity
				+ ", status_of_transaction=" + status_of_transaction + ", refund_request=" + refund_request
				+ ", refund_request_date=" + refund_request_date + ", eligible_return_date=" + eligible_return_date
				+ ", user=" + user + ", coupon=" + coupon + "]";
	}
}