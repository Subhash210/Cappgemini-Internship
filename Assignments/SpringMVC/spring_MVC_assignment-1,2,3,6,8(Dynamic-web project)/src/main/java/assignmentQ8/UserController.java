package com.spring.assignmentQ8;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.ModelAndView;

@Controller
public class UserController {
	
	@RequestMapping("login")
	public ModelAndView getDetails() {
		
		ModelAndView model = new ModelAndView("login");
		return model;
	}
	
}
