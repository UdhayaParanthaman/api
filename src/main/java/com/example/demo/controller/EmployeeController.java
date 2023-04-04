package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepo;
import com.example.demo.service.EmployeeService;

@RestController
public class EmployeeController {

		@Autowired
		EmployeeRepo empRepo;
		
		@Autowired
		EmployeeService empSer;
		
		
		@GetMapping("/findById")
		public Employee getEmployeeById() {
			
//			Employee emp = empSer.updateMethod(empRepo.findById(2l).get());
//			
//			empRepo.deleteById(emp.getId());
//		
			return empRepo.findByEmail("a@gmail.com");
		}
		
		@PostMapping("/createOne")
		public Employee createEmployee() {
			Employee emp1 = new Employee();
			emp1.setName("Karthick");
			emp1.setEmail("aa@gmail.com");
			Employee empl =empRepo.save(emp1);
			
			return empl;
		}
		
		@PutMapping("/update")
		public Employee updateEmployee() {
			
			
			
			Employee emp = empSer.updateMethod(empRepo.findById(2l).get());
			
			return emp;
		}
		
		@PutMapping("/delete")
		public void deleteEmployee() {
			
			empRepo.deleteById(2l);
		}
}
