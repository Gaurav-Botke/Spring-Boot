package com.nt.sbeans;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component("pEngine")
@Lazy
public  final class PetrolEngine implements IEngine {
	
	public PetrolEngine() {
		System.out.println("PetrolEngine :: 0-param constructor");
	}

	@Override
	public void start() {
		System.out.println("Petrol Engine is Start ");

	}

	@Override
	public void stop() {
		System.out.println("Petrol Engine is Stop ");

	}

}
