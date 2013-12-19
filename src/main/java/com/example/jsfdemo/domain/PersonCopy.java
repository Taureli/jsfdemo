package com.example.jsfdemo.domain;

import java.util.Date;

public class PersonCopy {

	private long id;

	private String firstName = "unknown";
	private String zipCode = "";
	private String pin = "";
	private Date dateOfBirth = new Date();
	private double weight;
	private boolean married;
	private int numOfChildren;

	public PersonCopy() {
	}

	public PersonCopy(String firstName, String zipCode, String pin, Date dateOfBirth, double weight, boolean married, int numOfChildren) {
		super();
		this.firstName = firstName;
		this.dateOfBirth = dateOfBirth;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getfirstName() {
		return firstName;
	}

	public void setfirstName(String firstName) {
		this.firstName = firstName;
	}

	public int getYob() {
		return yob;
	}

	public void setYob(int yob) {
		this.yob = yob;
	}

}
