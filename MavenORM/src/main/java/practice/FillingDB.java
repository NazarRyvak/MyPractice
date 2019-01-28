package practice;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Random;

import javax.persistence.EntityManager;

import practice.entity.City;
import practice.entity.Country;
import practice.entity.Hobby;
import practice.entity.Person;

public class FillingDB {

	private static Random rd = new Random();

	public static void addRandomPerson(EntityManager em) throws IOException {

		BufferedReader inputStream = null;

		try {
			inputStream = new BufferedReader(new FileReader("src/main/java/practice/fullName.txt"));
			String l;
			while ((l = inputStream.readLine()) != null) {
				Person person = new Person();
				person.setFullName(l);
				person.setAge(rd.nextInt(100));
				em.persist(person);
			}
		} finally {
			if (inputStream != null) {
				inputStream.close();
			}
		}
	}

	public static void addRandomHobby(EntityManager em) throws IOException {
		BufferedReader inputStream = null;
		try {
			inputStream = new BufferedReader(new FileReader("src/main/java/practice/hobby.txt"));
			String l;
			while ((l = inputStream.readLine()) != null) {
				Hobby hobby = new Hobby();
				hobby.setName(l);
				em.persist(hobby);
			}
		} finally {
			if (inputStream != null) {
				inputStream.close();
			}
		}
	}

	public static void addRandomCity(EntityManager em) throws IOException {

		BufferedReader inputStream = null;
		try {
			inputStream = new BufferedReader(new FileReader("src/main/java/practice/city.txt"));
			String l;
			while ((l = inputStream.readLine()) != null) {
				City city = new City();
				city.setName(l);
				em.persist(city);
			}
		} finally {
			if (inputStream != null) {
				inputStream.close();
			}
		}
	}

	public static void addRandomCountry(EntityManager em) throws IOException {

		BufferedReader inputStream = null;
		try {
			inputStream = new BufferedReader(new FileReader("src/main/java/practice/country.txt"));
			String l;
			while ((l = inputStream.readLine()) != null) {
				Country country = new Country();
				country.setName(l);
				em.persist(country);
			}
		} finally {
			if (inputStream != null) {
				inputStream.close();
			}
		}
	}

	public static void addHobbyToPerson(EntityManager em) {

		List<Integer> hobbiesId = em.createQuery("select h.id from Hobby h", Integer.class).getResultList();
		List<Integer> peopleId = em.createQuery("select p.id from Person p", Integer.class).getResultList();

		for (Integer hobbyId : hobbiesId) {
			int rdCountPeopleWIthHobby = rd.nextInt(peopleId.size() - 1);
			List<Person> people = em.createQuery("select p from Person p", Person.class).getResultList();

			for (int i = 0; i < rdCountPeopleWIthHobby; i++) {
				Person person = people.get(rd.nextInt(people.size() - 1));
				Hobby hobby = em.createQuery("select h from Hobby h where h.id=:id", Hobby.class)
						.setParameter("id", hobbyId).getSingleResult();
				if (!person.getHobbies().contains(hobby)) {
					person.getHobbies().add(hobby);
				}
			}
		}

	}

	public static void addCityToCountry(EntityManager em) {

		List<Integer> countriesId = em.createQuery("select c.id from Country c", Integer.class).getResultList();
		List<Integer> citiesId = em.createQuery("select c.id from City c", Integer.class).getResultList();

		for (Integer id : citiesId) {
			City city = em.createQuery("select c from City c where c.id=:id", City.class).setParameter("id", id)
					.getSingleResult();

			Country country = em.createQuery("select c from Country c where c.id=:id", Country.class)
					.setParameter("id", countriesId.get(rd.nextInt(countriesId.size() - 1))).getSingleResult();
			city.setCountry(country);
		}
	}

	public static void addCountryAndCityToPerson(EntityManager em) {

		List<Integer> peopleId = em.createQuery("select p.id from Person p", Integer.class).getResultList();
		List<City> cities = em.createQuery("select c from City c", City.class).getResultList();
		for (Integer personId : peopleId) {
			City city = cities.get(rd.nextInt(cities.size() - 1));
			Person person = em.createQuery("select p from Person p where p.id=:id", Person.class)
					.setParameter("id", personId).getSingleResult();
			person.setCity(city);
			person.setCountry(city.getCountry());

		}
	}
}
