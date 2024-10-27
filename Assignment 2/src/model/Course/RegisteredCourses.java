/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Course;

import java.util.ArrayList;
import java.util.List;
import model.Course.Course;

/**
 *
 * @author sushanthkumarreddyjanga
 */
public class RegisteredCourses {
    private List<Course> registeredCourses;
    
    public RegisteredCourses(){
    this.registeredCourses= new ArrayList<>();
}

    public List<Course> getRegisteredCourses() {
        return registeredCourses;
    }

    public void setRegisteredCourses(List<Course> registeredCourses) {
        this.registeredCourses = registeredCourses;
    }
    public void registerCourse(Course course) {
        registeredCourses.add(course);
    }
    
    
    
}
