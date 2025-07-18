package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.availability.ApplicationAvailabilityAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.sbeans.Employee;

@SpringBootApplication
public class BootProj12BulkInjectionWith_YML_File {

	public static void main(String[] args) {
		//get IOC container
		ApplicationContext ctx =  SpringApplication.run(BootProj12BulkInjectionWith_YML_File.class, args);
		//get spring beans class
		
		Employee emp = ctx.getBean("emp",Employee.class);
		//print the object 
		System.out.println("Emp details ::"+emp);
		//close the IOC container
		
	((ConfigurableApplicationContext) ctx).close();
	}

}
