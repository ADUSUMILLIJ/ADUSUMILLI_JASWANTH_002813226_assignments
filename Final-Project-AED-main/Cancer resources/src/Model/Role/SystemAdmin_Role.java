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
import UI.SystemAdminWorkArea.SystemAdminWorkAreaJPanel;

/**
 *
 * @author goutam
 */
public class SystemAdmin_Role extends Role {
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, Account account, Organization organization, EnterPrise enterprise, EcoSystem system,Network network) {
        return new SystemAdminWorkAreaJPanel(userProcessContainer, system);
    }

    @Override
    public String toString() {
        return "Sys Admin Role";
    }
}
