package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.nt.dao.IEmployeeDAO;
import com.nt.model.Employee;

@Service("empService")
public class EmployeeServiceImpl  implements IEmployeeService {
	
	@Autowired
	private IEmployeeDAO empDAO;

	@Override
	public List<Employee> fetchEmp(String desg1, String desg2, String desg3)throws Exception {
		 List<Employee> list = empDAO.getEmpDesg(desg1, desg2, desg3);
		return list;
	}

}
