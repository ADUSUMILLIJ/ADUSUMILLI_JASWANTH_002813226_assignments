/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.WorkQueue;

/**
 *
 * @author goutam
 */
public class Supplier_WorkRequest  extends Work_Request {
    
    private String meds_Name;
    private int Quantity5;
    private String delivery_Time;

    public String getMedicationName() {
        return meds_Name;
    }

    public void setMedicationName(String meds_Name) {
        this.meds_Name = meds_Name;
    }

    public int getQuantity() {
        return Quantity5;
    }

    public void setQuantity(int Quantity5) {
        this.Quantity5 = Quantity5;
    }

    public String getDeliveryTime() {
        return delivery_Time;
    }

    public void setDeliveryTime(String deliveryTime) {
        this.delivery_Time = delivery_Time;
    }
    
    @Override
    public String toString(){
        return this.meds_Name;
    }
    
}
