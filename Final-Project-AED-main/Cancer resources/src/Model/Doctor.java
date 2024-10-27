/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author jaswa
 */
public class Doctor {

    private String Name;
    private PrescriptionRepo presRepo;   
    public Doctor() {

        presRepo = new PrescriptionRepo();
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public PrescriptionRepo getPresList() {
        return presRepo;
    }

    public void setPresList(PrescriptionRepo presList) {
        this.presRepo = presList;
    }
    public String getName() {
        return Name;
    }

}
