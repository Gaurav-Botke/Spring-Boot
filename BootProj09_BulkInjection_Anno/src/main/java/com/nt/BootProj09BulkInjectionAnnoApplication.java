package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.nt.sbeans.Department;
import com.nt.sbeans.Employee;

@SpringBootApplication
public class BootProj09BulkInjectionAnnoApplication {

	public static void main(String[] args) {
		
		//get IOC container
		ApplicationContext ctx =  SpringApplication.run(BootProj09BulkInjectionAnnoApplication.class, args);
		
		//get Spring beans form IOC 
		Employee emp = ctx.getBean("emp",Employee.class);
		System.out.println("Emp Deatils :: "+emp);
		
		Department dept = ctx.getBean("dept",Department.class);
		System.out.println("Department Detaile :: "+dept);
	}

}
