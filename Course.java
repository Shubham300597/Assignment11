package com.anudip;
//Shubham Bhgat
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
//entity declaration
@Entity
@Table(name="course_info")//for table 
public class Course 
{
	@Id//for primary key
	@GeneratedValue(strategy=GenerationType.AUTO)//for automatic id creation
 private int cid;//declare private data member
 private String cname;
 private String cduration;
 @ManyToOne
 private Teacher teacher;
//default constructor
 public Course() {
	
	// TODO Auto-generated constructor stub
}
 //constructor using fields
public Course(int cid, String cname, String cduration, Teacher teacher) {
	super();
	this.cid = cid;
	this.cname = cname;
	this.cduration = cduration;
	this.teacher = teacher;
}
//getter and setter
public String getCname() {
	return cname;
}
public void setCname(String cname) {
	this.cname = cname;
}
public String getCduration() {
	return cduration;
}
public void setCduration(String cduration) {
	this.cduration = cduration;
}
public Teacher getTeacher() {
	return teacher;
}
public void setTeacher(Teacher teacher) {
	this.teacher = teacher;
}
 
}
