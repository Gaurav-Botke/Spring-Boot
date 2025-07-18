package com.nt.dao;

import java.util.List;

import com.nt.model.Patient;

public interface IPatientDAO {
           
	 public List<Patient> getCoronaPatientData(String state1,String state2,String state3)throws Exception;
}
