package com.tpg.microservices.test1.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.tpg.microservices.test1.bean.Item;

@RepositoryRestResource
public interface ItemRepository extends CrudRepository<Item, Integer> {

}
