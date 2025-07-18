package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("ios")
public final class Ios implements IMobile {
	//HAS - A property
	@Autowired
	@Qualifier("jSim")
	ISim sim;

	@Override
	public void service() {
		System.out.println("IOS mobile is used the services of :: ");
		sim.calling();
		sim.internet();

	}

}
