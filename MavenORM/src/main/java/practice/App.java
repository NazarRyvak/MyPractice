package practice;

import java.io.IOException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import practice.entity.City;


public class App {
	public static void main(String[] args) throws IOException {

		EntityManagerFactory managerFactory = Persistence.createEntityManagerFactory("mysql");
		EntityManager em = managerFactory.createEntityManager();

		em.getTransaction().begin();

		//Query.addRandomPerson(em);
		//Query.addRandomCity(em);
		//Query.addRandomCountry(em);
		//Query.addCityToCountry(em);
		//Query.addCountryAndCityToPerson(em);
		//Query.outputFromPerson(em);
		//Query.outputReverseCountry(em);
		//Query.outputCitySortedName(em);
		//Query.outputReversePersonSortedName(em);
		//Query.outputCityFirstSymbol(em);
		//Query.outputCityBeforeLastSymbol(em);
		//Query.outputPeopleMinAge(em);
		//Query.outputAVGPerson(em);
		//Query.outputPeopleAndCity(em);
		//Query.outputPersonAndCityNotEqualsId(em);
		//Query.outputALL(em);
		
		
		em.getTransaction().commit();

		em.close();
		managerFactory.close();

	}
}
