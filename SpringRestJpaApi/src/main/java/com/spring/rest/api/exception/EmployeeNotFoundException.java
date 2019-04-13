package com.spring.rest.api.exception;


public class EmployeeNotFoundException extends RuntimeException{
	
	public EmployeeNotFoundException(String exception) {
		super(exception);
	}
}
