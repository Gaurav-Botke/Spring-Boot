package com.nt.runners;


import java.util.Set;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class AppRunner implements ApplicationRunner {

   	@Override
	public void run(ApplicationArguments args) throws Exception {
	    System.out.println("AppRunner.run()");
	    System.out.println("non option args ::"+args.getNonOptionArgs());
	     System.out.println("option args ");
	    Set<String> names = args.getOptionNames();
	    
	    names.forEach(emp->{
	    	System.out.println(emp+" ... "+args.getOptionValues(emp));
	    });
	  
     
	}

}
