package com.spring.rest.assignmentQ3;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class AddressRESTcontroller {
	
	@Autowired
	private LocationService locationService;
	
	@RequestMapping("/location/{pinCode}")
	public Address getLocation(@PathVariable int pinCode){
		return locationService.getLocation(pinCode);
	}
	
	@RequestMapping("/location")
	public List<Address> getLocation(){
		return locationService.getAll();
	}
	
	@RequestMapping(value = "/location",method=RequestMethod.POST)
	public void addLocation(@RequestBody Address address) {
		locationService.addLocation(address);
	}
}