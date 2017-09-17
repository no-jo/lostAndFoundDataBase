package com.capgemini.lostAndFoundDB.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.capgemini.lostAndFoundDB.dao.ItemDao;
import com.capgemini.lostAndFoundDB.data.ItemSearchCriteria;
import com.capgemini.lostAndFoundDB.entity.Item;
import com.capgemini.lostAndFoundDB.entity.QItem;
import com.capgemini.lostAndFoundDB.entity.QRequest;
import com.capgemini.lostAndFoundDB.enums.IsActive;
import com.querydsl.jpa.impl.JPAQuery;

@Repository
public class ItemDaoImpl extends AbstractDao<Item, Long> implements ItemDao {

	@Override
	public List<Item> findAllFound() {
		QItem item = QItem.item;
		JPAQuery<Item> query = new JPAQuery<Item>(entityManager)
				.from(item).where(item.lostDate.isNull().and(item.isActive.eq(IsActive.ACTIVE)));
		return query.fetch();
	}

	@Override
	public List<Item> findAllLost() {
		QItem item = QItem.item;
		JPAQuery<Item> query = new JPAQuery<Item>(entityManager)
				.from(item).where(item.foundDate.isNull().and(item.isActive.eq(IsActive.ACTIVE)));
		return query.fetch();
	}

	@Override
	public List<Item> findBySearchCriteria(ItemSearchCriteria cond) {
		QItem item = QItem.item;
		JPAQuery<Item> query = new JPAQuery<Item>(entityManager)
				.from(item).where(item.isActive.eq(IsActive.ACTIVE));
		if (cond.getSeekLost()) {
			query.where(item.foundDate.isNull());
		} else {
			query.where(item.lostDate.isNull());
		}
		if (null != cond.getNameLike()) {
			query.where(item.name.like('%'+cond.getNameLike()+'%'));
		}
		if (null != cond.getLostDateAfter()) {
			query.where(item.lostDate.after(cond.getLostDateAfter()));
		}
		if (null != cond.getLostDateBefore()) {
			query.where(item.lostDate.before(cond.getLostDateBefore()));
		}
		if (null != cond.getFoundDateAfter()) {
			query.where(item.foundDate.after(cond.getFoundDateAfter()));
		}
		if (null != cond.getFoundDateBefore()) {
			query.where(item.foundDate.before(cond.getFoundDateBefore()));
		}
		if (null != cond.getCreationDateAfter()) {
			query.where(item.creationDate.after(cond.getCreationDateAfter()));
		}
		if (null != cond.getCreationDateBefore()) {
			query.where(item.creationDate.before(cond.getCreationDateBefore()));
		}
		if (null != cond.getColorLike()) {
			query.where(item.color.like('%'+cond.getColorLike()+'%'));
		}
		if (null != cond.getCategoryLike()) {
			query.where(item.category.like('%'+cond.getCategoryLike()+'%'));
		}
		if (null != cond.getMaterialLike()) {
			query.where(item.material.like('%'+cond.getMaterialLike()+'%'));
		}
		if (null != cond.getSizeIs()) {
			query.where(item.size.eq(cond.getSizeIs()));
		}
		return query.fetch();
	}

	@Override
	public List<Item> getWishlistByUser(Long userId) {
		QRequest request = QRequest.request;
		JPAQuery<Item> query = new JPAQuery<Item>(entityManager);		
		query.select(request.item).from(request).where(request.user.id.eq(userId));
		return query.fetch();
	}

}
