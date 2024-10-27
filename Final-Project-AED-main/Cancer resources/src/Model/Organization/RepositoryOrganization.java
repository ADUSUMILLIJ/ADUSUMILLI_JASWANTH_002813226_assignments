/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Organization;

import Model.DB4OUtil.DB4OUtil;
import Model.Organization.Organization.OrganizationType;
import com.db4o.ObjectContainer;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author goutam
 */
public class RepositoryOrganization {
    
    private ArrayList<Organization> organizations;
    public RepositoryOrganization() {
        organizations = new ArrayList<>();
    }

    public ArrayList<Organization> getOrganizations() {
        return organizations;
    }

    public void setOrganizations(ArrayList<Organization> organizations) {
        this.organizations = organizations;
    }
    
    public Organization addOrg(OrganizationType t) {

        Organization org = null;
        if (OrganizationType.Doctor.getValue().equalsIgnoreCase(t.getValue())) {
            org = new DoctorOrganization();
            organizations.add(org);
        } else if (OrganizationType.Pharmacy.getValue().equalsIgnoreCase(t.getValue())) {
            org = new PharmacyOrganization();
            organizations.add(org);
        } else if (OrganizationType.Supplier.getValue().equalsIgnoreCase(t.getValue())) {
            org = new SupplierOrganization();
            organizations.add(org);
        } else if (OrganizationType.MedicalEquipment.getValue().equalsIgnoreCase(t.getValue())) {
            org = new EquipmentHandlingOrganization();
            organizations.add(org);
        } else if (OrganizationType.Transport.getValue().equalsIgnoreCase(t.getValue())) {
            org = new TransportOrganization();
            organizations.add(org);
        }
        return org;
    }
  
    
   

    public boolean removeOrganizationById(int orgId) {
        Iterator<Organization> it = organizations.iterator();
        while (it.hasNext()) {
            Organization org = it.next();
            if (org.getOrgId() == orgId) {
                it.remove(); // Remove the organization from the list
                return true; // Return true if removal was successful
            }
        }
        return false; // Return false if the organization was not found
    }



    
}
