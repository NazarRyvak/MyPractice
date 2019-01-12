package practice.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Data;
import lombok.ToString;

@Data
@Entity
@Table(name = "hobby")
@ToString(callSuper = true, exclude = { "people" })
public class Hobby extends BaseEntity{

	@Column(length = 50)
	private String name;
	
	@ManyToMany
	@JoinTable(name = "person_hobby", joinColumns = @JoinColumn(name = "hobby_id"),
	inverseJoinColumns = @JoinColumn(name = "person_id"))
	private List<Person> people = new ArrayList<>();
	
}
