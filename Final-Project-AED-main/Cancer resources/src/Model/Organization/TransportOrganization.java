/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Organization;

import Model.Role.Role;
import Model.Role.Transportation_Role;
import java.util.ArrayList;

/**
 *
 * @author goutam
 */
public class TransportOrganization extends Organization {
    public TransportOrganization() {
        super(Organization.OrganizationType.Transport.getValue());
    }

    @Override
    public ArrayList<Role> getRole() {
        ArrayList<Role> list = new ArrayList<>();
        list.add(new Transportation_Role());
        return list;
    }
    
}
