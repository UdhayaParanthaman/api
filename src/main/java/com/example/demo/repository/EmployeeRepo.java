package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.Employee;

public interface EmployeeRepo extends CrudRepository<Employee, Long>{
	
	public Employee findByEmail(String email);
	
}
