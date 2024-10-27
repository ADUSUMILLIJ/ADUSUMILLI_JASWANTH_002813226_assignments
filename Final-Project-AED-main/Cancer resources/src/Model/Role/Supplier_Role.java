/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Role;

import Model.Account;
import Model.EcoSystem;
import Model.EnterPrise;
import javax.swing.JPanel;
import Model.Network;
import Model.Organization.Organization;
import UI.Role_Supplier.WorkAreaPanel_Supplier;

/**
 *
 * @author goutam
 */
public class Supplier_Role extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, Account account, Organization organization, EnterPrise enterprise, EcoSystem business,Network network) {
        return new WorkAreaPanel_Supplier(userProcessContainer,business,account,organization);
    }

    @Override
    public String toString() {
        return "Support Role";
    }
}
