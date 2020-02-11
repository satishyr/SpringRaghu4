package com.app.validator;

import java.util.regex.Pattern;

import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.app.model.Employee;
@Component
public class EmployeeValidator 
	implements  Validator {

	@Override
	public boolean supports(Class<?> clz) {
		return Employee.class.equals(clz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		//Down cast to Model class
		Employee e=(Employee)target;
		//Text Input Validation
		if(!Pattern.matches("[A-Z]{2,6}",e.getEmpName())){
			errors.rejectValue("empName", "empNameErr");
		}
		//Radio Button
		//if(e.getEmpGen()==null || "".equals(e.getEmpGen())) {
		if(!StringUtils.hasText(e.getEmpGen())) {
			errors.rejectValue("empGen", "empGenErr" );
		}
		//Text Area
		if(!Pattern.matches("[A-Za-z0-9\\s]{2,50}", e.getEmpAddr())) {
			errors.rejectValue("empAddr", "empAddrErr");
		}
		//DropDown
		if(!StringUtils.hasText(e.getEmpProj())) {
			errors.rejectValue("empProj", "empProjErr");
		}
		//Checkbox : List
		if(e.getEmpLangs()==null || e.getEmpLangs().isEmpty()) {
			errors.rejectValue("empLangs", "empLangsErr");
		}
	}

	
	
	
}






