package com.app.controller.rest;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/emp") //optional
public class EmployeeRestController {
	@PostMapping("/save")
	public String saveEmployee() {
		return "FROM SAVE EMP";
	}
	@PutMapping("/modify")
	public String modifyEmployee() {
		return "FROM MODIFY EMP";
	}
	@DeleteMapping("/remove")
	public String removeEmployee() {
		return "FROM REMOVE EMP";
	}
	@GetMapping("/all")
	public String getAllEmployees() {
		return "FROM GET ALL EMPS";
	}
	@GetMapping("/one")
	public String getOneEmployee() {
		return "FROM GET ONE EMP";
	}
	
}





