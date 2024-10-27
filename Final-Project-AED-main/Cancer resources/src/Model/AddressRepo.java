/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author jaswa
 */
public class AddressRepo {
    private ArrayList<Address> addRep;
    ArrayList<Address> viewAddRep;
    
    public AddressRepo(){
        addRep = new ArrayList<>();
    }

    public ArrayList<Address> getAddRep() {
        return addRep;
    }

    public void setAddRep(ArrayList<Address> addRep) {
        this.addRep = addRep;
    }

    public ArrayList<Address> getViewAddRep() {
        return viewAddRep;
    }

    public void setViewAddRep(ArrayList<Address> viewAddRep) {
        this.viewAddRep = viewAddRep;
    }
    
    public Address insertAddress() {
        Address add = new Address();
        addRep.add(add);
        return add;
    }

    public ArrayList<Address> findAddress(String zip) {
        viewAddRep = new ArrayList<>();
        for (Address a : addRep) {
            if (a.getPincode().equals(zip)) {
                viewAddRep.add(a);
                return viewAddRep;
            }
        }
        return null;
    }
}
