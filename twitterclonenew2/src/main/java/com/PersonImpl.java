package com;

import java.util.List;

public class PersonImpl implements PersonIn {
	private PersonDao person=new PersonDaoImpl();
	
	@Override
	public void register(Person personDetails) {
		person.register(personDetails);
		
	}
	@Override
	public Person userDetails(String userName) {
		// TODO Auto-generated method stub
		return person.userDetails(userName);
	}
	@Override
	public List<Tweet> findAll() {
		// TODO Auto-generated method stub
		return person.findAll();
	}
	

}
