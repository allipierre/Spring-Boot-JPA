package com.example.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.entities.Department;



/**
 * Interface for CRUD operations on a Kunde repository
 */
public interface DepartmentRepository extends CrudRepository<Department, Long> {
	List<Department> findByName(String Name);
}