package com.ibm.fscc.employeeservice.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.fscc.employeeservice.model.Employee;
import com.ibm.fscc.employeeservice.model.EmployeeInput;
import com.ibm.fscc.employeeservice.repo.EmployeeRepo;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	EmployeeRepo employeeRepo;
    
	public List<Employee> getEmpolyees() {
		
		List<Employee> employeeList = null;
		employeeList = this.employeeRepo.findAll();
		
		return employeeList;
	}
	
	public Employee addEmployee(EmployeeInput employee) {
		//random string
		UUID uuid = UUID.randomUUID();
        String uuidAsString = uuid.toString();
        
		List<Employee> employeeList = this.employeeRepo.findAll();
		for(Employee employees :employeeList) {
	        if(employees.getEmail() == employee.getEmail()) {
	        	return new Employee("rejected", "rejected",
	        			"rejected", "rejected", "rejected", 
	        			"rejected", "rejected", "rejected", "rejected");
	        }
		}
		
		Employee employeeDb = new Employee(uuidAsString, employee.getFirstName(),
				employee.getLastName(), employee.getAddress(), employee.getState(),
				employee.getZip(), employee.getCellPhone(), employee.getHomePhone(),
				employee.getEmail());
		this.employeeRepo.insert(employeeDb);
		
		return employeeDb;

	}
	
	public Employee updateEmployee(EmployeeInput employee) {
		Employee rightEmployee = this.employeeRepo.findByUserId(employee.getUserId());
		this.employeeRepo.delete(rightEmployee);
		rightEmployee.setAddress(employee.getAddress());
		rightEmployee.setEmail(employee.getEmail());
		rightEmployee.setZip(employee.getZip());
		rightEmployee.setCellPhone(employee.getCellPhone());
		rightEmployee.setHomePhone(employee.getHomePhone());
		rightEmployee.setState(employee.getState());
		rightEmployee.setFirstName(employee.getFirstName());
		rightEmployee.setFirstName(employee.getLastName());
		this.employeeRepo.insert(rightEmployee);

		return rightEmployee;
	}
}
