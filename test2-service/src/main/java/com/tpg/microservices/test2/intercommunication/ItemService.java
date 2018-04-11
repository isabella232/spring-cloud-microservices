package com.tpg.microservices.test2.intercommunication;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.tpg.microservices.test2.bean.Item;

@FeignClient("test1-service")
public interface ItemService {
	@RequestMapping(method = RequestMethod.GET, value = "/items")
	String callItems();

	@RequestMapping(method = RequestMethod.GET, value = "/item/{itemNumber}")
	Item callItemByItemNumber(@PathVariable("itemNumber") String number);
}
