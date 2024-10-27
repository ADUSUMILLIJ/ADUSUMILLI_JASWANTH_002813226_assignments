/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Organization;

import Model.Role.Role;
import Model.Role.Supplier_Role;
import java.util.ArrayList;

/**
 *
 * @author goutam
 */
public class SupplierOrganization extends Organization {

    public SupplierOrganization(){
        super(Organization.OrganizationType.Supplier.getValue());
    }

    @Override
    public ArrayList<Role> getRole(){
        ArrayList<Role> list = new ArrayList<>();
        list.add(new Supplier_Role());
        return list;
    }
}
