package com.employeeMangement.app.EmployeeManagementSystem.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employeeMangement.app.EmployeeManagementSystem.Repository.EmployeeRepository;
import com.employeeMangement.app.EmployeeManagementSystem.model.Employee;
import com.employeeMangement.app.EmployeeManagementSystem.serviceInterface.EmployeeServiceInterface;

@Service
public class EmployeeService implements EmployeeServiceInterface{
	
	@Autowired
	private EmployeeRepository repo;

	@Override
	public Employee PostData(Employee emp) {
		
		return  repo.save(emp);
	}

	@Override
	public List<Employee> getData() {
		
		return repo.findAll();
	}

	@Override
	public void deleteData(Long id) {
	
		 repo.deleteById(id);
	}

	@Override
	public Employee updateData(Long id, Employee emp) {
		Employee e = repo.findById(id).get();
		
		e.setName(emp.getName());
		e.setUname(emp.getUname());
		e.setPass(emp.getPass());
		
		return  repo.save(e);
	}

	
	
	
	
	

}
