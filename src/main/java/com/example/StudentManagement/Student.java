package com.example.StudentManagement;

public class Student {
	private String name;
	private int age;
	private int id;
    private String city;
    
	public Student(String name, int age, int id, String city) {
		this.name = name;
		this.age = age;
		this.id = id;
		this.city = city;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
}
