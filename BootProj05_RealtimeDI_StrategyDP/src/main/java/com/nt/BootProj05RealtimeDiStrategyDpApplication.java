package com.nt;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.JdbcTemplateAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import com.nt.controller.EmployeeController;
import com.nt.model.Employee;

/* This classes  does not include in @Autoconfiguration that every class which do u want to not   involve in @Autoconfiguration 
then define in exclude ( (attribute) it take as array )   of@SBA */

@SpringBootApplication(
	    exclude = {
	        DataSourceAutoConfiguration.class,                 
	        JdbcTemplateAutoConfiguration.class
	    }
	)

public class BootProj05RealtimeDiStrategyDpApplication {  
	
	@Autowired
	private Environment env;
	
	// Here we used a our choice datasource object by define a @Bean method with required data source class here we used  C3P0 Connection
	// class    class name = com.mchange.v2.c3p0.ComboPooledDataSource  we have to place a required  jar in pom.xml
	
	@Bean
       public  ComboPooledDataSource createDataSource() throws Exception {
		ComboPooledDataSource cpds = new ComboPooledDataSource();
		cpds.setDriverClass(env.getRequiredProperty("spring.datasource.driver-class-name"));
		cpds.setJdbcUrl(env.getRequiredProperty("spring.datasource.url"));
		cpds.setUser(env.getProperty("spring.datasource.username"));
		cpds.setPassword(env.getProperty("spring.datasource.password"));
		return cpds;
	}
	
	

	public static void main(String[] args) {
	ApplicationContext ctx =	 SpringApplication.run(BootProj05RealtimeDiStrategyDpApplication.class, args);
	
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
