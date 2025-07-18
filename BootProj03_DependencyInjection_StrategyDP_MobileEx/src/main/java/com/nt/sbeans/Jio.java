package com.nt.sbeans;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component("jSim")
@Lazy
public final class Jio implements ISim {
	
	
	public Jio() {
		System.out.println("Jio :: 0-param Constructor ");
	}

	@Override
	public void calling() {
		System.out.println("JIO sim is used for calling ");

	}

	@Override
	public void internet() {
		System.out.println("JIO sim is used for Internet ");

	}

}
