package com.nt.sbeans;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component("vSim")
@Lazy
public final class Vodafone implements ISim {
	
	public Vodafone() {
	 System.out.println("Vodafone :: 0-param Constructor");
	}

	@Override
	public void calling() {
	System.out.println("Vodafone is used for Calling ");

	}

	@Override
	public void internet() {
		System.out.println("Vodafone is used for Internet");

	}

}
