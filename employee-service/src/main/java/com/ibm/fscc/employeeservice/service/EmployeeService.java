package com.ibm.fscc.employeeservice.service;

import java.util.List;

import com.ibm.fscc.employeeservice.model.Employee;
import com.ibm.fscc.employeeservice.model.EmployeeInput;

public interface EmployeeService {
	
   public List<Employee> getEmpolyees();
   public Employee addEmployee(EmployeeInput employee);
   public Employee updateEmployee(EmployeeInput employee);
   
}
