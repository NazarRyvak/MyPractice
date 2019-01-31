package com.practice.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

//import com.logos.validator.CheckIfCountryExist;

import lombok.Data;

@Entity
@Table(name="country")
@Data
public class Country extends BaseEntity {

	//@CheckIfCountryExist
	@NotEmpty(message="Country`s name field can`t be null")
	private String name;

	@NotEmpty(message="Country`s shortName field can`t be null")
	@Column(name="short_name")
	private String shortName;
}
