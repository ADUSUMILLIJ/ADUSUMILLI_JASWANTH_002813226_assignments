/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Organization;

import Model.DoctorPrescription;
import Model.Role.Role;
import Model.Role.Doctor_Role;
import java.util.ArrayList;

/**
 *
 * @author goutam
 */
public class DoctorOrganization extends Organization {
    
    private ArrayList<DoctorPrescription> prescriptions;

    public DoctorOrganization(){
        super(Organization.OrganizationType.Doctor.getValue());
        prescriptions = new ArrayList<DoctorPrescription>();
    }
    
    @Override
    public ArrayList<Role> getRole() {
        ArrayList<Role> list = new ArrayList<>();
        list.add(new Doctor_Role());
        return list;
    }
    
    public ArrayList<DoctorPrescription> getPrescriptions() {
        return prescriptions;
    }

    
    public void setPrescriptions(ArrayList<DoctorPrescription> prescriptions) {
        this.prescriptions = prescriptions;
    }
    
    
    public void addPrescription(DoctorPrescription p){
        prescriptions.add(p);
    }
}
