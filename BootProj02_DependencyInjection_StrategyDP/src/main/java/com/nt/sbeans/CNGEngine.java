package com.nt.sbeans;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component("cEngine")
@Lazy
public final class CNGEngine implements IEngine {
	
	

	public CNGEngine() {
		System.out.println("CNGEngine :: 0-param Constructor ");
	}

	@Override
	public void start() {
		System.out.println("CNG Engine is Start ");

	}

	@Override
	public void stop() {
		System.out.println("CNG Engine is Stop ");


	}

}
