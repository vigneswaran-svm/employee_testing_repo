package com.spring.rest.api.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.rest.api.dao.EmployeeService;
import com.spring.rest.api.model.EmployeeEntity;

import io.swagger.annotations.Api;



@RestController
@RequestMapping("/employee")
@Api(value="Employee Controller")
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	@RequestMapping("/welcome")
	public String welcomeService() {
		
		return "Welcome Service called" ;
	}
	
	
	@PostMapping(path="/newemployee")
	public String createEmployee(@RequestBody EmployeeEntity employeeEntity) {
		
		return employeeService.createEmployee(employeeEntity);
	}
	
	@GetMapping("/readallemployee")
	public List<EmployeeEntity> getAllEmployeeList(){
		
		return employeeService.getAllEmployeeList();
	}
	
	@GetMapping(path="/reademployee/{empno}" , produces="application/xml")
	public Optional<EmployeeEntity> getEmployeeList(@PathVariable("empno") int empno){
		
		return employeeService.getEmployeeList(empno);
	}
	
	@PutMapping("/updateemployee/{empno}")
	public String updateEmployeebyId(@RequestBody EmployeeEntity employeeEntity, @PathVariable("empno") int empno) {
		// TODO Auto-generated method stub
		return employeeService.updateEmployeebyId(employeeEntity, empno);
	}
	
	@DeleteMapping("/deletemapping/{empno}")
	public String deleteEmployeebyId(@PathVariable("empno") int empno) {
		
		return employeeService.deleteEmployeebyId(empno);
	}

	
	
}
