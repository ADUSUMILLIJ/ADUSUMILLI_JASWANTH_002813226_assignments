/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.WorkQueue;

import java.util.Date;

/**
 *
 * @author goutam
 */
public class Pharmacy_WorkRequest extends Work_Request {
    private String req_Date;
    private String status ;
    private String meds_Name;
    private int Quantity4;
    private String network;
    private String suppliers_Name;

    public String getRequestDate() {
        return req_Date;
    }

    public void setRequestDate(String req_Date) {
        this.req_Date = req_Date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMedicationName() {
        return meds_Name;
    }

    public void setMedicationName(String meds_Name) {
        this.meds_Name = meds_Name;
    }

    public int getQuantity() {
        return Quantity4;
    }

    public void setQuantity(int Quantity4) {
        this.Quantity4 = Quantity4;
    }

    public String getNetwork() {
        return network;
    }

    public void setNetwork(String network) {
        this.network = network;
    }

    public String getSupplierName() {
        return suppliers_Name;
    }

    public void setSupplierName(String suppliers_Name) {
        this.suppliers_Name = suppliers_Name;
    }
    
    @Override
    public String toString(){
        return this.meds_Name;
    }
    public String getReceiverUsername() {
    return suppliers_Name;
}
}
