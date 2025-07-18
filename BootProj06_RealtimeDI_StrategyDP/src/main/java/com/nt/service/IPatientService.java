package com.nt.service;

import java.util.List;

import com.nt.model.Patient;

public interface IPatientService {
	
                public  List<Patient> fetchPatientData(String state1,String state2,String state3)throws Exception;
}
