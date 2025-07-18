package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.nt.sbeans.Customer;
import com.nt.sbeans.HotelInfo;

@SpringBootApplication
public class BootProj08SpelInjectionApplication {

	public static void main(String[] args) {
		//get the IOC container
		ApplicationContext ctx =  SpringApplication.run(BootProj08SpelInjectionApplication.class, args);
		
		//call spring bean 
		Customer cust = ctx.getBean("cust",Customer.class);
		System.out.println("Customer info :: "+cust);
		
		HotelInfo hotel = ctx.getBean("hotel", HotelInfo.class);
		 
        System.out.println("Hotel info :: " + hotel);
        System.out.println("Discounted Bill (if > 100): " + hotel.getFinalBill(100));

        
       
	}

}
