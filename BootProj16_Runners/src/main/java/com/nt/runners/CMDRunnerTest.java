package com.nt.runners;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CMDRunnerTest implements CommandLineRunner {
  
	 
	public CMDRunnerTest() {
		System.out.println("CMDRunnerTest.0-param Constructor");
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("CMDRunnerTest.run()");
		   System.out.println("Value of cmd Runner :: "+Arrays.toString(args));
		
	}

}
