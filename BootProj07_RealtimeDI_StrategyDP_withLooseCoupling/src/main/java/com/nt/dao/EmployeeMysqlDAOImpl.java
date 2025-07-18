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

import com.nt.model.Employee;

@Repository("mysql-empDAO")
public class EmployeeMysqlDAOImpl implements IEmployeeDAO {
	private static final String GET_EMP_BY_DESG ="SELECT ENO,NAME,JOB,DEPT,SALARY FROM EMP WHERE JOB IN (?,?,?) ORDER BY  JOB";
  
	@Autowired
	private DataSource ds ;
	@Override
	public List<Employee> getEmpDesg(String desg1, String desg2, String desg3) throws Exception {
		
		List<Employee> list = null;
		//get JDBC con obje
		     try (Connection con = ds.getConnection();
		    		 //create a prepared statement object
		    		 PreparedStatement ps =con.prepareStatement(GET_EMP_BY_DESG);
		    		 ){
		    	 System.out.println(ds.getClass());
		    	 //set values to query parameter
		    	 ps.setString(1, desg1);ps.setString(2, desg2);ps.setString(3, desg3);
		    	 
		    	 try(ResultSet rs = ps.executeQuery();){
		    		 //copy the records from rs object to Employee obj
		    		 list = new ArrayList<Employee>();
		    		 while(rs.next()) {
		    			 Employee emp = new Employee();
		    			 emp.setEno(rs.getInt(1));
		    			 emp.setName(rs.getString(2));
		    			 emp.setDesg(rs.getString(3));
		    			 emp.setDept(rs.getInt(4));
		    			 emp.setSalary(rs.getDouble(5));
		    			 //add employee obj to List connection
		    			list.add(emp);
		    		 }
		    		 
		    	 }//try 2 with resource
				
			}//try 1 with resource
		     catch(SQLException se) {
		    	 se.printStackTrace();
		    	 throw se;
		     }
		     catch (Exception e) {
				e.printStackTrace();
				throw e;
			}
		return list;
	}//method

}//class
