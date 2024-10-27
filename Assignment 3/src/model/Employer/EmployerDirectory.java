/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Employer;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author LENOVO
 */
public class EmployerDirectory{
    private List<Employer>employerList;
    
    public EmployerDirectory(){
        this.employerList= new ArrayList<Employer>();
        
        
        
    }

    public List<Employer> getEmployerList() {
        return employerList;
    }

    public void setEmployerList(List<Employer> employerList) {
        this.employerList = employerList;
        
    }
    public void addEmployer(Employer employer){
        employerList.add(employer);
        
    }
    /*public Employer searchEmployer(String id){
        for(Employer employer: employerList){
            if(employer.getEmpID().equals(id)){
               return employer; 
            }
            }
        return null;
        }*/
    public void deleteEmployer(Employer employer){
        employerList.remove(employer);
    }

    public Employer searchEmployer(String euserId) {
        for(Employer employer: employerList){
            if(employer.getEmpID().equals(euserId)){
               return employer; 
            }
            }
        return null;
        }

    
}
