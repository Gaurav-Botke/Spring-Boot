package com.nt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.nt.model.Patient;
import com.nt.service.IPatientService;

@Controller("pController")
public class PatientController {
      
	@Autowired
	IPatientService pService;
	
	public List<Patient> showPatientState(String state1, String state2, String state3)throws Exception{
		List<Patient> list = pService.fetchPatientData(state1, state2, state3);
		return list;
	}
}
