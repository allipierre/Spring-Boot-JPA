package com.example.repositories;



import java.util.Collection;

import org.springframework.data.repository.CrudRepository;

import com.example.entities.Kunde;
import com.example.entities.Produkt;



/**
 * Interface for CRUD operations on a Kunde repository
 */
public interface ProduktRepository extends CrudRepository<Produkt, Long> {
	
}