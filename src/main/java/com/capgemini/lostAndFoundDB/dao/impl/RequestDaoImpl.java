package com.capgemini.lostAndFoundDB.dao.impl;

import org.springframework.stereotype.Repository;

import com.capgemini.lostAndFoundDB.dao.RequestDao;
import com.capgemini.lostAndFoundDB.entity.Request;

@Repository
public class RequestDaoImpl extends AbstractDao<Request, Long> implements RequestDao {

}
