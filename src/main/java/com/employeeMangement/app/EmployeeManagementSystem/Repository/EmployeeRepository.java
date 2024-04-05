package com.employeeMangement.app.EmployeeManagementSystem.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.employeeMangement.app.EmployeeManagementSystem.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
