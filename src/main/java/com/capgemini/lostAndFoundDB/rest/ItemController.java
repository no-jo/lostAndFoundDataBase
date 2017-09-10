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

import com.capgemini.lostAndFoundDB.dao.ItemDao;
import com.capgemini.lostAndFoundDB.data.ItemSearchCriteria;
import com.capgemini.lostAndFoundDB.entity.Item;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/item")
@Transactional
public class ItemController {

	@Autowired
	private ItemDao itemDao;

	@RequestMapping("/found")
	public List<Item> getAllFound() {
		return itemDao.findAllFound();
	}

	@RequestMapping("/lost")
	public List<Item> getAllLost() {
		return itemDao.findAllLost();
	}

	@RequestMapping(path = "/", method = RequestMethod.POST)
	public List<Item> getItemsBySearchCriteria(@RequestBody ItemSearchCriteria conditions) {
		return itemDao.findBySearchCriteria(conditions);
	}
	
	@RequestMapping(path = "/id", method = RequestMethod.GET)
	public Item getItem(@RequestParam("id") Long id) {
		return itemDao.findOne(id);
	}

	@RequestMapping(path = "/id", method = RequestMethod.PUT)
	public Item addItem(@RequestBody Item newItem) {
		return itemDao.save(newItem);
	}
	
	@RequestMapping(path = "/id", method = RequestMethod.POST)
	public Item updateItem(@RequestBody Item updatedItem) {
		return itemDao.update(updatedItem);
	}
}
