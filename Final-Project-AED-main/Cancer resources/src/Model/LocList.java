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
public class LocList {
    
private ArrayList<Loc> addresslist;
ArrayList <Loc> DeliveryLocs;


public LocList(){

addresslist = new ArrayList();

}

    public ArrayList<Loc> getAddresslist() {
        return addresslist;
    }

    public void setAddresslist(ArrayList<Loc> addresslist) {
        this.addresslist = addresslist;
    }

    public ArrayList<Loc> getDeliveryLocs() {
        return DeliveryLocs;
    }

    public void setDeliveryLocs(ArrayList<Loc> DeliveryLocs) {
        this.DeliveryLocs = DeliveryLocs;
    }

public Loc AddLocation(){
 
Loc l = new Loc();
addresslist.add(l);
return l;
}


public ArrayList<Loc> searchLocation(String pin_code){


DeliveryLocs = new ArrayList();
for (Loc l1: addresslist){

if(l1.getZipCode().equals(pin_code)){

DeliveryLocs.add(l1);
return DeliveryLocs;
}

}
return null;

}

}
