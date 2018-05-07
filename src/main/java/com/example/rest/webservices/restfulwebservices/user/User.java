package com.example.rest.webservices.restfulwebservices.user;

import java.util.Date;

public class User {

	private Integer id;

	private String name;

	private Date birthName;

	protected User() {

	}

	public User(Integer id, String name, Date birthName) {
		super();
		this.id = id;
		this.name = name;
		this.birthName = birthName;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBirthName() {
		return birthName;
	}

	public void setBirthName(Date birthName) {
		this.birthName = birthName;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", birthName=" + birthName + "]";
	}

}
