package com.capgemini.lostAndFoundDB.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.lostAndFoundDB.dao.RequestDao;
import com.capgemini.lostAndFoundDB.entity.Request;
import com.capgemini.lostAndFoundDB.enums.Status;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/request")
@Transactional
public class RequestController {

		@Autowired
		private RequestDao requestDao;
		
		@RequestMapping(path = "/", method = RequestMethod.GET)
		public List<Request> getAllRequests() {
			return requestDao.findAll();
		}
		
		@RequestMapping(path = "/id", method = RequestMethod.GET)
		public Request getRequest(@RequestParam("id") Long id) {
			return requestDao.findOne(id);
		}

		@RequestMapping(path = "/id", method = RequestMethod.PUT)
		public Request addRequest(@RequestBody Request newRequest) {
			newRequest.setStatus(Status.PENDING);
			return requestDao.save(newRequest);
		}
		
		@RequestMapping(path = "/id", method = RequestMethod.POST)
		public Request updateRequest(@RequestBody Request updatedRequest) {
			return requestDao.update(updatedRequest);
		}
		
		@RequestMapping(path = "/id", method = RequestMethod.DELETE)
		public Request deleteItem(@RequestParam("id") Long id) {
			Request updatedRequest = requestDao.findOne(id);
			updatedRequest.setStatus(Status.INACTIVE);
			return requestDao.update(updatedRequest);
		}
		
		@RequestMapping(path = "/user", method = RequestMethod.GET)
		public List<Request> getRequestsByUser(@RequestParam("id") Long userId) {
			return requestDao.getWishlist(userId);
		}
}