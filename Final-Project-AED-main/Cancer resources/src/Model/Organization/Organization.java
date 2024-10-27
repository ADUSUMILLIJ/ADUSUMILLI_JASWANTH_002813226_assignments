/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Organization;

import Model.AccountRepo;
import Model.EmployeeRepo;
import Model.Role.Role;
import java.util.ArrayList;
import Model.Doctor;
import Model.DoctorPrescription;
import Model.WorkQueue.HealthCareEquipment_WorkRequest;
import Model.WorkQueue.Work_Queue;
/**
 *
 * @author goutam
 */
public abstract class Organization {

    private String orgName;
    private Work_Queue wq;
    private EmployeeRepo empRepo;
    private AccountRepo userAccRepo;
    private int orgId;
    private static int o;

    private HealthCareEquipment_WorkRequest eqReq;
    public ArrayList<DoctorPrescription> prescriptions;

    public enum OrganizationType {
        Admin("Admin Organization"), Doctor("Doctor Organization"),
        Pharmacy("Pharmacy Organization"), Supplier("Supplier Organization"), MedicalEquipment("Equipment Organization"),
        Transport("Transportation Organization"), MedicalWaste("Medical Waste"),Staff("Staff");

        private String r;

        private OrganizationType(String r) {
            this.r = r;
        }

        public String getValue() {
            return r;
        }

        static class Staff {

            public Staff() {
            }
        }

    }
    public Organization(String orgName) {
        this.orgName = orgName;
        wq = new Work_Queue();
        empRepo = new EmployeeRepo();
        userAccRepo = new AccountRepo();
        orgId = o;
        prescriptions = new ArrayList<DoctorPrescription>();
        ++o;
    }


    public abstract ArrayList<Role> getRole();

    public AccountRepo getUserAccDir() {
        return userAccRepo;
    }

    public int getOrgId() {
        return orgId;
    }

    public EmployeeRepo getEmpRepo() {
        return empRepo;
    }
    
    public void setEmpRepo(EmployeeRepo empRepo) {
        this.empRepo = empRepo;
    }
    
    public String getOrgName() {
        return orgName;
    }
    public Work_Queue getWQ() {
        return wq;
    }
    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }
    public void setWQ(Work_Queue wq) {
        this.wq = wq;
    }


    @Override
    public String toString() {
        return orgName;
    }
}
