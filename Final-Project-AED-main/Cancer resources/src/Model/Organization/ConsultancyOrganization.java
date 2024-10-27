/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Organization;

import Model.Role.Role;
import Model.Role.Doctor_Role;
import Model.Role.Staff_Role;
import Model.Staff;
import java.util.ArrayList;

/**
 *
 * @author goutam
 */
public class ConsultancyOrganization extends Organization {
     

private ArrayList<Staff> Staff_list ;

public ConsultancyOrganization(){
super(Organization.OrganizationType.Staff.getValue());
   Staff_list =  new ArrayList();
}


 @Override
    public ArrayList<Role> getRole() {
        ArrayList<Role> list = new ArrayList<>();
        list.add(new Staff_Role());
        return list;
    }
    
}
