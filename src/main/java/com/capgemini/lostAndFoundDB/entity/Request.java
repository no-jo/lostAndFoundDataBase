package com.capgemini.lostAndFoundDB.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.capgemini.lostAndFoundDB.enums.Rating;
import com.capgemini.lostAndFoundDB.enums.Status;

@Entity
public class Request extends AbstractEntity {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@JoinColumn
	@ManyToOne
	private User user;
	
	@JoinColumn
	@ManyToOne
	private Item item;
	
	@Column
	@Enumerated (EnumType.STRING)
	private Status status;
	
	@Column
	private String userComment;
	
	@Column
	@Enumerated (EnumType.ORDINAL)
	private Rating rating;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public String getUserComment() {
		return userComment;
	}

	public void setUserComment(String userComment) {
		this.userComment = userComment;
	}

	public Rating getRating() {
		return rating;
	}

	public void setRating(Rating rating) {
		this.rating = rating;
	}
}
