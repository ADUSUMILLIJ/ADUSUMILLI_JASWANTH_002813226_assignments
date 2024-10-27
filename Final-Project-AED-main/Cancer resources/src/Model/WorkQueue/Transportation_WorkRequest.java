/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.WorkQueue;

import Model.WorkQueue.Work_Request;

//import Schema.UserAccount.UserAccount;

/**
 *
 * @author jaswa
 */
public class Transportation_WorkRequest  extends Work_Request {
    private String Name_of_sender;
    private String time;
    private String time_zone;
    private String Number_of_vehicle;
    private String hospital_Name;
    private String text;
    private String urgency;
    private String equipment_info;
    private int unique_Id;
    private static int count=11001;
    private int request_Id;

    public String getSenderName() {
        return Name_of_sender;
    }

    public void setSenderName(String Name_of_sender) {
        this.Name_of_sender = Name_of_sender;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getTimezone() {
        return time_zone;
    }

    public void setTimezone(String time_zone) {
        this.time_zone = time_zone;
    }

    public String getVehicleNumber() {
        return Number_of_vehicle;
    }

    public void setVehicleNumber(String Number_of_vehicle) {
        this.Number_of_vehicle = Number_of_vehicle;
    }

    public String getHospitalName() {
        return hospital_Name;
    }

    public void setHospitalName(String hospital_Name) {
        this.hospital_Name = hospital_Name;
    }

    public String getMessage() {
        return text;
    }

    public void setMessage(String message) {
        this.text = message;
    }

    public String getUrgency() {
        return urgency;
    }

    public void setUrgency(String urgency) {
        this.urgency = urgency;
    }

    public String getEquipmentinfo() {
        return equipment_info;
    }

    public void setEquipmentinfo(String equipment_info) {
        this.equipment_info= equipment_info;
    }

    public int getUniqueId() {
        return unique_Id;
    }

    public void setUniqueId(int unique_Id) {
        this.unique_Id = unique_Id;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Transportation_WorkRequest.count = count;
    }

    public int getRequestId() {
        return request_Id;
    }

    public void setRequestId(int request_Id) {
        this.request_Id = request_Id;
    }
    
    
    
    public Transportation_WorkRequest(){
        count++;
        unique_Id=count;
    }
    
    @Override
public String toString() {
    return this.getHospitalName(); // Assuming getHospitalName() is a method that returns the hospital name
}
    
}
