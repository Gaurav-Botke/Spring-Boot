package com.nt.runners;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.nt.controller.EmployeeController;
import com.nt.model.Employee;

@Component
public class ReatTimeDIRunner implements ApplicationRunner {
 
	@Autowired
	EmployeeController controller ;    //HAS-A property of Controller class
	@Override
	public void run(ApplicationArguments args) throws Exception {
		//calling b.method
		List<Employee> list = controller.showEmpDetails("MANAGER","ASSISTANCE","CLERK");
		list.forEach(emp->{
			System.out.println(emp);
		});

	}

}
