/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Organization;

import Model.Drug_Store;
import Model.Role.Role;
import Model.Role.Pharmacist_Role;
import java.util.ArrayList;

/**
 *
 * @author goutam
 */
public class PharmacyOrganization extends Organization {
    private ArrayList<Drug_Store> drugs;

    public PharmacyOrganization() {
        super(Organization.OrganizationType.Pharmacy.getValue());
        drugs = new ArrayList<Drug_Store>();
    }


    @Override
    public ArrayList<Role> getRole() {
        ArrayList<Role> list = new ArrayList<>();
        list.add(new Pharmacist_Role());
        return list;
    }

    public ArrayList<Drug_Store> getDrugs() {
        return drugs;
    }
    public void setDrugs(ArrayList<Drug_Store> drugs) {
        this.drugs = drugs;
    }
    public void addDrug(Drug_Store d) {
        drugs.add(d);
    }
}
