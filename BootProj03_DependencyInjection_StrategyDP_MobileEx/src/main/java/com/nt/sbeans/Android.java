package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("android")
public final class Android implements IMobile {

	//HAS-A property
	@Autowired
	@Qualifier("vSim")
	ISim sim;
	
	@Override
	public void service() {
		System.out.println("Android mobile is used the services of :: ");
		sim.calling();
		sim.internet();

	}

}
