package practice;

import java.util.Arrays;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Expression;
import javax.persistence.criteria.Join;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import practice.entity.City;
import practice.entity.Country;
import practice.entity.Person;

public class CriteriaAPI {

	
	public static void outputFromPerson(EntityManager em) {
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<Person> query = cb.createQuery(Person.class);
		Root<Person> root = query.from(Person.class);
		query.select(root);
		em.createQuery(query).getResultList().stream().forEach(p -> System.out.println(p));
	}

	public static void outputReverseCountry(EntityManager em) {
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<Country> query = cb.createQuery(Country.class);
		Root<Country> root = query.from(Country.class);
		Expression<Integer> expression = root.get("id");
		query.select(root);
		query.orderBy(cb.desc(expression));
		em.createQuery(query).getResultList().stream().forEach(c -> System.out.println(c));
	}

	public static void outputCitySortedName(EntityManager em) {
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<City> query = cb.createQuery(City.class);
		Root<City> root = query.from(City.class);
		Expression<String> expression = root.get("name");
		query.select(root);
		query.orderBy(cb.asc(expression));
		em.createQuery(query).getResultList().stream().forEach(c -> System.out.println(c));
	}
	
	public static void outputReversePersonSortedName(EntityManager em) {
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<Person> query = cb.createQuery(Person.class);
		Root<Person> root = query.from(Person.class);
		Expression<String> expression = root.get("fullName");
		query.select(root);
		query.orderBy(cb.desc(expression));
		em.createQuery(query).getResultList().stream().forEach(p -> System.out.println(p));
	}
	
	public static void outputCityFirstSymbol(EntityManager em) {
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<City> query = cb.createQuery(City.class);
		Root<City> root = query.from(City.class);
		Expression<String> expression = root.get("name");
		Predicate predicate = cb.like(expression, "a%");
		query.select(root);
		query.where(predicate);
		em.createQuery(query).getResultList().stream().forEach(c -> System.out.println(c));
	}
	
	public static void outputCityBeforeLastSymbol(EntityManager em) {
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<City> query = cb.createQuery(City.class);
		Root<City> root = query.from(City.class);
		Expression<String> expression = root.get("name");
		Predicate predicateSymbolR = cb.like(expression, "%r_");
		Predicate predicateSymbolN = cb.like(expression, "%n_");
		Predicate allPredicate = cb.or(predicateSymbolR, predicateSymbolN);
		query.select(root);
		query.where(allPredicate);
		em.createQuery(query).getResultList().stream().forEach(c -> System.out.println(c));
	}
	
	public static void outputPeopleMinAge(EntityManager em) {
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<Person> query = cb.createQuery(Person.class);
		Root<Person> root = query.from(Person.class);
		Expression<Integer> expression = root.get("age");
		Predicate predicate = cb.equal(expression, minAge(em));
		query.select(root);
		query.where(predicate);
		em.createQuery(query).getResultList().stream().forEach(p -> System.out.println(p));
	}

	private static Integer minAge(EntityManager em) {
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<Integer> query = cb.createQuery(Integer.class);
		Root<Person> root = query.from(Person.class);
		Expression<Integer> expression = root.get("age");
		query.select(cb.min(expression));
		return em.createQuery(query).getSingleResult();
	}
	
	public static void outputAVGPeople(EntityManager em) {
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<Double> query = cb.createQuery(Double.class);
		Root<Person> root = query.from(Person.class);
		Expression<Double> expression = root.get("age");
		query.select(cb.avg(expression));
		System.out.println(em.createQuery(query).getSingleResult());
	}
	
	public static void outputPeopleAndCity(EntityManager em) {
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<Person> query = cb.createQuery(Person.class);
		Root<Person> root = query.from(Person.class);
		/*Join<Person, City> joinPersonCity = root.join("city");
		Expression<Integer> expression = joinPersonCity.get("id");
		Predicate predicate = cb.lessThan(expression, 2);*/
		query.select(root);
		//query.where(predicate);
		root.fetch("city");
		em.createQuery(query).getResultList().stream().forEach(p -> System.out.println(p + " " + p.getCity()));
	}
	
	public static void outputPersonAndCityNotEqualsId(EntityManager em) {
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<Person> query = cb.createQuery(Person.class);
		Root<Person> root = query.from(Person.class);
		Expression<Integer> expression = root.get("id");
		Predicate predicate = expression.in(Arrays.asList(2, 5, 9, 12, 15, 18));
		Predicate resultPredicate = cb.not(predicate);
		query.select(root);
		query.where(resultPredicate);
		root.fetch("city");
		em.createQuery(query).getResultList().stream().forEach(p -> System.out.println(p + " " + p.getCity()));
	}
	
	public static void outputALL(EntityManager em) {
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<Person> query = cb.createQuery(Person.class);
		Root<Person> root = query.from(Person.class);
		Expression<Integer> expression = root.get("id");
		query.select(root);
		query.orderBy(cb.asc(expression));
		root.fetch("city");
		root.fetch("country");
		root.fetch("hobbies");
		em.createQuery(query).getResultList().stream()
				.forEach(p -> System.out.println(p + " " + p.getCity() + " " + p.getCountry() + " " + p.getHobbies()));
	}
	
}