package model.Course;

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
    private Professor professor;
    private Professor profID;
    private String term;
    private String time;
    private boolean Register;
    private int credit;

    public Course(String id, String name, Professor professor, String term, String time,int credit) {
        this.id = id;
        this.name = name;
        this.professor = professor;
        this.term = term;
        this.time=time;
        this.credit=credit;
        
        
        
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

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public String getTerm() {
        return term;
    }

    public void setTerm(String term) {
        this.term = term;
    }

    public boolean isRegister() {
        return Register;
    }

    public void setRegister(boolean Register) {
        this.Register = Register;
    }
    
   
}