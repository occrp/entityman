package org.occrp.entityman.model.entities;

import java.util.List;

import org.occrp.entityman.model.annotation.Entity;


@Entity
public class Person extends AEntity {

	private String name;
	
	private List<String> altNames;

	@Override
	public void updateKey() {
		// TODO implement key : break split by space and concatenate sortin by length
		setKey(name.toLowerCase());
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String getLabel() {
		return name;
	}
	
}
