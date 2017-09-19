package com.capgemini.lostAndFoundDB.dao;

import java.util.List;

import com.capgemini.lostAndFoundDB.entity.User;

public interface UserDao extends Dao<User, Long> {

	List<User> findAllActive();

	List<User> findUsersByKey(User searchKey);

	List<User> getQueueByItem(Long itemid);

}
