package com.capgemini.lostAndFoundDB.dao;

import java.util.List;

import com.capgemini.lostAndFoundDB.data.ItemSearchCriteria;
import com.capgemini.lostAndFoundDB.entity.Item;

public interface ItemDao extends Dao<Item, Long> {

	List<Item> findAllFound();
	List<Item> findAllLost();
	
	List<Item> findBySearchCriteria(ItemSearchCriteria cond);
	List<Item> getWishlistByUser(Long userId);
}
