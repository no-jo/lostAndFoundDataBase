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
	
	public ItemSearchCriteria(Long idIs, String nameLike, Date lostDateAfter, Date lostDateBefore, Date foundDateAfter,
			Date foundDateBefore, Date creationDateAfter, Date creationDateBefore, ItemSize sizeIs, String categoryLike,
			String colorLike, Rating ratingHigherThan, Status statusIs, String materialLike) {
		this.idIs = idIs;
		this.nameLike = nameLike;
		this.lostDateAfter = lostDateAfter;
		this.lostDateBefore = lostDateBefore;
		this.foundDateAfter = foundDateAfter;
		this.foundDateBefore = foundDateBefore;
		this.creationDateAfter = creationDateAfter;
		this.creationDateBefore = creationDateBefore;
		this.sizeIs = sizeIs;
		this.categoryLike = categoryLike;
		this.colorLike = colorLike;
		this.ratingHigherThan = ratingHigherThan;
		this.statusIs = statusIs;
		this.materialLike = materialLike;
	}	
}
