package com.demo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee 
{
	@Id
  private int id;
  private String firstName;
  private String lastName;
  
  
public Employee()
{
	super();
}

public Employee(int id, String firstName, String lastName)
{
	super();
	this.id = id;
	this.firstName = firstName;
	this.lastName = lastName;
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
  
  
}
