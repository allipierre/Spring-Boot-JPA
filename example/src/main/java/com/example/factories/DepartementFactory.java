package com.example.factories;

import org.springframework.stereotype.Component;

import com.example.entities.Department;


@Component
public class DepartementFactory {

	public DepartementFactory() {
	}

	public Department createDepartement(String name) {

		Department dep1 = new Department(name);
		
		return dep1;
	}
}
