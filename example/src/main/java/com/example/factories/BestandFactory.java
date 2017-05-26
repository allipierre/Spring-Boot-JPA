package com.example.factories;

import java.util.Set;

import org.springframework.stereotype.Component;

import com.example.entities.Bestand;
import com.example.entities.Department;
import com.example.entities.Produkt;
import com.example.entities.Zutaten;

@Component
public class BestandFactory {

	public BestandFactory() {
	}

	public Bestand createBestand(String menge,String mindestbestand,String mengenheit) {

		Bestand best1 = new Bestand(menge,mindestbestand,mengenheit);
		
		return best1;
	}
}
