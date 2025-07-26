package com.sneha;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Student {
    @Id
    private int roll_no;
    @Embedded
    private Student_name std_name;
    private int marks;
    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinTable(
            name = "student_laptop",
            joinColumns = @JoinColumn(name = "student_id"),
            inverseJoinColumns = @JoinColumn(name = "laptop_id")
    )
    private List<Laptop> laptop = new ArrayList<>();

    public List<Laptop> getLaptop() {
        return laptop;
    }

    public void setLaptop(List<Laptop> laptop) {
        this.laptop = laptop;
    }

    public Student_name getStd_name() {
        return std_name;
    }

    public void setStd_name(Student_name std_name) {
        this.std_name = std_name;
    }

    public int getRoll_no() {
        return roll_no;
    }

    public void setRoll_no(int roll_no) {
        this.roll_no = roll_no;
    }



    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "roll_no=" + roll_no +
                ", std_name=" + std_name +
                ", marks=" + marks +
                ", laptop=" + laptop +
                '}';
    }
}
