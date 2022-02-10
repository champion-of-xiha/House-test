package com.house.eneities;

public class User {
	private String nameString;
	private int age;
	public String getNameString() {
		return nameString;
	}
	public void setNameString(String nameString) {
		this.nameString = nameString;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public User(String nameString, int age) {
		super();
		this.nameString = nameString;
		this.age = age;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "User [nameString=" + nameString + ", age=" + age + "]";
	}
	
}
