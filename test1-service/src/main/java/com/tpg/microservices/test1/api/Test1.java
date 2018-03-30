package com.tpg.microservices.test1.api;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tpg.microservices.test1.bean.Item;
import com.tpg.microservices.test1.repository.ItemRepository;

@RestController
public class Test1 {

	private List<Item> items;

	@Autowired
	ItemRepository itemRepository;

	public Test1() {
		items = new ArrayList<>();
	}

	@RequestMapping("/")
	public String ready() {
		return "Test1 Application is ready to serve you.";
	}

	@RequestMapping("/items")
	public List<Item> findAll() {
		items = new ArrayList<>();
		Iterable<Item> findAll = itemRepository.findAll();
		for (Item item : findAll) {
			items.add(item);
		}
		return items;
	}

	@RequestMapping("/item/{itemNumber}")
	public Item findByNumber(@PathVariable("itemNumber") String number) {
		items = new ArrayList<>();
		Iterable<Item> findAll = itemRepository.findAll();
		for (Item item : findAll) {
			items.add(item);
		}
		return items.stream().filter(it -> it.getItemNumber().equals(number)).findFirst().get();
	}
}
