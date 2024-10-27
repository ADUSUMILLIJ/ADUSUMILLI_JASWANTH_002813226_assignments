/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Design;

import Model.Account;
import Model.EcoSystem;
import Model.Employee;
import Model.Role.SystemAdmin_Role;
//mport Code.UsrAcc.UsrAccnt;

/**
 *
 * @author goutam
 */
public class OperateASystem {
public  static EcoSystem configure() {

        EcoSystem eco = EcoSystem.getReferrence();
        Employee emp = eco.getEmpRepo().AddEmployee("NEU");
        // UsrAccnt ua = eco.getUserAccDir().createUserAccount("sps","sps", emp, new Role_SystemAdmin());
        Account ac = eco.getUserAccDir().createUserAccount("sps", "sps", emp, new SystemAdmin_Role());

        return eco;

    }
    
}
