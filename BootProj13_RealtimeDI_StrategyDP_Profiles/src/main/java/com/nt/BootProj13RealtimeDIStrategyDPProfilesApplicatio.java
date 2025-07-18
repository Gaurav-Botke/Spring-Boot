package com.nt;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.Profile;
import org.springframework.core.env.Environment;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import com.nt.controller.EmployeeController;
import com.nt.model.Employee;



@SpringBootApplication
public class BootProj13RealtimeDIStrategyDPProfilesApplicatio {  
	
	@Autowired
	Environment env ;
	
	    @Bean
	    @Profile("test")
	    ComboPooledDataSource createDataSource() throws Exception{
		ComboPooledDataSource c3p0 = new ComboPooledDataSource();
		c3p0.setDriverClass(env.getRequiredProperty("spring.datasource.driver-class-name"));
		c3p0.setJdbcUrl(env.getRequiredProperty("spring.datasource.url"));
		c3p0.setUser(env.getRequiredProperty("spring.datasource.username"));
		c3p0.setPassword(env.getRequiredProperty("spring.datasource.password"));
		c3p0.setMinPoolSize(Integer.parseInt(env.getProperty("c3p0.min-size")));
		c3p0.setMaxPoolSize(Integer.parseInt(env.getProperty("c3p0.max-size")));
		return c3p0;
	}
	
	
	public static void main(String[] args) {
		//create a SpringApplication Object
	SpringApplication app =	new  SpringApplication(BootProj13RealtimeDIStrategyDPProfilesApplicatio.class);
	//set the profile
	//app.setAdditionalProfiles("uat");
	
	//get Access of IOC conatiner
	ApplicationContext ctx = app.run(args);
	
	//get controller class object class obj
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
