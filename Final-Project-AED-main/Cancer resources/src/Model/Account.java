/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import Model.Role.Role;
import Model.WorkQueue.Work_Queue;

/**
 *
 * @author jaswa
 */
public class Account {
    private String usernm;
    private Role role;
    private String pswd;
    private Work_Queue workQ;
    private Employee emp;


  public Account(){
  workQ = new Work_Queue();
}
    public String getUsernm() {
        return usernm;
    }

    public void setUsernm(String usernm) {
        this.usernm = usernm;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public String getPswd() {
        return pswd;
    }

    public void setPswd(String pswd) {
        this.pswd = pswd;
    }

    public Work_Queue getWorkQ() {
        return workQ;
    }

    public void setWorkQ(Work_Queue workQ) {
        this.workQ = workQ;
    }

    public Employee getEmp() {
        return emp;
    }

    public void setEmp(Employee emp) {
        this.emp = emp;
    }
}
