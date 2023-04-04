
package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepo;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeRepo empRepo;
	
	public Employee updateMethod(Employee emp) {
		
		if(empRepo.existsById(emp.getId())) {
			emp.setName("KKK");
			empRepo.save(emp);
			return emp;
		}
		else {
			
			return emp;
		}
		

	}
}
