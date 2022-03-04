package com;

import java.util.List;

public interface PersonIn {
	// list all products
	Person userDetails(String userName);
	
	void register(Person personDetails);
	List<Tweet> findAll();
}