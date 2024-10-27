package model.Student;


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
public class Student extends Person {
    private List<Course> registeredCourses;

    public Student(String id, String name, String email, String uName, String pwd) {
        super(id, name, email, uName, pwd);
        this.registeredCourses = new ArrayList<>();
    }

    public void registerCourse(Course course) {
        registeredCourses.add(course);
    }

    public boolean satisfyGraduationRequirements() {
        // Implement graduation requirements logic
        return registeredCourses.size() >= 8; // Example requirement
    }

    public List<Course> getRegisteredCourses() {
        return registeredCourses;
    }

    public void setRegisteredCourses(List<Course> registeredCourses) {
        this.registeredCourses = registeredCourses;
    }
    
    
    
}