package com.anudip;
//Shubham Bhagat
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
//Entity declaration
@Entity
@Table(name="tearcher_info")//for table
public class Teacher
{
	@Id //for primary key
	@GeneratedValue(strategy=GenerationType.AUTO)//for automatic id generate
 private int tid;//declare private data member
 private String name;
 private String dept;
 @OneToMany //for one to many mapping
 private List<Course> course;
 //default constructor
public Teacher() {
	
	// TODO Auto-generated constructor stub
}
//constuctor usong fields
public Teacher(int tid, String name, String dept, List<Course> course) {
	super();
	this.tid = tid;
	this.name = name;
	this.dept = dept;
	this.course = course;
}
//generate getter and setter
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDept() {
	return dept;
}
public void setDept(String dept) {
	this.dept = dept;
}
public List<Course> getCourse() {
	return course;
}
public void setCourse(List<Course> course) {
	this.course = course;
}
 
}
