package practice.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;
import lombok.ToString;

@Entity
@Data
@Table(name = "country")
@ToString(callSuper = true, exclude = { "people", "cities" })
public class Country extends BaseEntity {

	@Column(length = 50)
	private String name;

	@OneToMany(mappedBy = "country", cascade = { CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST,
			CascadeType.REFRESH })
	private List<Person> people = new ArrayList<Person>();

	@OneToMany(mappedBy = "country", cascade = { CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST,
			CascadeType.REFRESH })
	private List<City> cities = new ArrayList<City>();

}
