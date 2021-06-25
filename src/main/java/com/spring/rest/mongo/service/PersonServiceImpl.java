package com.spring.rest.mongo.service;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.spring.rest.mongo.dao.PersonDao;
import com.spring.rest.mongo.model.Person;

@Component
public class PersonServiceImpl implements Personservice {

	@Autowired
	PersonDao dao;

	@Override
	public void createPerson(List<Person> person) {
		dao.saveAll(person);

	}

	@Override
	public Collection<Person> getAllPerson() {

		return dao.findAll();
	}

	@Override
	public void updatePerson(Person person) {
		dao.save(person);

	}

	@Override
	public void deletePersonById(int id) {
		dao.deleteById(id);

	}
}
