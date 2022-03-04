package com;

import java.util.List;

public interface PersonDao {
	    
		Person userDetails(String userName);

		void register(Person personDetails);
		List<Tweet> findAll();
	}


