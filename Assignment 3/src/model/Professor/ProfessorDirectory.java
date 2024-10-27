package model.Professor;


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
public class ProfessorDirectory {
    private List<Professor> professors;
    
    public ProfessorDirectory(){
        this.professors = new ArrayList<>();
        Professor p =new Professor();
        p.setId("p1");p.setName("Karl");p.setuName("Karl");p.setPassword("Karl123");p.setEmail("karl@gmail.com");p.setSpecialty("UIUX");
        professors.add(p);
        
        p =new Professor();
        p.setId("p2");p.setName("Laura");p.setuName("Laura");p.setPassword("Laura123");p.setEmail("laura@gmail.com");p.setSpecialty("ENCP");
        professors.add(p);
        
        p =new Professor();
        p.setId("p3");p.setName("Sabolina");p.setuName("Sabolina");p.setPassword("Sabolina123");p.setEmail("sabolina@gmail.com");p.setSpecialty("ENCP");
        professors.add(p);
        
        p =new Professor();
        p.setId("p4");p.setName("Yusuf");p.setuName("Yusuf");p.setPassword("Yusuf123");p.setEmail("yusuf@gmail.com");p.setSpecialty("DMDD");
        professors.add(p);
        
        p =new Professor();
        p.setId("p5");p.setName("Naveen");p.setuName("Naveen");p.setPassword("Naveen123");p.setEmail("naveen@gmail.com");p.setSpecialty("DMDD");
        professors.add(p);
        
        p =new Professor();
        p.setId("p6");p.setName("Amit");p.setuName("Amit");p.setPassword("Amit123");p.setEmail("amit@gmail.com");p.setSpecialty("Political Science");
        professors.add(p);
        
        p =new Professor();
        p.setId("p7");p.setName("Vishal");p.setuName("Vishal");p.setPassword("Vishal123");p.setEmail("vishal@gmail.com");p.setSpecialty("Web Dev");
        professors.add(p);
        
        p =new Professor();
        p.setId("p8");p.setName("Ram");p.setuName("Ram");p.setPassword("Ram123");p.setEmail("ram@gmail.com");p.setSpecialty("Automobile ");
        professors.add(p);
        
        p =new Professor();
        p.setId("p9");p.setName("Catherine");p.setuName("Catherine");p.setPassword("Catherine");p.setEmail("catherine@gmail.com");p.setSpecialty("PSA");
        professors.add(p);
        
        p =new Professor();
        p.setId("p10");p.setName("Lebron");p.setuName("Lebron");p.setPassword("Lebro123");p.setEmail("lebron@gmail.com");p.setSpecialty("OOPS");
        professors.add(p);
        
        
        
        
        
        
    }

    public List<Professor> getProfessors() {
        return professors;
    }

    public void setProfessors(List<Professor> professors) {
        this.professors = professors;
    }
    
    
    public void addProfessor(Professor professor) {
        professors.add(professor);
    }
    
    
    public Professor searchProfessor(String id){
        for(Professor professor: professors){
            if(professor.getId().equals(id)){
               return professor; 
            }
            }
        return null;
        }
    public void deleteProfessor(Professor professor){
        professors.remove(professor);
    }
    
    
}
