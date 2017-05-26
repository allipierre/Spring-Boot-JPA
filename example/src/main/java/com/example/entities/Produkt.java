package com.example.entities;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

@Entity
public class Produkt {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	private String name;
	// @PersistenceContext
	// EntityManager em;

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "Produkt_Zutazen", joinColumns = @JoinColumn(name = "Produkt_id", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "Zutaten_id", referencedColumnName = "id"))
	private Set<Zutaten> zutatens;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "id")
	private Bestand bestand;

	public Produkt(String name) {
		this.setName(name);
	}

	public Produkt() {

	}

	public Produkt(String name, Set<Zutaten> zutaten, Bestand bestand) {
		this.setName(name);
		this.zutatens = zutaten;
		this.bestand = bestand;

	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public Set<Zutaten> getZutatten() {
		return zutatens;
	}

	public void setZutaten(Set<Zutaten> zutaten) {
		this.zutatens = zutaten;
	}

	public Bestand getBestand() {
		return bestand;
	}

	public void setBestand(Bestand bestand) {
		this.bestand = bestand;
	}

	@Override
	public String toString() {
		return String.format("Produkt[id=%d, Name='%s']", id, name);
	}

	// public void getTable() {
	// TypedQuery<String> query = em.createQuery("SELECT c.Produkt_id FROM
	// PRODUKT_ZUTAZEN AS c", String.class);
	// List<String> results = query.getResultList();
	// System.out.println(results);
	// }

}