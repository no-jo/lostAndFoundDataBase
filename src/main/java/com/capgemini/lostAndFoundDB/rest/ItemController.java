package com.capgemini.lostAndFoundDB.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.lostAndFoundDB.dao.ItemDao;
import com.capgemini.lostAndFoundDB.entity.Item;

@RestController
@RequestMapping ("/item")
public class ItemController {
	
	@Autowired
	private ItemDao itemDao;
	
	@RequestMapping ("/")
	public List<Item> getAllItems() {
		return itemDao.findAll();
	}
	
	@RequestMapping(method = RequestMethod.GET)
		public Item getItem(@RequestParam("id") Long id) {
		return itemDao.findOne(id);
	}
}
