package com.employeeMangement.app.EmployeeManagementSystem.serviceInterface;

import java.util.List;

import com.employeeMangement.app.EmployeeManagementSystem.model.Employee;

public interface EmployeeServiceInterface {

	
	public Employee PostData(Employee emp);
	
	public List<Employee> getData();
	
	public void deleteData(Long id);
	
	public Employee updateData(Long id,Employee emp);
}
