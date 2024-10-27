/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author goutam
 */
public class ShippingList {
  


private ArrayList<ShipmentInfo> Order_List;

public ShippingList(){

Order_List = new ArrayList();

}

    public ArrayList<ShipmentInfo> getOrder_List() {
        return Order_List;
    }

    public void setOrder_List(ArrayList<ShipmentInfo> Order_List) {
        this.Order_List = Order_List;
    }



public ShipmentInfo addOrder(){


ShipmentInfo si = new ShipmentInfo();
Order_List.add(si);
return si;

}


}
