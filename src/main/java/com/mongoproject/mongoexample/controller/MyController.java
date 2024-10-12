package com.mongoproject.mongoexample.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mongoproject.mongoexample.models.Employee;
import com.mongoproject.mongoexample.repository.EmployeeRepo;

@RestController
@RequestMapping("/employee")
public class MyController {

	
	@Autowired
	EmployeeRepo employeeRepo ;
	
	@GetMapping("/home")
	public String getStu() {
		return "Hello world";
	}
	
	@PostMapping ("/add")
	public void addEmployee(@RequestBody Employee employee) {
		employeeRepo.save(employee);
	}
	
	@GetMapping("/get")
	public List<Employee> getEmployee(){
		List<Employee> all = employeeRepo.findAll();
		return all;
	}
}
