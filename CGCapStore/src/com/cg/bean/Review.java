package com.cg.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Review {
	@Id
	private String review_id;
	private String review;
	private int rating;

	@OneToOne
	@JoinColumn(name = "product_id")
	private Product product;

	public Review() {
	}

	public Review(String review_id, String review, int rating, Product product) {
		super();
		this.review_id = review_id;
		this.review = review;
		this.rating = rating;
		this.product = product;
	}

	public Review(String review, int rating, Product product) {
		super();
		this.review = review;
		this.rating = rating;
		this.product = product;
	}

	public String getReview_id() {
		return review_id;
	}

	public void setReview_id(String review_id) {
		this.review_id = review_id;
	}

	public String getReview() {
		return review;
	}

	public void setReview(String review) {
		this.review = review;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((product == null) ? 0 : product.hashCode());
		result = prime * result + rating;
		result = prime * result + ((review == null) ? 0 : review.hashCode());
		result = prime * result + ((review_id == null) ? 0 : review_id.hashCode());
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
		Review other = (Review) obj;
		if (product == null) {
			if (other.product != null)
				return false;
		} else if (!product.equals(other.product))
			return false;
		if (rating != other.rating)
			return false;
		if (review == null) {
			if (other.review != null)
				return false;
		} else if (!review.equals(other.review))
			return false;
		if (review_id == null) {
			if (other.review_id != null)
				return false;
		} else if (!review_id.equals(other.review_id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Review [review_id=" + review_id + ", review=" + review + ", rating=" + rating + ", product=" + product
				+ "]";
	}
}