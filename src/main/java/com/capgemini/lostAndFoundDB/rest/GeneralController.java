package com.capgemini.lostAndFoundDB.rest;

import java.util.Arrays;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.lostAndFoundDB.enums.ItemSize;
import com.capgemini.lostAndFoundDB.enums.Status;

@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/meta")
@RestController
public class GeneralController {
	
	@RequestMapping("/size")
	public String[] getItemSizes() {
		return getNames(ItemSize.class);
	}
	
	@RequestMapping("/status")
	public String[] getRequestStatuses() {
		return getNames(Status.class);
	}
	
	
	private static String[] getNames(Class<? extends Enum<?>> e) {
	    return Arrays.stream(e.getEnumConstants()).map(Enum::name).toArray(String[]::new);
	}
}
