package com.cg.bean;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Merchant {
	@Id
	private String merchant_id;
	private String merchant_name;
	private String email;
	private String contact;
	private String password;
	private String enc_password;
	private String merchant_type;
	private String address;
	
	public Merchant() {	}

	public Merchant(String merchant_name, String email, String contact, String password, String enc_password,
			String merchant_type, String address) {
		super();
		this.merchant_name = merchant_name;
		this.email = email;
		this.contact = contact;
		this.password = password;
		this.enc_password = enc_password;
		this.merchant_type = merchant_type;
		this.address = address;
	}

	public Merchant(String merchant_id, String merchant_name, String email, String contact, String password,
			String enc_password, String merchant_type, String address) {
		super();
		this.merchant_id = merchant_id;
		this.merchant_name = merchant_name;
		this.email = email;
		this.contact = contact;
		this.password = password;
		this.enc_password = enc_password;
		this.merchant_type = merchant_type;
		this.address = address;
	}

	public String getMerchant_name() {
		return merchant_name;
	}

	public void setMerchant_name(String merchant_name) {
		this.merchant_name = merchant_name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEnc_password() {
		return enc_password;
	}

	public void setEnc_password(String enc_password) {
		this.enc_password = enc_password;
	}

	public String getMerchant_type() {
		return merchant_type;
	}

	public void setMerchant_type(String merchant_type) {
		this.merchant_type = merchant_type;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ((contact == null) ? 0 : contact.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((enc_password == null) ? 0 : enc_password.hashCode());
		result = prime * result + ((merchant_name == null) ? 0 : merchant_name.hashCode());
		result = prime * result + ((merchant_type == null) ? 0 : merchant_type.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
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
		Merchant other = (Merchant) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (contact == null) {
			if (other.contact != null)
				return false;
		} else if (!contact.equals(other.contact))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (enc_password == null) {
			if (other.enc_password != null)
				return false;
		} else if (!enc_password.equals(other.enc_password))
			return false;
		if (merchant_name == null) {
			if (other.merchant_name != null)
				return false;
		} else if (!merchant_name.equals(other.merchant_name))
			return false;
		if (merchant_type == null) {
			if (other.merchant_type != null)
				return false;
		} else if (!merchant_type.equals(other.merchant_type))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Merchant [merchant_name=" + merchant_name + ", email=" + email + ", contact=" + contact + ", password="
				+ password + ", enc_password=" + enc_password + ", merchant_type=" + merchant_type + ", address="
				+ address + "]";
	}	
}