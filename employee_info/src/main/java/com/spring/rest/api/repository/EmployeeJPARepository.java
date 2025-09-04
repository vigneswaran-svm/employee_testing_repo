package com.spring.rest.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.spring.rest.api.model.EmployeeEntity;

@Service
public interface EmployeeJPARepository extends JpaRepository<EmployeeEntity, Integer>{

	
}
