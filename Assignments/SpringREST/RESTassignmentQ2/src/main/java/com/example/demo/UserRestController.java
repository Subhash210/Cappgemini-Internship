package com.example.demo;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserRestController {
	
	@RequestMapping(value="/verify", method=RequestMethod.POST)
	public String loginRequest(@RequestParam String username,@RequestParam String password, ModelMap model) {
		
        if(username.equals("jai") && password.equals("Nishant"))
            return "Valid User";
       else
           return "Invalid User";

   }
	
}
