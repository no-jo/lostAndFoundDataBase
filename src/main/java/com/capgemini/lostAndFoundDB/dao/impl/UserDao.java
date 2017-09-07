package com.capgemini.lostAndFoundDB.dao.impl;

import org.springframework.stereotype.Repository;

import com.capgemini.lostAndFoundDB.entity.User;

@Repository
public class UserDao extends AbstractDao<User, Long> implements com.capgemini.lostAndFoundDB.dao.UserDao {

}
