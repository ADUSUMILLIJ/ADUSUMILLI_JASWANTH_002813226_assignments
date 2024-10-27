package model.Student;


import model.Student.Student;
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
public class StudentDirectory {
    private List<Student> students;
    
    public StudentDirectory(){
        this.students = new ArrayList<>();
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
    
    public void addStudent(Student student) {
        students.add(student);
    }
    
    public Student searchStudent(String id){
        for(Student student: students){
            if(student.getId().equals(id)){
               return student; 
            }
            }
        return null;
        }
    
    public void deleteStudent(Student student){
        students.remove(student);
    }
        
    }
        
    

