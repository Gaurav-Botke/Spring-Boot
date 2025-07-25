package com.nt.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
   
	 private Integer eno;
	 private String name;
	 private String desg;
	 private Integer dept;
	 private Double salary;
	 
}
