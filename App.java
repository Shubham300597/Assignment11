package com.anudip;
//Shubham Bhagat
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class App 
{
    public static void main( String[] args )
    {
    	//for connection
        System.out.println("Project Started");
        Configuration cfg=new Configuration().configure().addAnnotatedClass(Teacher.class);
        Configuration cfg1=new Configuration().configure().addAnnotatedClass(Course.class);
        cfg.configure("hibernate.cfg.xml");
        SessionFactory fac=cfg.buildSessionFactory();
        Session ss=fac.openSession();
        Transaction t=ss.beginTransaction();
        
        //creating Teacher
        Teacher tc=new Teacher();
        tc.setName("Mrunali");
        tc.setDept("IT");
        //creating Course
        Course c1=new Course();
        c1.setCname("Java Programming");
        c1.setCduration("6 months");
        Course c2=new Course();
        c2.setCname("Python Programming");
        c2.setCduration("4 months");
        Course c3=new Course();
        c3.setCname("Angular Programming");
        c3.setCduration("6 months");
        //creating list for store course
        List<Course> cl=new ArrayList<>();
        cl.add(c1);
        cl.add(c2);
        cl.add(c3);
        //store courses
        tc.setCourse(cl);
        c1.setTeacher(tc);
        c2.setTeacher(tc);
        c3.setTeacher(tc);
        //save all objects
        ss.save(tc);
        ss.save(c1);
        ss.save(c2);
        ss.save(c3);
        //for save in table
        t.commit();
        ss.close();
        
    }
}
