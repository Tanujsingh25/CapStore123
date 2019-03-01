package com.cg.bean;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name="user_details")
public class User {
	@Id
	private String email;
	@NotEmpty
	private String first_name;
	@NotEmpty
	private String last_name;
	@NotEmpty
	private String contact;
	@NotEmpty
	private String password;
	private String enc_password;
	@NotEmpty
	private String user_type;
	@OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
	@JoinColumn(name="address_id")
	private List<Address> address;
	@OneToOne(mappedBy="user",cascade=CascadeType.ALL)
	@JoinColumn(name="cart_id")
	private Cart cart;
	public User() {	}

	public User(String first_name, String last_name, String email, String contact, String password, String enc_password,
			String user_type) {
		super();
		this.first_name = first_name;
		this.last_name = last_name;
		this.email = email;
		this.contact = contact;
		this.password = password;
		this.enc_password = enc_password;
		this.user_type = user_type;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
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

	public String getUser_type() {
		return user_type;
	}

	public void setUser_type(String user_type) {
		this.user_type = user_type;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((contact == null) ? 0 : contact.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((enc_password == null) ? 0 : enc_password.hashCode());
		result = prime * result + ((first_name == null) ? 0 : first_name.hashCode());
		result = prime * result + ((last_name == null) ? 0 : last_name.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((user_type == null) ? 0 : user_type.hashCode());
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
		User other = (User) obj;
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
		if (first_name == null) {
			if (other.first_name != null)
				return false;
		} else if (!first_name.equals(other.first_name))
			return false;
		if (last_name == null) {
			if (other.last_name != null)
				return false;
		} else if (!last_name.equals(other.last_name))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (user_type == null) {
			if (other.user_type != null)
				return false;
		} else if (!user_type.equals(other.user_type))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "User [email=" + email + ", first_name=" + first_name + ", last_name=" + last_name + ", contact="
				+ contact + ", password=" + password + ", enc_password=" + enc_password + ", user_type=" + user_type
				+ "]";
	}
}
