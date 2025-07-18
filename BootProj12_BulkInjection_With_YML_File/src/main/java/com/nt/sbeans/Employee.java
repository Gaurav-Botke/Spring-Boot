package com.nt.sbeans;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component("emp")
@Data
@ConfigurationProperties(prefix=("emp.details"))
public class Employee {
         
	  //Simple properties 
	     private Integer eno;
          private String ename;
          private String esal;
          
          //Array Properties
          private String[] fav_Color;
          
          //List Properties
          private List<String > nickNames;
          
          //Set properties
          private Set<Long> mob;
          
          //Map properties
          private Map<String , Object> idDetails;
          
          //HAS-A property
          private Project project;
          
          
}
