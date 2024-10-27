/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Organization;

import Model.Role.Role;
import Model.Role.MedicalEquipment_Role;
import java.util.ArrayList;

/**
 *
 * @author goutam
 */
public class EquipmentHandlingOrganization extends Organization {

    public EquipmentHandlingOrganization() {
        super(Organization.OrganizationType.MedicalEquipment.getValue());
    }
    
    
    @Override 
    public ArrayList<Role> getRole() {
        ArrayList<Role> list = new ArrayList<>();
        list.add(new MedicalEquipment_Role());
        return list;
    }
}
