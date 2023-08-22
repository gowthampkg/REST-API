package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired

	EmployeeService Empser;
	
	@PostMapping("addEmployeeDet")
	public Employee add(@RequestBody Employee EE) {
		return Empser.saveDetails(EE);
	}
	@GetMapping("showDetails")
	public List<Employee> show(){
		return Empser.getDetails();
	}
}
