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
