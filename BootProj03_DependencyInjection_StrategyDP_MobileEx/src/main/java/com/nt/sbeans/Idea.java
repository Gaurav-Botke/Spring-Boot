package com.nt.sbeans;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component("iSim")
@Lazy
public final class Idea implements ISim {
	
	public Idea() {
		System.out.println("Idea :: 0-param constructor ");
	}

	@Override
	public void calling() {
		System.out.println("Idea sim is used for Calling");

	}

	@Override
	public void internet() {
		System.out.println("Idea sim is used for Internate");

	}

}
