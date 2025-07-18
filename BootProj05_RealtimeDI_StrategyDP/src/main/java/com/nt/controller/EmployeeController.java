package com.nt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.nt.model.Employee;
import com.nt.service.IEmployeeService;

@Controller("empController")
public class EmployeeController {
 
	@Autowired
	private IEmployeeService empService;
	
	public  List<Employee>  showEmpDetails(String desg1,String desg2,String desg3) throws Exception{
		//use Service
		List<Employee> list = empService.fetchEmp(desg1, desg2, desg3);
		return list;
		                 
	}
}
