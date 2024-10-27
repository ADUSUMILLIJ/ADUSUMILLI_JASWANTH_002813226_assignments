/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author VAMSI VAS
 */
public class EmployeeRepo {

    private ArrayList<Employee> E_Repo;

    public EmployeeRepo() {

        E_Repo = new ArrayList<>();
    }

    public Employee AddEmployee(String name) {
        Employee emp = new Employee();
        emp.setEName(name);
        E_Repo.add(emp);
        return emp;
    }

    public ArrayList<Employee> getE_Repo() {
        return E_Repo;
    }

    public void setE_List(ArrayList<Employee> E_Repo) {
        this.E_Repo = E_Repo;
    }

}
