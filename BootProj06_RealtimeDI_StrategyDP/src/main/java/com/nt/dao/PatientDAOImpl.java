//DAO Impl class
package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nt.model.Patient;

@Repository("pDAO")
public class PatientDAOImpl implements IPatientDAO {
	
	static final String GET_PATIENT_STATE = "SELECT ID,NAME,STATE,ACTIVE FROM CORONA_PATIENT_INFO WHERE STATE IN(?,?,?) ORDER BY STATE";

  @Autowired
	private  DataSource ds ;      //HAS -A to dataSource  Injection
  
  @Override
	public List<Patient> getCoronaPatientData(String state1, String state2, String state3)throws Exception {
	  // Patient obj data store into a List Data store Structure
		 List<Patient> list = null;
		 
		 //connection creation from con pool object
		try(Connection con = ds.getConnection();
				//coz we are define a prepared statement  already 
				PreparedStatement ps = con.prepareStatement(GET_PATIENT_STATE);
				){
			//set query parameter those are define in a query 
			ps.setString(1, state1);
			ps.setString(2, state2); 
			ps.setString(3, state3);
			
			//get the ResultSet obj  where a result of Query result is store
			try (ResultSet rs = ps.executeQuery();){
				//define a arrayList for patient
				list = new ArrayList<Patient>();
				//while runs until a last recored
				     while(rs.next()) {
				    	 Patient pt = new Patient();
					      pt.setId(rs.getInt(1));
					      pt.setName(rs.getString(2));
					      pt.setState(rs.getString(3));
					      pt.setActive(rs.getString(4));
					      //get the Patient data & store into a list in the form of object
					      list.add(pt);
				     }
			} catch (Exception e) {
				e.printStackTrace();
				throw e;
			}
			
		}catch(SQLException se) {
			se.printStackTrace();                //Exception propagation
			throw se;
		}
		// we return a list that contains obj data
		return list;
	}//method

}//class
