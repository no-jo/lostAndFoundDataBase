package com.capgemini.lostAndFoundDB.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.capgemini.lostAndFoundDB.dao.RequestDao;
import com.capgemini.lostAndFoundDB.entity.QRequest;
import com.capgemini.lostAndFoundDB.entity.Request;
import com.capgemini.lostAndFoundDB.enums.Status;
import com.querydsl.jpa.impl.JPAQuery;

@Repository
public class RequestDaoImpl extends AbstractDao<Request, Long> implements RequestDao {

	@Override
	public List<Request> getWishlist(Long userId) {
		QRequest request = QRequest.request;
		JPAQuery<Request> query = new JPAQuery<Request>(entityManager);		
		query.from(request).where(request.user.id.eq(userId)
				.and(request.status.eq(Status.PENDING))).orderBy(request.creationDate.desc());
		return query.fetch();
	}

}
