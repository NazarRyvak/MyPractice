package practice;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import javax.persistence.EntityManager;

import practice.entity.City;
import practice.entity.Country;
import practice.entity.Hobby;
import practice.entity.Person;



public class Query {
	
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
			int rdCountPeopleWIthHobby = rd.nextInt(peopleId.size()-1);
			List<Person> people = em.createQuery("select p from Person p", Person.class).getResultList();
			
			for (int i = 0; i < rdCountPeopleWIthHobby; i++) {
				Person person = people.get(rd.nextInt(people.size()-1));
				Hobby hobby = em.createQuery("select h from Hobby h where h.id=:id", Hobby.class).
						setParameter("id", hobbyId).getSingleResult();
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
					.setParameter("id", countriesId.get(rd.nextInt(countriesId.size()-1))).getSingleResult();
			city.setCountry(country);
		}
	}

	public static void addCountryAndCityToPerson(EntityManager em) {
		
		List<Integer> peopleId = em.createQuery("select p.id from Person p", Integer.class).getResultList();
		List<City> cities = em.createQuery("select c from City c", City.class).getResultList();
		for (Integer personId : peopleId) {
			City city = cities.get(rd.nextInt(cities.size()-1));
			Person person = em.createQuery("select p from Person p where p.id=:id", Person.class).setParameter("id", personId)
					.getSingleResult();
			person.setCity(city);
			person.setCountry(city.getCountry());
			
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
		em.createQuery("select distinct p from Person p join fetch p.city join fetch p.country join fetch p.hobbies order by p.id", Person.class).getResultList().stream()
		.forEach(p -> System.out.println(p + " " + p.getCity()+ " "+p.getCountry()+ " " + p.getHobbies()));
	}
	


}
