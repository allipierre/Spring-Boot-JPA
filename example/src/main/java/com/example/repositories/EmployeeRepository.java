package com.example.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.entities.Department;
import com.example.entities.Employee;


/**
 * Interface for CRUD operations on a Kunde repository
 */
public interface EmployeeRepository extends CrudRepository<Employee, Long> {
	List<Department> findByEname(String ename);
}