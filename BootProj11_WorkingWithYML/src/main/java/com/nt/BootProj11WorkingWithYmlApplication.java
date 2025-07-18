package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.sbeans.Project;

@SpringBootApplication
public class BootProj11WorkingWithYmlApplication {

	public static void main(String[] args) {
		//get IOC container
		ConfigurableApplicationContext ctx =  SpringApplication.run(BootProj11WorkingWithYmlApplication.class, args);
		//get Spring bean object
		Project proj = ctx.getBean(Project.class);
		//print the Object
		System.out.println(proj);
		//close IOC container
		ctx.close();
	}//main

}//class
