package com.demo.sample;

public class Student {

	private int id;
	private String firstName;
	private String lastName;
	private String name;
	private String location;
	private int salary;
	
	

	public Student() {
		
	}
	
	/*
	 * public Student(int id, String firstName, String lastName) { super(); this.id
	 * = id; this.firstName = firstName; this.lastName = lastName; }
	 */
	
	public Student(int id,String name,String location) {
		this.id=id;
		this.name=name;
		this.location=location;
	}
	
	public Student(int id,String name,String location,int salary) {
		this.id=id;
		this.name=name;
		this.location=location;
		this.salary=salary;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
}
