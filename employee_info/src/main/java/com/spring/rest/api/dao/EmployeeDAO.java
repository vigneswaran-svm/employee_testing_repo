package com.spring.rest.api.dao;

import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.spring.rest.api.exception.EmployeeNotFoundException;
import com.spring.rest.api.model.EmployeeEntity;
import com.spring.rest.api.repository.EmployeeJPARepository;

@Transactional(propagation=Propagation.SUPPORTS, readOnly =true)
@Service
public class EmployeeDAO implements EmployeeService{
	
	@Autowired
	EmployeeJPARepository employeeRepository;
	
	@Override
	public String createEmployee(EmployeeEntity empEntity) {
		// TODO Auto-generated method stub
		employeeRepository.save(empEntity);
		return "Emp No : " + empEntity.getEmp_No()+" Successfully saved";
	}

	@Override
	public List<EmployeeEntity> getAllEmployeeList() {
		// TODO Auto-generated method stub
		return employeeRepository.findAll();
	}

	@Override
	public Optional<EmployeeEntity> getEmployeeList(int empno) {
		// TODO Auto-generated method stub
		return employeeRepository.findById(empno);
	}

	@Transactional
	@Override
	public String updateEmployeebyId(EmployeeEntity employeeEntity, int empno) {
		// TODO Auto-generated method stub
		
		String status = "" ;
		Optional<EmployeeEntity>  optionalEmployee=employeeRepository.findById(empno);
		
		if (optionalEmployee.isPresent()) {
			System.out.println("date is present ..... " + optionalEmployee.get().getEmp_first_name());
			employeeEntity.setEmp_No(empno);
		    employeeRepository.save(employeeEntity);
		    
		    status=optionalEmployee.get().getEmp_No() +" : Employee updated sucessfully ....";
		}
		else {
			throw new EmployeeNotFoundException(status);
			//status=optionalEmployee.get().getEmp_No() +" : not exist in our DB ....";
			
		}
		
		return status ;
	}

	@Override
	public String deleteEmployeebyId(int empno) {
		// TODO Auto-generated method stub
		employeeRepository.deleteById(empno);
		return empno+" : The record was deleted .";
	}
	
}
