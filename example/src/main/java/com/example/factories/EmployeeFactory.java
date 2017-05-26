package com.example.factories;

import org.springframework.stereotype.Component;

import com.example.entities.Department;
import com.example.entities.Employee;


@Component
public class EmployeeFactory {

	public EmployeeFactory() {
	}

	public Employee createEmployee(String name,double sal,String deg) {

		Employee em1 = new Employee(name,sal,deg);
		
		return em1;
	}
}
