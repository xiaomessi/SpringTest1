package com.fehead.spring.bean;

import java.util.Map;

public class PersonMap {
	private String name;
	private int age;
	private Map<String,Car> cars;
	public PersonMap(String name, int age, Map<String, Car> cars) {
		super();
		this.name = name;
		this.age = age;
		this.cars = cars;
	}
	public Map<String, Car> getCars() {
		return cars;
	}
	public void setCars(Map<String, Car> cars) {
		this.cars = cars;
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
	
	public PersonMap(){
		
	}
	@Override
	public String toString() {
		return "PersonMap [name=" + name + ", age=" + age + ", cars=" + cars + "]";
	}
	
	
}
