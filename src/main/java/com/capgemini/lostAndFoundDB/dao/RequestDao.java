package com.capgemini.lostAndFoundDB.dao;

import java.util.List;

import com.capgemini.lostAndFoundDB.entity.Request;

public interface RequestDao extends Dao<Request, Long> {

	List<Request> getWishlist(Long userId);

}
