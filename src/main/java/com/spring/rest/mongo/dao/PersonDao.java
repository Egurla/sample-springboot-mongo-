package com.spring.rest.mongo.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.spring.rest.mongo.model.Person;
	
@Repository
public interface PersonDao extends MongoRepository<Person, Integer> {



	


}
