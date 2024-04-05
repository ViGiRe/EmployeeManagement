package com.employeeMangement.app.EmployeeManagementSystem.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employeeMangement.app.EmployeeManagementSystem.model.Employee;
import com.employeeMangement.app.EmployeeManagementSystem.serviceimpl.EmployeeService;

@RestController
@CrossOrigin("*")
@RequestMapping("/api")
public class EmployeeController {
	
	@Autowired
	private EmployeeService ser;
	
	
	@PostMapping("/emp")
	public Employee postData(@RequestBody Employee emp) {
		
		return ser.PostData(emp);
	}
	
	@GetMapping("/emps")
	public List<Employee> getData(){
		List<Employee> elist =  ser.getData();
		return elist;
	}

	@DeleteMapping("/emp/{id}")
	public void deleteData(@PathVariable Long id){
		ser.deleteData(id);
	}
	
	@PutMapping("/emp/{id}")
	public Employee updateData(@PathVariable Long id,@RequestBody Employee emp){{
		return ser.updateData(id, emp);
	}
	
	
	}
}
