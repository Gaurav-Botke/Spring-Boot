package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("vehicle")
public final  class Vehicle {
      
	//HAS - A property
	@Autowired
	
	//@Qualifier("${choose.engine}")    can not used a place holder key ${-} in @Qualifier Annotation
	
	//@Qualifier(@Value"${choose.engine}")    can not used a @Value(-) inside  @Qualifier Annotation
	
	/*
	 @Value("${choose.engine}")          We can not pass a variable inside a annotation
	 private String bid;
	 @Qualifier("bid")
	 */
	
	@Qualifier("engg")
	private IEngine engine;
	
	public void  journy(String  startDest,String midDist, String stopDest) {
		
		System.out.println("Journy is started from ::"+startDest);
		engine.start();
		System.out.println("Journy is at Mid Destination :: "+midDist);
		engine.stop();
		System.out.println("Journy is stop at :: "+stopDest);
	}
}
