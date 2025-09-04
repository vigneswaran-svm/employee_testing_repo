package com.spring.rest.api.model;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;


@Entity
@Table(name="employee_master")
@Access(value=AccessType.FIELD)
public class EmployeeEntity {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@NotNull
	private int emp_no;
	
	@NotNull
	private String emp_first_name;
	
	@NotNull
	private String emp_last_name;
	
	@NotNull
	private String emp_age;
	
	@NotNull
	private String emp_city;
	

	@NotNull
	private int emp_contact_number;


	public int getEmp_No() {
		return emp_no;
	}

	public void setEmp_No(int emp_No) {
		this.emp_no = emp_No;
	}

	public String getEmp_first_name() {
		return emp_first_name;
	}

	public void setEmp_first_name(String emp_first_name) {
		this.emp_first_name = emp_first_name;
	}

	public String getEmp_last_name() {
		return emp_last_name;
	}

	public void setEmp_last_name(String emp_last_name) {
		this.emp_last_name = emp_last_name;
	}

	public String getEmp_age() {
		return emp_age;
	}

	public void setEmp_age(String emp_age) {
		this.emp_age = emp_age;
	}

	public String getEmp_city() {
		return emp_city;
	}

	public void setEmp_city(String emp_city) {
		this.emp_city = emp_city;
	}

	public int getEmp_contact_number() {
		return emp_contact_number;
	}

	public void setEmp_contact_number(int emp_contact_number) {
		this.emp_contact_number = emp_contact_number;
	}
	
	public EmployeeEntity() {
		
	}
	
	public EmployeeEntity(int emp_no,String emp_first_name,String emp_last_name,String emp_age,String emp_city,int emp_contact_number) {
		
		this.emp_no=emp_no;
		this.emp_first_name=emp_first_name;
		this.emp_last_name=emp_last_name;
		this.emp_age=emp_age;
		this.emp_city=emp_city;
		this.emp_contact_number=emp_contact_number;
	}

	
}
