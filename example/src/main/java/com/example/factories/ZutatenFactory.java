package com.example.factories;

import java.util.Set;

import org.springframework.stereotype.Component;

import com.example.entities.Department;
import com.example.entities.Produkt;
import com.example.entities.Zutaten;

@Component
public class ZutatenFactory {

	public ZutatenFactory() {
	}

	public Zutaten createZutaten(String name,Set<Produkt> produktSet) {

		Zutaten zut1 = new Zutaten(name,produktSet);
		
		return zut1;
	}
}
