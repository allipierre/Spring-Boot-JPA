package com.example.entities;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Zutaten {

	private String name;

	@ManyToMany(mappedBy="zutatens")
	private Set<Produkt> produktSet;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	public Zutaten() {
		
	}
	
	public Zutaten(String name) {
		this.setName(name);
	}

	public Zutaten(String name, Set<Produkt> produktSet) {
		this.setName(name);
		this.produktSet = produktSet;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}
	
	public Set<Produkt> getProduktSet() {
		return produktSet;
	}

	public void setProduktSet(Set<Produkt> produktSet) {
		this.produktSet = produktSet;
	}
	
	@Override
    public String toString() {
        return String.format(
                "Zutaten[id=%d, Name='%s']",
                id, name);
    }
}
