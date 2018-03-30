package com.tpg.microservices.test2.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tpg.microservices.test2.bean.Item;
import com.tpg.microservices.test2.intercommunication.ItemService;

@RestController
public class Test2 {

	@Autowired
	private ItemService itemService;

	@RequestMapping("/")
	public String ready() {
		return "Welcome!!! Test2 Application is ready to serve you.";
	}

	@RequestMapping("/test1/items")
	public String interServiceCallItems() {
		return itemService.callItems();
	}

	@RequestMapping("/test1/item/{itemNumber}")
	public Item interServiceCallAccountsByAccountNumber(@PathVariable("itemNumber") String itemNumber) {
		Item item = itemService.callItemByItemNumber(itemNumber);		
		return item;
	}

}
