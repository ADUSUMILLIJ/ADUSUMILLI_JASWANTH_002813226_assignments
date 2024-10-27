/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.WorkQueue;

/**
 *
 * @author goutam
 */
public class HealthCareEquipment_WorkRequest extends Work_Request {
    private float actual_price;
    private float loan_price;
    private String equip_Name;
    private String expectedArrivalTime;
    private String urgency_Level;
    private String hospital_Name;
    private int quantity2;
    private String network1;
    private String transport_request_Status;

    public float getActualprice() {
        return actual_price;
    }

    public void setActualprice(float actualprice) {
        this.actual_price = actualprice;
    }

    public float getLoanprice() {
        return loan_price;
    }

    public void setLoanprice(float loan_price) {
        this.loan_price = loan_price;
    }

    public String getEquipName() {
        return equip_Name;
    }

    public void setEquipName(String equip_Name) {
        this.equip_Name = equip_Name;
    }

    public String getExpectedArrivalTime() {
        return expectedArrivalTime;
    }

    public void setExpectedArrivalTime(String expectedArrivalTime) {
        this.expectedArrivalTime = expectedArrivalTime;
    }

    public String getUrgencyLevel() {
        return urgency_Level;
    }

    public void setUrgencyLevel(String urgencyLevel) {
        this.urgency_Level = urgencyLevel;
    }

    public String getHospitalName() {
        return hospital_Name;
    }

    public void setHospitalName(String hospital_Name) {
        this.hospital_Name = hospital_Name;
    }

    public int getQuantity() {
        return quantity2;
    }

    public void setQuantity(int quantity2) {
        this.quantity2 = quantity2;
    }

    public String getNetwork() {
        return network1;
    }

    public void setNetwork(String network1) {
        this.network1 = network1;
    }

    public String getTransportrequestStatus() {
        return transport_request_Status;
    }

    public void setTransportrequestStatus(String transport_request_Status) {
        this.transport_request_Status = transport_request_Status;
    }
    
    @Override
    public String toString(){
        return this.equip_Name;
    }
    
}
