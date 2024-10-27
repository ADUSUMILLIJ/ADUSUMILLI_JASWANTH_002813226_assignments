package model.Student;


import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Person.Person;
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
public class Student /*extends Person*/ {
    private String id;
    private String name;
    private String email;
    private String uName;
    private String password;
    private String passwordHash;
    ArrayList<Course> courseList;
    private boolean register;
    
    public Student(){
        this.courseList= new ArrayList();
        
    }
    
    

    public Student(String id, String name, String email, String uName, String pwd) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.uName=uName;
        this.password=pwd;
        this.passwordHash=hashPassword(password);
        
        
        
    }

    public boolean isRegister() {
        return register;
    }

    public void setRegister(boolean register) {
        this.register = register;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPasswordHash() {
        return passwordHash;
    }

    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }
    private String hashPassword(String password) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] hashBytes = md.digest(password.getBytes());

            // Convert the byte array to hexadecimal format
            StringBuilder sb = new StringBuilder();
            for (byte b : hashBytes) {
                sb.append(String.format("%02x", b));
            }

            return sb.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }
    }
    public boolean CheckPassword(String password){
        String cpwd = hashPassword(password);
        return cpwd.equals(this.passwordHash);
                
            

    }   
    public void addCourseToStudent(Course newCourse) {      
        courseList.add(newCourse);
        JOptionPane.showMessageDialog(null, "Course has been registered successfully!");
    }
    
    public void deleteCourse(Course course){
        courseList.remove(course);
    }

    public ArrayList<Course> getCourseList() {
        return courseList;
    }

    public void setCourseList(ArrayList<Course> courseList) {
        this.courseList = courseList;
    }
    @Override
    public String toString(){
        return name;
    }
    
    
    //For Course List output in Netbeans
    public void CourseListOutput(){
        for (int i = 0; i < courseList.size(); i++){
            Course c = courseList.get(i);
            System.out.println(i + ". [ Course Name: " + c.getName() +"]");
        }
    }
    
    

    

    
    
    
    
}