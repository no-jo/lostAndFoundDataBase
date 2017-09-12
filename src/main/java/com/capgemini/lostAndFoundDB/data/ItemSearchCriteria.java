package com.capgemini.lostAndFoundDB.data;

import java.util.Date;

import com.capgemini.lostAndFoundDB.enums.ItemSize;
import com.capgemini.lostAndFoundDB.enums.Rating;
import com.capgemini.lostAndFoundDB.enums.Status;

public class ItemSearchCriteria {
	private Long idIs = null;
	private String nameLike = null;
	private Date lostDateAfter = null;
	private Date lostDateBefore = null;
	private Date foundDateAfter = null;
	private Date foundDateBefore = null;
	private Date creationDateAfter = null;
	private Date creationDateBefore = null;
	private ItemSize sizeIs = null;
	private String categoryLike = null;
	private String colorLike = null;
	private Rating ratingHigherThan = null;
	private Status statusIs = null;
	private String materialLike = null;
	public Long getIdIs() {
		return idIs;
	}
	public void setIdIs(Long idIs) {
		this.idIs = idIs;
	}
	public String getNameLike() {
		return nameLike;
	}
	public void setNameLike(String nameLike) {
		this.nameLike = nameLike;
	}
	public Date getLostDateAfter() {
		return lostDateAfter;
	}
	public void setLostDateAfter(Date lostDateAfter) {
		this.lostDateAfter = lostDateAfter;
	}
	public Date getLostDateBefore() {
		return lostDateBefore;
	}
	public void setLostDateBefore(Date lostDateBefore) {
		this.lostDateBefore = lostDateBefore;
	}
	public Date getFoundDateAfter() {
		return foundDateAfter;
	}
	public void setFoundDateAfter(Date foundDateAfter) {
		this.foundDateAfter = foundDateAfter;
	}
	public Date getFoundDateBefore() {
		return foundDateBefore;
	}
	public void setFoundDateBefore(Date foundDateBefore) {
		this.foundDateBefore = foundDateBefore;
	}
	public Date getCreationDateAfter() {
		return creationDateAfter;
	}
	public void setCreationDateAfter(Date creationDateAfter) {
		this.creationDateAfter = creationDateAfter;
	}
	public Date getCreationDateBefore() {
		return creationDateBefore;
	}
	public void setCreationDateBefore(Date creationDateBefore) {
		this.creationDateBefore = creationDateBefore;
	}
	public ItemSize getSizeIs() {
		return sizeIs;
	}
	public void setSizeIs(ItemSize sizeIs) {
		this.sizeIs = sizeIs;
	}
	public String getCategoryLike() {
		return categoryLike;
	}
	public void setCategoryLike(String categoryLike) {
		this.categoryLike = categoryLike;
	}
	public String getColorLike() {
		return colorLike;
	}
	public void setColorLike(String colorLike) {
		this.colorLike = colorLike;
	}
	public Rating getRatingHigherThan() {
		return ratingHigherThan;
	}
	public void setRatingHigherThan(Rating ratingHigherThan) {
		this.ratingHigherThan = ratingHigherThan;
	}
	public Status getStatusIs() {
		return statusIs;
	}
	public void setStatusIs(Status statusIs) {
		this.statusIs = statusIs;
	}
	public String getMaterialLike() {
		return materialLike;
	}
	public void setMaterialLike(String materialLike) {
		this.materialLike = materialLike;
	}
}
