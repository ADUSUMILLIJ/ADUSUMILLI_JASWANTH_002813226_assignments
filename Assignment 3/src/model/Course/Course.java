package model.Course;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Professor.Professor;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sushanthkumarreddyjanga
 */
public class Course{
    private String id;
    private String name;
    private String professor;
    private String profID;
    private String term;
    private String time;
    private int credit;
    ArrayList<Course>professorCourses;
    
    
    

    public Course(String id, String name, String professor,String profID, String term, String time,int credit) {
        //(id, name, pname, pid, term, time, credit)
        this.id = id;
        this.name = name;
        this.professor = professor;
        this.profID=profID;
        this.term = term;
        this.time=time;
        this.credit=credit;
        this.professorCourses= new ArrayList<Course>();
        
        
        
}

    public Course() {
        
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTerm() {
        return term;
    }

    public void setTerm(String term) {
        this.term = term;
    }

    public String getProfessor() {
        return professor;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }

    public String getProfID() {
        return profID;
    }

    public void setProfID(String profID) {
        this.profID = profID;
    }

    public ArrayList<Course> getProfessorCourses() {
        return professorCourses;
    }

    public void setProfessorCourses(ArrayList<Course> professorCourses) {
        this.professorCourses = professorCourses;
    }
    public void addCourseToProfessor(Course newCourse) {      
        professorCourses.add(newCourse);
        JOptionPane.showMessageDialog(null, "Course has been registered successfully!");
    }
    public void deleteCourse(Course course){
        professorCourses.remove(course);
    }

    public ArrayList<Course> getCourseList() {
        return professorCourses;
    }
    
    
    @Override
    public String toString(){
        return name;
    }
    
   
}