package com.nt;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.annotation.Bean;

import org.springframework.context.annotation.Profile;
import org.springframework.core.env.Environment;

import com.mchange.v2.c3p0.ComboPooledDataSource;



@SpringBootApplication
public class BootProj17RealtimeDIwithRunner {  
	
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
//		c3p0.setMinPoolSize(Integer.parseInt(env.getProperty("c3p0.min-size")));
//		c3p0.setMaxPoolSize(Integer.parseInt(env.getProperty("c3p0.max-size")));
		return c3p0;
	}
	
	
	public static void main(String[] args) {
		//create a SpringApplication Object
	SpringApplication.run(BootProj17RealtimeDIwithRunner.class);
	}

}
