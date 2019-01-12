package practice;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

import javax.persistence.EntityManager;

import practice.entity.Person;
import practice.entity.City;
import practice.entity.Country;



public class Query {

	public static void addRandomPerson(EntityManager em) throws IOException {

		BufferedReader inputStream = null;
		Random rd = new Random();

		try {
			inputStream = new BufferedReader(new FileReader("src/main/java/p/fullName.txt"));
			String l;
			while ((l = inputStream.readLine()) != null) {
				Person person = new Person();
				person.setFullName(l);
				person.setAge(rd.nextInt(80));
				em.persist(person);
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
			inputStream = new BufferedReader(new FileReader("src/main/java/p/city.txt"));
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
			inputStream = new BufferedReader(new FileReader("src/main/java/p/country.txt"));
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

	public static void addCityToCountry(EntityManager em) {

		Long countCountry = em.createQuery("select count(c) from Country c", Long.class).getSingleResult();
		Long countCity = em.createQuery("select count(c) from City c", Long.class).getSingleResult();
		int j = 1;

		for (int i = 1; i <= countCountry; i++) {

			Country country = em.createQuery("select c from Country c where c.id=:id", Country.class)
					.setParameter("id", i).getSingleResult();
			do {
				City city = em.createQuery("select c from City c where c.id=:id", City.class).setParameter("id", j)
						.getSingleResult();
				city.setCountry(country);
				j++;
				if (j > countCity)
					break;
			} while (j % 10 != 0);
			if (j > countCity)
				break;

		}
	}

	public static void addCountryAndCityToPerson(EntityManager em) {
		Random rd = new Random();
		Long countPerson = em.createQuery("select count(p) from Person p", Long.class).getSingleResult();
		List<City> cities = em.createQuery("select c from City c", City.class).getResultList();
		for (int i = 1; i <= countPerson; i++) {
			City city = cities.get(rd.nextInt(cities.size()));
			Country country = em.createQuery("select c.country from City c where c.id=:id", Country.class)
					.setParameter("id", city.getId()).getSingleResult();
			Person person = em.createQuery("select p from Person p where p.id=:id", Person.class).setParameter("id", i)
					.getSingleResult();
			person.setCity(city);
			person.setCountry(country);
		}
	}

	public static void outputFromPerson(EntityManager em) {
		em.createQuery("select p from Person p", Person.class).getResultList().stream()
				.forEach(p -> System.out.println(p));
	}

	public static void outputReverseCountry(EntityManager em) {
		em.createQuery("select c from Country c order by id   desc", Country.class).getResultList().stream()
				.forEach(c -> System.out.println(c));
	}

	public static void outputCitySortedName(EntityManager em) {
		em.createQuery("select c from City c order by name asc ", City.class).getResultList().stream()
				.forEach(c -> System.out.println(c));
	}

	public static void outputReversePersonSortedName(EntityManager em) {
		em.createQuery("select p from Person p order by fullName desc, age asc  ", Person.class).getResultList()
				.stream().forEach(p -> System.out.println(p));
	}

	public static void outputCityFirstSymbol(EntityManager em) {
		em.createQuery("select c from City c where c.name like :pattern", City.class).setParameter("pattern", "a%")
				.getResultList().stream().forEach(c -> System.out.println(c));
	}

	public static void outputCityBeforeLastSymbol(EntityManager em) {
		em.createQuery("select c from City c where c.name like :patternOne or c.name like :patternTwo", City.class)
				.setParameter("patternOne", "%n_").setParameter("patternTwo", "%r_").getResultList().stream()
				.forEach(c -> System.out.println(c));
	}

	public static void outputPeopleMinAge(EntityManager em) {
		Integer minAge = em.createQuery("select min(p.age) from Person p", Integer.class).getSingleResult();
		em.createQuery("select p from Person p where p.age=:age", Person.class).setParameter("age", minAge)
				.getResultList().stream().forEach(p -> System.out.println(p));
	}

	public static void outputAVGPerson(EntityManager em) {
		System.out.println(em.createQuery("select avg(p.age) from Person p", Double.class).getSingleResult());
	}

	public static void outputPeopleAndCity(EntityManager em) {
		em.createQuery("select p  from Person p join fetch p.city order by p.id", Person.class).getResultList().stream()
				.forEach(p -> System.out.println(p + " " + p.getCity()));
	}

	public static void outputPersonAndCityNotEqualsId(EntityManager em) {
		em.createQuery("Select p from Person p join fetch p.city where p.id not in :list order by p.id", Person.class)
				.setParameter("list", Arrays.asList(2, 5, 9, 12, 15, 18)).getResultList().stream()
				.forEach(p -> System.out.println(p + " " + p.getCity()));
	}
	
	public static void outputALL(EntityManager em) {
		em.createQuery("select p from Person p join fetch p.city join fetch p.country order by p.id", Person.class).getResultList().stream()
		.forEach(p -> System.out.println(p + " " + p.getCity()+ " "+p.getCountry()));
	}

}
