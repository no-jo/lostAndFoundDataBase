package com.capgemini.lostAndFoundDB.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.capgemini.lostAndFoundDB.enums.ItemSize;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Item extends AbstractEntity {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column
	@Temporal (TemporalType.DATE)
	private Date dateLost;
	
	@Column
	@Temporal (TemporalType.DATE)
	private Date dateFound;
	
	@Column (length = 30)
	private String name;
	
	@Column
	private String description;
	
	@Column
	@Enumerated (EnumType.STRING)
	private ItemSize size;
	
	@Column (length = 20)
	private String color;
	
	@Column
	private String material;
	
	@Column
	private String category;
	
	@Column
	private String photoURL;
	
	//@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property="id", scope=Request.class)
	@JsonIgnore
	@OneToMany (mappedBy = "item", cascade = CascadeType.REMOVE)
	private List<Request> resquests;

	public Date getDateLost() {
		return dateLost;
	}

	public void setDateLost(Date dateLost) {
		this.dateLost = dateLost;
	}

	public Date getDateFound() {
		return dateFound;
	}

	public void setDateFound(Date dateFound) {
		this.dateFound = dateFound;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public ItemSize getSize() {
		return size;
	}

	public void setSize(ItemSize size) {
		this.size = size;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getPhotoURL() {
		return photoURL;
	}

	public void setPhotoURL(String photoURL) {
		this.photoURL = photoURL;
	}

	public List<Request> getResquests() {
		return resquests;
	}

	public void setResquests(List<Request> resquests) {
		this.resquests = resquests;
	}
}
