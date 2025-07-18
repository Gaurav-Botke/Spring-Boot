package com.nt;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.ConfigurableApplicationContext;

import com.nt.sbeans.Vehicle;

@SpringBootApplication
public class BootProj01DependencyInjectionStrategyDpApplication {

	
	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(BootProj01DependencyInjectionStrategyDpApplication.class, args);
		//get obj of target class 
		Vehicle vehicle = ctx.getBean("vehicle",Vehicle.class);
		// Calling a b method
		vehicle.journy("GUNJ","SAMBHAJI NAGAR","PUNE");
		//close IOC Container 
		ctx.close();
	}

}
