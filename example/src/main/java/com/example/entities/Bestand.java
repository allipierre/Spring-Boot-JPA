package com.example.entities;



import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Bestand {

	private String menge;
	private String mengenheit;
	private String mindestbestand;
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	
	@OneToOne(cascade = CascadeType.ALL, mappedBy = "bestand")
	private Produkt produkt;

	

	public Bestand() {

	}

	public Bestand(String menge) {
		this.setMenge(menge);
	}

	public Bestand(String menge, String mindestbestand, String mengenheit) {
		this.setMenge(menge);
		this.setMindestbestand(mindestbestand);
		this.setMengenheit(mengenheit);

	}

	public void setMengenheit(String mengenheit) {
		this.mengenheit = mengenheit;

	}

	public String getMengenheit() {
		return this.mengenheit;

	}

	public void setMindestbestand(String mindestbestand) {
		this.mindestbestand = mindestbestand;

	}

	public void setMenge(String menge) {
		this.menge = menge;
	}

	public String getMindestbestand() {
		return this.mindestbestand;
	}

	public String getMenge() {
		return this.menge;
	}

	public Produkt getProduktSet() {
		return produkt;
	}

	public void setProduktSet(Produkt produkt) {
		this.produkt = produkt;
	}

	@Override
	public String toString() {
		return String.format("Zutaten[id=%d, Menge='%s',Mindestbestand='%s',Mengenheit='%s']", id, menge, mindestbestand,
				mengenheit);
	}
}
