package com.nt.sbeans;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Setter;
import lombok.ToString;

@Component("emp")
@Setter
@ToString
@ConfigurationProperties(prefix="emp.nit")
public class Employee {
           private String  name;
           private String addr;
           private String dept;
           private String desg;
}
