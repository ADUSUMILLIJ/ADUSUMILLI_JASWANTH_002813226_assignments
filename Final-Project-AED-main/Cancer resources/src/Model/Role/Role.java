/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Role;

import Model.Account;
import Model.EcoSystem;
import Model.EnterPrise;
import Model.Network;
import Model.Organization.Organization;
import javax.swing.JPanel;

/**
 *
 * @author goutam
 */
public abstract class Role {
    public enum RoleType{
        Admin("Admin"), 
        Doctor("Doctor"),
        Logistics("Logistics"), 
        Pharmacist("Pharmacist");
        
        private String w;

        private RoleType(String w){
            this.w = w;
            }

        public String getRoleValue() {
            return w;
        }

        public void setRoleValue(String w) {
            this.w = w;
        }
        
        @Override 
        public String toString(){
            return w;
        }
    }
    
    public abstract JPanel createWorkArea (JPanel userProcessContainer, Account account, Organization organization, EnterPrise enterprise, EcoSystem business, Network network);
    @Override
    public String toString(){
        return this.getClass().getName();
    }
}
