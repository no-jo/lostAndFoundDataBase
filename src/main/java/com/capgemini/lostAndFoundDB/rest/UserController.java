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

import com.capgemini.lostAndFoundDB.dao.UserDao;
import com.capgemini.lostAndFoundDB.entity.User;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/user")
@Transactional
public class UserController {

		@Autowired
		private UserDao userDao;
		
		@RequestMapping(path = "/", method = RequestMethod.GET)
		public List<User> getAllUsers() {
			return userDao.findAll();
		}
		
		@RequestMapping(path = "/id", method = RequestMethod.GET)
		public User getUser(@RequestParam("id") Long id) {
			return userDao.findOne(id);
		}

		@RequestMapping(path = "/id", method = RequestMethod.PUT)
		public User addUser(@RequestBody User newUser) {
			return userDao.save(newUser);
		}
		
		@RequestMapping(path = "/id", method = RequestMethod.POST)
		public User updateUser(@RequestBody User updatedUser) {
			return userDao.update(updatedUser);
		}
}
