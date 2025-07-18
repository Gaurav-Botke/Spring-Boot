package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("vehicle")
public final  class Vehicle {
      
	//HAS - A property
	@Autowired
	@Qualifier("eEngine")
	private IEngine engine;
	
	public void  journy(String  startDest,String midDist, String stopDest) {
		
		System.out.println("Journy is started from ::"+startDest);
		engine.start();
		System.out.println("Journy is at Mid Destination :: "+midDist);
		engine.stop();
		System.out.println("Journy is stop at :: "+stopDest);
	}
}
