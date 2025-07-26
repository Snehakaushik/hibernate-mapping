package com.sneha;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        Laptop laptop = new Laptop();
        Student_name name1 = new Student_name();
        name1.setFirst_name("Sneha");
        name1.setLast_name("Kaushik");

        laptop.setLid(113);
        laptop.setLname("HP");


        s1.setRoll_no(101);
        s1.setStd_name(name1);
        s1.setMarks(90);
        s1.getLaptop().add(laptop);
        laptop.getStudent().add(s1);
        System.out.println(s1);

        //laptop.getStudent().add(s1);
        //s1.setLaptop(new ArrayList<>()); // Initialize list before adding items




        Configuration config = new Configuration().addAnnotatedClass(com.sneha.Student.class).addAnnotatedClass(com.sneha.Laptop.class).configure();
        SessionFactory factory = config.buildSessionFactory();
        Session session = factory.openSession();
        Transaction t1 = session.beginTransaction();
        session.persist(s1);
        //session.persist(laptop);

        Student s2 = session.get(Student.class , 102);
        System.out.println(s2);
        t1.commit();

    }
}