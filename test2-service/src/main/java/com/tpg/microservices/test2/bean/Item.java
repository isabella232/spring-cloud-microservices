package com.tpg.microservices.test2.bean;

public class Item {

	private Integer id;
	private String itemNumber;
	private String itemName;

	public Item() {
		
	}
	
	public Item(Integer id, String itemNumber, String itemName) {
		super();
		this.id = id;
		this.itemNumber = itemNumber;
		this.itemName = itemName;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getItemNumber() {
		return itemNumber;
	}

	public void setItemNumber(String itemNumber) {
		this.itemNumber = itemNumber;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

}
