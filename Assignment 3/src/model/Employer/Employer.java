/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Employer;

import java.util.ArrayList;

/**
 *
 * @author LENOVO
 */
public class Employer {
    private String EmployerName;
    private String empID;
    private String empMail;
    private String workArea;
    private String Username;
    private String Password;
    private String job;
    private String pay;
    ArrayList<Employer>jobList = new ArrayList<>();
    
    public String getEmployerName(){
        return EmployerName;
    } 

    public void setEmployerName(String EmployerName) {
        this.EmployerName = EmployerName;
    }
    public String getUsername(){
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }
    
    public String getPassword(){
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getEmpID() {
        return empID;
    }

    public void setEmpID(String empID) {
        this.empID = empID;
    }

    public String getEmpMail() {
        return empMail;
    }

    public void setEmpMail(String empMail) {
        this.empMail = empMail;
    }

    public String getWorkArea() {
        return workArea;
    }

    public void setWorkArea(String workArea) {
        this.workArea = workArea;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getPay() {
        return pay;
    }

    public void setPay(String pay) {
        this.pay = pay;
    }

    public ArrayList<Employer> getJobList() {
        return jobList;
    }

    public void setJobList(ArrayList<Employer> jobList) {
        this.jobList = jobList;
    }
    
    public void addJob(Employer employer){
        jobList.add(employer);
    }
    
        
}

