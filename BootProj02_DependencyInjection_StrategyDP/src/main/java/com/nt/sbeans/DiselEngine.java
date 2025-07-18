package com.nt.sbeans;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component("dEngine")
@Lazy
public final class DiselEngine implements IEngine {
	
	
	public DiselEngine() {
		System.out.println("DiselEngine :: 0-param Constructor");
	}

	@Override
	public void start() {
		System.out.println("Disel Engine is Start ");

	}

	@Override
	public void stop() {
		
		System.out.println("Disel Engine is Stop ");
	}

}
