package com.nt.sbeans;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component("eEngine")
@Lazy
public class ElectricEngine implements IEngine {

	
	public ElectricEngine() {
	System.out.println("ElectricEngine :: 0-param Constructor ");
	}

	@Override
	public void start() {
		 System.out.println("Electric Engine is Start ");

	}

	@Override
	public void stop() {
		System.out.println("Electric Engine is Stop ");

	}

}
