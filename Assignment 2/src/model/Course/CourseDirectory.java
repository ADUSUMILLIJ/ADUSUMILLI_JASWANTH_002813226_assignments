package model.Course;


import model.Course.Course;
import java.util.ArrayList;
import java.util.List;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sushanthkumarreddyjanga
 */
public class CourseDirectory {
    private List<Course> courses;
    
    public CourseDirectory(){
        this.courses = new ArrayList<>();
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }
    public void addCourse(Course course) {
        courses.add(course);
    }
    public Course searchCourse(String id){
        for(Course course: courses){
            if(course.getId().equals(id)){
               return course; 
            }
            }
        return null;
        }
    public void deleteCourse(Course course){
        courses.remove(course);
    }
}
