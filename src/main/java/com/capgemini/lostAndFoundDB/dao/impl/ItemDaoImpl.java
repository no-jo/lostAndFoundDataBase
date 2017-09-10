package com.capgemini.lostAndFoundDB.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.capgemini.lostAndFoundDB.dao.ItemDao;
import com.capgemini.lostAndFoundDB.data.ItemSearchCriteria;
import com.capgemini.lostAndFoundDB.entity.Item;
import com.capgemini.lostAndFoundDB.entity.QItem;
import com.querydsl.jpa.impl.JPAQuery;

@Repository
public class ItemDaoImpl extends AbstractDao<Item, Long> implements ItemDao {

	@Override
	public List<Item> findAllFound() {
		QItem item = QItem.item;
		JPAQuery<Item> query = new JPAQuery<Item>(entityManager).from(item).where(item.lostDate.isNull());
		return query.fetch();
	}

	@Override
	public List<Item> findAllLost() {
		QItem item = QItem.item;
		JPAQuery<Item> query = new JPAQuery<Item>(entityManager).from(item).where(item.foundDate.isNull());
		return query.fetch();
	}

	@Override
	public List<Item> findBySearchCriteria(ItemSearchCriteria cond) {
		// TODO create method when filtering is done via backend, for now return all
		return findAll();
	}

}
