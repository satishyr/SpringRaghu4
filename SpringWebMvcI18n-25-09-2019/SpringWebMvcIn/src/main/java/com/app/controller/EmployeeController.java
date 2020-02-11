package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.app.model.Employee;
import com.app.validator.EmployeeValidator;

@Controller
public class EmployeeController {
	@Autowired
	private EmployeeValidator validator;
	
	//1. show Form
	@RequestMapping("/register")
	public String showPage(ModelMap map) {
		//Form Backing Object
		map.addAttribute("employee",new Employee());
		return "Register";
	}
	//2. on click submit
	@RequestMapping(value="/save",method=RequestMethod.POST)
	public String processData(
			@ModelAttribute Employee employee,
			Errors errors,
			ModelMap map)
	{
		String page=null;
		//1. call vlidator
		validator.validate(employee,errors);
		//2. check for errors exist
		if(errors.hasErrors()) {
			page="Register";
		}else {
			page="Data";
			map.addAttribute("emp",employee);
			
		}
		return page;
	}
	
	
	
	
	
	
	
}


