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
import UI.Role_Administration.WorkAreaPanel_Admin;
import javax.swing.JPanel;

/**
 *
 * @author goutam
 */
public class Admin_Role extends Role {
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, Account account, Organization organization, EnterPrise enterprise, EcoSystem business,Network network) {
        return new WorkAreaPanel_Admin(userProcessContainer, enterprise);
    }

    @Override
    public String toString() {
        return "Admin Role";
    }
}
