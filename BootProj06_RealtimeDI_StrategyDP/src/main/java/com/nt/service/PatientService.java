package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.dao.IPatientDAO;
import com.nt.model.Patient;

@Service("sPatient")
public class PatientService implements IPatientService {
	
	@Autowired
  IPatientDAO pDAO;          //HAS-A property for DAO class
	@Override
	public List<Patient> fetchPatientData(String state1, String state2, String state3) throws Exception {
		//calling a method and store Patient Obj data  into list
		      List<Patient> list = pDAO.getCoronaPatientData(state1, state2, state3);
		      //return list
		return list;
	}

}
