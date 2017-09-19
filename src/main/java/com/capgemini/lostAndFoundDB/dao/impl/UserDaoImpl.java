package com.capgemini.lostAndFoundDB.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.capgemini.lostAndFoundDB.entity.QRequest;
import com.capgemini.lostAndFoundDB.entity.QUser;
import com.capgemini.lostAndFoundDB.entity.User;
import com.capgemini.lostAndFoundDB.enums.IsActive;
import com.capgemini.lostAndFoundDB.enums.Status;
import com.querydsl.jpa.impl.JPAQuery;

@Repository
public class UserDaoImpl extends AbstractDao<User, Long> implements com.capgemini.lostAndFoundDB.dao.UserDao {

	@Override
	public List<User> findAllActive() {
		QUser user = QUser.user;
		JPAQuery<User> query = new JPAQuery<User>(entityManager);
		return query.from(user).where(user.activity.eq(IsActive.ACTIVE)).fetch();
	}

	@Override
	public List<User> findUsersByKey(User searchKey) {
		QUser user = QUser.user;
		JPAQuery<User> query = new JPAQuery<User>(entityManager);
		query.from(user).where(user.activity.eq(IsActive.ACTIVE));
		if (null != searchKey.getLogin()) {
			query.where(user.login.like("%" + searchKey.getLogin() + "%"));
		}
		if (null != searchKey.getEmail()) {
			query.where(user.email.like("%" + searchKey.getEmail() + "%"));
		}
		if (null != searchKey.getFirstName()) {
			query.where(user.firstName.like("%" + searchKey.getFirstName() + "%"));
		}
		if (null != searchKey.getLastName()) {
			query.where(user.lastName.like("%" + searchKey.getLastName() + "%"));
		}
		return query.fetch();
	}
	
	@Override
		public List<User> getQueueByItem(Long itemid) {
		QRequest request = QRequest.request;
		JPAQuery<User> query = new JPAQuery<User>(entityManager);		
		query.select(request.user).from(request).where(request.item.id.eq(itemid)
				.and(request.status.eq(Status.PENDING))).orderBy(request.creationDate.desc());
		return query.fetch();
	}

}
