package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.ToString;

@Component("cust")
@Getter
@ToString
public class Customer {
    
	      @Value("${customer.name}")
	       private String name;
	      @Value("${customer.address}")
            private String address;
	      @Value("${customer.dosaPrice}")
             private Float  dosaPrice;
	      @Value("${customer.pohaPrice}")
             private Float pohaPrice;
	      @Value("${customer.samosaPrice}")
             private Float samosaPrice; 
}
