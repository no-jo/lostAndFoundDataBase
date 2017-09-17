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
import com.capgemini.lostAndFoundDB.enums.IsActive;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/user")
@Transactional
public class UserController {

		@Autowired
		private UserDao userDao;
		
		@RequestMapping(path = "/", method = RequestMethod.GET)
		public List<User> getAllUsers() {
			return userDao.findAllActive();
		}
		
		@RequestMapping(path = "/", method = RequestMethod.POST)
		public List<User> getUsersByKey(@RequestBody User search) {
			return userDao.findUsersByKey(search);
		}
		
		@RequestMapping(path = "/id", method = RequestMethod.GET)
		public User getUser(@RequestParam("id") Long id) {
			return userDao.findOne(id);
		}

		@RequestMapping(path = "/id", method = RequestMethod.PUT)
		public User addUser(@RequestBody User newUser) {
			newUser.setActivity(IsActive.ACTIVE);
			return userDao.save(newUser);
		}
		
		@RequestMapping(path = "/id", method = RequestMethod.POST)
		public User updateUser(@RequestBody User updatedUser) {
			return userDao.update(updatedUser);
		}
		
		@RequestMapping(path = "/id", method = RequestMethod.DELETE)
		public User deleteUser(@RequestParam("id") Long id) {
			User updatedUser = userDao.findOne(id);
			updatedUser.setActivity(IsActive.INACTIVE);
			return userDao.update(updatedUser);
		}
}
