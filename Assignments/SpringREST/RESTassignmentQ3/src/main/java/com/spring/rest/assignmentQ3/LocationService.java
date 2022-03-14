package com.spring.rest.assignmentQ3;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;


@Service
public class LocationService {
	
	
	private List<Address> location = new ArrayList <> (Arrays.asList( new Address(530001,"Andhra","Visakhaptnam","India"),
			 new Address(521301,"Andhra","Gudivada","India"),
			 new Address(509001,"Telangana","Mehabobnagar","India")));
	
	
	
	  public Address getLocation(int pinCode) {
		  return location.stream().filter(l->l.getPinCode() == (pinCode)).findFirst().get(); 
	  }
	  
	  public void addLocation(Address address) {
		  location.add(address);
	  }
	  
	  public List<Address> getAll(){
		  return location;
	  }
}