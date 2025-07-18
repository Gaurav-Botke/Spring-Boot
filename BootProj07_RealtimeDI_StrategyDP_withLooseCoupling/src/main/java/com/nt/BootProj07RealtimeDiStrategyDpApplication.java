package com.nt;

import java.util.List;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;
import com.nt.controller.EmployeeController;
import com.nt.model.Employee;



@SpringBootApplication
@ImportResource("com/nt/cfgs/applicationContext.xml")
public class BootProj07RealtimeDiStrategyDpApplication {  
	
	
	public static void main(String[] args) {
	ApplicationContext ctx =	 SpringApplication.run(BootProj07RealtimeDiStrategyDpApplication.class, args);
	
	//get target class obj
	EmployeeController ctr = ctx.getBean("empController",EmployeeController.class);
	//call b method
	
	try {
		List<Employee> list =  ctr.showEmpDetails("MANAGER","CLERK","ASSISTANCE");
		list .forEach(emp->{
			System.out.println(emp);
		});
	} catch (Exception e) {
	  e.printStackTrace();
	}finally {
		((ConfigurableApplicationContext) ctx).close();
	}
	}

}
