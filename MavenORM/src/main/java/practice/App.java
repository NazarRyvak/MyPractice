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

		//FillingDB.addRandomPerson(em);
		//FillingDB.addRandomCity(em);
		//FillingDB.addRandomCountry(em);
		//FillingDB.addRandomHobby(em);
		//FillingDB.addCityToCountry(em);
		//FillingDB.addCountryAndCityToPerson(em);
		//FillingDB.addHobbyToPerson(em);
		
		
		//Query.outputFromPerson(em);
		//CriteriaAPI.outputFromPerson(em);
		
		//Query.outputReverseCountry(em);
		//CriteriaAPI.outputReverseCountry(em);
		
		//Query.outputCitySortedName(em);
		//CriteriaAPI.outputCitySortedName(em);
		
		//Query.outputReversePersonSortedName(em);
		//CriteriaAPI.outputReversePersonSortedName(em);
		
		
		//Query.outputCityFirstSymbol(em);
		//CriteriaAPI.outputCityFirstSymbol(em);
		
		//Query.outputCityBeforeLastSymbol(em);
		//CriteriaAPI.outputCityBeforeLastSymbol(em);
		
		//Query.outputPeopleMinAge(em);
		//CriteriaAPI.outputPeopleMinAge(em);
		
		
		//Query.outputAVGPerson(em);
		//CriteriaAPI.outputAVGPeople(em);
		
		
		//Query.outputPeopleAndCity(em);
		CriteriaAPI.outputPeopleAndCity(em);
		
		//Query.outputPersonAndCityNotEqualsId(em);
		//CriteriaAPI.outputPersonAndCityNotEqualsId(em);
		
		
		//Query.outputALL(em);
		//CriteriaAPI.outputALL(em);
		
		
		em.getTransaction().commit();

		em.close();
		managerFactory.close();

	}
}
