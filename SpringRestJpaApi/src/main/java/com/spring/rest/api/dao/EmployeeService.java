package com.spring.rest.api.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.spring.rest.api.model.EmployeeEntity;

@Service
public interface EmployeeService {
	
	
	public String createEmployee(EmployeeEntity empEntity);
	
	public List<EmployeeEntity> getAllEmployeeList();
	
	public Optional<EmployeeEntity> getEmployeeList(int empno);
	
	public String updateEmployeebyId(EmployeeEntity employeeEntity, int empno);
	
	public String deleteEmployeebyId(int empno);
	
	
	
	

}
