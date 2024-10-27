package model.Professor;


import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Person.Person;
import model.Course.Course;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sushanthkumarreddyjanga
 */
public class Professor /*extends Person*/ {
    private String specialty;
    private String id;
    private String name;
    private String email;
    private String uName;
    private String password;
    private String passwordHash;
    ArrayList<Course> professorcourses = new ArrayList();
    
    
    

    public Professor(String id, String name, String email, String uName,String pwd, String specialty) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.uName=uName;
        this.password=pwd;
        this.passwordHash=hashPassword(password);
        this.specialty = specialty;      
    }
    public Professor(){
    
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
    private String hashPassword(String password) {/*
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
        }*/
        return password;
    }
  
    
    public boolean CheckPassword(String password){
        String cpwd = hashPassword(password);
        return cpwd.equals(this.passwordHash);
    }

    public ArrayList<Course> getProfessorcourses() {
        return professorcourses;
    }

    public void setProfessorcourses(ArrayList<Course> professorcourses) {
        this.professorcourses = professorcourses;
        
    }
    public void addCourseToProfessor(Course newCourse) {      
        professorcourses.add(newCourse);
        System.out.println("Added successfully");
        JOptionPane.showMessageDialog(null, "Course has been registered successfully!");
    }
    public void deleteCourse(Course course){
        professorcourses.remove(course);
    }

    public ArrayList<Course> getCourseList() {
        return professorcourses;
    }
    
    


    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }
    
    @Override
    public String toString(){
        return name;
    }
    
    
}

