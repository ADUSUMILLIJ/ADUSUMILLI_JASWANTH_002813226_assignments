/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import Model.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author jaswa
 */
public class AccountRepo {
    private ArrayList<Account> accountList;
    
    public AccountRepo(){
        accountList = new ArrayList<>();
    } 
    public ArrayList<Account> getAccountList(){
        return accountList;
    }
    public Account validateAccount(String usrnm, String pwd){
        for (Account acc : accountList) {
            System.out.println("Name: " + acc.getUsernm() + " Password: " + acc.getPswd());

            if (usrnm.equals(acc.getUsernm()) && pwd.equals(acc.getPswd())) {
                return acc;
            }
        }
        return null;
    }   
    public Account createUserAccount(String usrnm, String pwd, Employee emp, Role role){
        Account acc = new Account();
        acc.setUsernm(usrnm);
        acc.setPswd(pwd);
        acc.setEmp(emp);
        acc.setRole(role);
        accountList.add(acc);
        return acc;         
    }
    public boolean uniqueAccountCheck(String usernm){
        for (Account acc : accountList){
            if (acc.getUsernm().equals(usernm))
                return false;
        }
        return true;
    }
    
}
