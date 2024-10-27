/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.WorkQueue;

import Model.Account;
import java.util.Date;

/**
 *
 * @author goutam
 */
public class Operations_WorkRequest extends Work_Request {
    private String equipName;
    private String expected_Arrival_Time;
    private String urgency_Level;
    private String available;
    private String status;
    private String meds_Name;
    private Account sender;
    private Account receiver;
    private Date request_Date;
    private int Quantity3;

    public String getEquipName() {
        return equipName;
    }

    public void setEquipName(String equipName) {
        this.equipName = equipName;
    }

    public String getExpectedArrivalTime() {
        return expected_Arrival_Time;
    }

    public void setExpectedArrivalTime(String expected_Arrival_Time) {
        this.expected_Arrival_Time = expected_Arrival_Time;
    }

    public String getUrgencyLevel() {
        return urgency_Level;
    }

    public void setUrgencyLevel(String urgency_Level) {
        this.urgency_Level = urgency_Level;
    }

    public String getAvailability() {
        return available;
    }

    public void setAvailability(String availability) {
        this.available = availability;
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

    public Account getSender() {
        return sender;
    }

    public void setSender(Account sender) {
        this.sender = sender;
    }

    public Account getReceiver() {
        return receiver;
    }

    public void setReceiver(Account receiver) {
        this.receiver = receiver;
    }

    public Date getRequest_Date() {
        return request_Date;
    }

    public void setRequest_Date(Date request_Date) {
        this.request_Date = request_Date;
    }

   

    public int getQuantity() {
        return Quantity3;
    }

    public void setQuantity(int Quantity3) {
        this.Quantity3 = Quantity3;
    }
    
    @Override
    public String toString(){
        return this.meds_Name;
    }
   
    
}
