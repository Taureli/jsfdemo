package com.example.jsfdemo.service;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.example.jsfdemo.domain.Person;

@Stateless
public class PersonManager {
	
	@PersistenceContext
    EntityManager em;
	
	private List<Person> db = new ArrayList<Person>();

	public void addPerson(Person person) {
//		Person newPerson = new Person();
//
//		newPerson.setFirstName(person.getFirstName());
//		newPerson.setZipCode(person.getZipCode());
//		newPerson.setPin(person.getPin());
//		newPerson.setDateOfBirth(person.getDateOfBirth());
//		newPerson.setMarried(person.isMarried());
//		newPerson.setWeight(person.getWeight());
//		newPerson.setNumOfChildren(person.getNumOfChildren());

		//db.add(newPerson);
		
		person.setFirstName(person.getFirstName());
		person.setZipCode(person.getZipCode());
		person.setPin(person.getPin());
		person.setDateOfBirth(person.getDateOfBirth());
		person.setMarried(person.isMarried());
		person.setWeight(person.getWeight());
		person.setNumOfChildren(person.getNumOfChildren());
		
		em.persist(person);
	}

	// Removes the person with given PIN
	public void deletePerson(Person person) {
		Person personToRemove = null;
		for (Person p : db) {
			if (person.getPin().equals(p.getPin())) {
				personToRemove = p;
				break;
			}
		}
		if (personToRemove != null)
			db.remove(personToRemove);
	}

	public List<Person> getAllPersons() {
		return db;
	}
}
