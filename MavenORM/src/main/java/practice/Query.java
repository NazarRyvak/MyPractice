package practice;

import java.util.Arrays;

import javax.persistence.EntityManager;

import practice.entity.City;
import practice.entity.Country;
import practice.entity.Person;



public class Query {

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
