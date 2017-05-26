package com.example.factories;

import java.util.Set;

import org.springframework.stereotype.Component;

import com.example.entities.Bestand;
import com.example.entities.Produkt;
import com.example.entities.Zutaten;

@Component
public class ProduktFactory {

	public ProduktFactory() {
	}

	public Produkt createProdukt(String name, Set<Zutaten> zutaten, Bestand bestand) {

		Produkt produkt = new Produkt(name, zutaten, bestand);

		return produkt;
	}
}
