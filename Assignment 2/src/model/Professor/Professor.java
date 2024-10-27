package model.Professor;


import model.Person.Person;
import model.Course.Course;
import java.util.ArrayList;
import java.util.List;
import model.Course.Course;
import model.Person.Person;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sushanthkumarreddyjanga
 */
public class Professor extends Person {
    private String specialty;
    private List<Course> courses;

    public Professor(String id, String name, String email, String uName,String pwd, String specialty) {
        super(id, name, email,uName,pwd);
        this.specialty = specialty;
        this.courses = new ArrayList<>();
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }
    
}

