package com.spring.rest.mongo.service;

import java.util.Collection;
import java.util.List;

import org.springframework.stereotype.Component;

import com.spring.rest.mongo.model.Person;
@Component
public interface Personservice {

	public void createPerson(List<Person> person);
	public Collection<Person> getAllPerson();
	public void deletePersonById(int id);
	public void updatePerson(Person emp);
}
