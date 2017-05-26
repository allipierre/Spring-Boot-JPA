package com.example.repositories;



import org.springframework.data.repository.CrudRepository;

import com.example.entities.Bestand;
import com.example.entities.Zutaten;



/**
 * Interface for CRUD operations on a Kunde repository
 */
public interface BestandRepository extends CrudRepository<Bestand, Long> {
	
}