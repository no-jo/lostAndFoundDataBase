package com.capgemini.lostAndFoundDB.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.OneToMany;

import com.capgemini.lostAndFoundDB.enums.IsActive;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class User extends AbstractEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column (unique = true, length = 20)	
	private String login;
	
	@Column (length = 100)
	private String email;
	
	@Column (length = 50)
	private String firstName;
	
	@Column (length = 150)
	private String lastName;
	
	@Column
	@Enumerated (EnumType.STRING)
	private IsActive activity;
	
	@JsonIgnore
	@OneToMany (mappedBy = "user", cascade = CascadeType.REMOVE)
	private List<Request> requests;

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public IsActive getActivity() {
		return activity;
	}

	public void setActivity(IsActive activity) {
		this.activity = activity;
	}

	public List<Request> getRequests() {
		return requests;
	}

	public void setRequests(List<Request> requests) {
		this.requests = requests;
	}
}
