package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Employee;
import com.example.demo.repository.EmpRepo;

@Service
public class EmployeeService {
	@Autowired
	EmpRepo em;
	
	public Employee saveDetails(Employee E) {
		return em.save(E);
	}
	
	public List<Employee> getDetails(){
		return em.findAll();
	}
	
}
