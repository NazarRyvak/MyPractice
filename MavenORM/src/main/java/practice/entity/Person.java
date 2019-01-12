package practice.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.ToString;

@Entity
@Data
@Table(name = "person")
@ToString(callSuper = true , exclude = {"country","city","hobbies"})
public class Person extends BaseEntity {

	@Column(name = "full_name", length = 50)
	private String fullName;

	private int age;
	
	@ManyToOne(cascade = {
			CascadeType.DETACH, CascadeType.MERGE,
			CascadeType.PERSIST, CascadeType.REFRESH} , fetch = FetchType.LAZY)
	@JoinColumn(name="country_id")
	private Country country;
	
	@ManyToOne(cascade = {
			CascadeType.DETACH, CascadeType.MERGE,
			CascadeType.PERSIST, CascadeType.REFRESH}, fetch = FetchType.LAZY)
	@JoinColumn(name="city_id")
	private City city;
	
	@ManyToMany
	@JoinTable(name = "person_hobby", joinColumns = @JoinColumn(name = "person_id"),
	inverseJoinColumns = @JoinColumn(name = "hobby_id"))
	private List<Hobby> hobbies = new ArrayList<>();

}
