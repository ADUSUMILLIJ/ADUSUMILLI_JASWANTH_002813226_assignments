package model.Person;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author sushanthkumarreddyjanga
 */
public class Person {
    private String id;
    private String name;
    private String email;
    private String uName;
    private String password;
    private String passwordHash;
    

    public Person(String id, String name, String email, String uName, String pwd) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.uName=uName;
        this.password=pwd;
        this.passwordHash=hashPassword(password);
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
    @Override
    public String toString(){
        return name;
    }

    
    
    
    
    
    
}
