package com.example;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.example.entities.Bestand;
import com.example.entities.Produkt;
import com.example.entities.Zutaten;
import com.example.factories.BestandFactory;
import com.example.factories.DepartementFactory;
import com.example.factories.EmployeeFactory;
import com.example.factories.KundeFactory;
import com.example.factories.ProduktFactory;
import com.example.factories.ZutatenFactory;
import com.example.repositories.BestandRepository;
import com.example.repositories.DepartmentRepository;
import com.example.repositories.EmployeeRepository;
import com.example.repositories.KundeRepository;
import com.example.repositories.ProduktRepository;
import com.example.repositories.ZutatenRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component
public class SampleData implements ApplicationListener<ContextRefreshedEvent> {

	@Autowired
	private KundeRepository kundeRepository;

	@Autowired
	private DepartmentRepository departementRepository;

	@Autowired
	private EmployeeRepository employeeRepository;

	@Autowired
	private ZutatenRepository zutatenRepository;

	@Autowired
	private ProduktRepository produktRepository;

	@Autowired
	private BestandRepository bestandRepository;

	private static final Logger log = LoggerFactory.getLogger(SampleData.class);

	Zutaten t = new Zutaten("Zwiebel");
	Zutaten t1 = new Zutaten("Karotte");
	Produkt t2 = new Produkt("Tomatoes");
	Bestand b = new Bestand("45", "45", "Kilo");
	Bestand b1 = new Bestand("90", "80", "Kilo");

	Set<Zutaten> zutatenSet1 = new HashSet();
	Set<Zutaten> zutatenSet2 = new HashSet();
	Set<Produkt> produktSet2 = new HashSet();

	@Override
	public void onApplicationEvent(ContextRefreshedEvent arg0) {
		zutatenSet1.add(t);
		zutatenSet2.add(t1);
		produktSet2.add(t2);

		kundeRepository.save(new KundeFactory().createKunde("Maxime", "Max"));
		System.out.println(kundeRepository.findByName("Maxime").toString());
		departementRepository.save(new DepartementFactory().createDepartement("Inf"));
		employeeRepository.save(new EmployeeFactory().createEmployee("pieere", 50, "nn"));

		produktRepository.save(new ProduktFactory().createProdukt("Katoffel Pure", zutatenSet1, b));

		produktRepository.save(new ProduktFactory().createProdukt("Salade", zutatenSet2, b1));

		for (Produkt produkt : produktRepository.findAll()) {

			System.out.println(produkt.toString());
		}

		for (Zutaten zutaten : zutatenRepository.findAll()) {

			System.out.println(zutaten.toString());
		}

		/*
		 * 
		 * 
		 * 
		 */

	}

	public SampleData() {

	}

}
