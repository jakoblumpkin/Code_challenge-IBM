package com.ibm.fscc.employeeservice.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.ibm.fscc.employeeservice.model.Employee;

@Repository
public interface EmployeeRepo extends MongoRepository<Employee, Long> {
	
	public Employee findByUserId(String userId);

}
