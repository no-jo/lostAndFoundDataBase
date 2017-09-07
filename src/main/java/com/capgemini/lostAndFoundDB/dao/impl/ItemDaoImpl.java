package com.capgemini.lostAndFoundDB.dao.impl;

import org.springframework.stereotype.Repository;

import com.capgemini.lostAndFoundDB.dao.ItemDao;
import com.capgemini.lostAndFoundDB.entity.Item;

@Repository
public class ItemDaoImpl extends AbstractDao<Item, Long> implements ItemDao {

}
