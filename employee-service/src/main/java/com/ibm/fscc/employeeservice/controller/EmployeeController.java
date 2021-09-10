package com.ibm.fscc.employeeservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.fscc.employeeservice.model.Employee;
import com.ibm.fscc.employeeservice.model.EmployeeInput;
import com.ibm.fscc.employeeservice.service.EmployeeService;

@RestController
@RequestMapping(path = "/employee")
public class EmployeeController {

	@Autowired
	private Environment env;
	
	@Autowired
	EmployeeService employeeService;

	@RequestMapping(value = "/employees", method = RequestMethod.GET)
	public ResponseEntity<?> getEmployees() {
		List<Employee> listEmployees = this.employeeService.getEmpolyees();
		ResponseEntity<List<Employee>> responseEntity = new ResponseEntity<List<Employee>>(listEmployees, HttpStatus.OK);
		return responseEntity;
	}
	
	@RequestMapping(value = "/addemployee", method = RequestMethod.POST)
	public ResponseEntity<?> addEmployee(@RequestBody EmployeeInput employee) {
		Employee returnEmployee = employeeService.addEmployee(employee);
		ResponseEntity<Employee> responeEntity = new ResponseEntity<Employee>(returnEmployee, HttpStatus.OK);
		return responeEntity;
	}
	
	@RequestMapping(value = "/updateEmployee", method = RequestMethod.POST)
	public ResponseEntity<?> updateEmployee(@RequestBody EmployeeInput employee) {
		Employee returnEmployee = employeeService.updateEmployee(employee);
		return returnEmployee;
	}

	@GetMapping(path = "/status/check")
	public String status() {
		return "Working on port " + env.getProperty("server.port") + "!";
	}

}
