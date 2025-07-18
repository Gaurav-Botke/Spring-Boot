package com.nt.sbeans;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Setter;
import lombok.ToString;

@Component("dept")
@Setter
@ToString
@ConfigurationProperties(prefix = "dept")
public class Department {
  
	 private String name;
	 private String location;
	 private Integer size;
	 private String proj;
}
