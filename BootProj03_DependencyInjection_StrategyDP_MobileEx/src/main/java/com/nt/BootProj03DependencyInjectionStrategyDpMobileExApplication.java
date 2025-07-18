package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.sbeans.Android;
import com.nt.sbeans.Ios;

@SpringBootApplication
public class BootProj03DependencyInjectionStrategyDpMobileExApplication {

	public static void main(String[] args) {
	 ConfigurableApplicationContext ctx = 	
			 SpringApplication.run(BootProj03DependencyInjectionStrategyDpMobileExApplication.class, args);
	 
	 //get target spring bean obj
	 Android android = ctx.getBean("android",Android.class);
	 Ios  ios = ctx.getBean("ios",Ios.class);
	 //calling b method
	 ios.service();
	 android.service();
	 //close IOC conatiner
	 ctx.close();
	 
	}

}
