package com.nt;

import com.nt.controller.PatientController;
import com.nt.model.Patient;


import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class BootProj06RealtimeDiStrategyDpApplication {

    private final PatientController pController;

    BootProj06RealtimeDiStrategyDpApplication(PatientController pController) {
        this.pController = pController;
    }

	public static void main(String[] args) {
	ApplicationContext ctx = 	SpringApplication.run(BootProj06RealtimeDiStrategyDpApplication.class, args);
	
	PatientController ctr = ctx.getBean("pController",PatientController.class);
	
	
	try {
		List<Patient> list =  ctr.showPatientState("MAHA","GUJRAT", "MP");
		list.forEach(pt ->{
			System.out.println(pt);
		});
	} catch (Exception e) {
		e.printStackTrace();
	}finally {
		((ConfigurableApplicationContext) ctx).close();
	}
	
	}

}
