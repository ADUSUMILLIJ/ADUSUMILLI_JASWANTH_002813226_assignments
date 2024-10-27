/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.WorkQueue;

//import Code.UserAccount.UserAccount;

/**
 *
 * @author goutam
 */
import Model.Account;
import java.util.Date;

public class Doctor_WorkRequest {
    private Account send;
    private Account receive;
    private String medicine_Name;
    private String patient_Name;
    private String hospital_Name;
    private String status1;
    private Date request_Date;
    private int Quantity1;

    public Account getSender() {
        return send;
    }

    public void setSender(Account sender) {
        this.send = sender;
    }

    public Account getReceiver() {
        return receive;
    }

    public void setReceiver(Account receiver) {
        this.receive = receiver;
    }

    public String getMedicineName() {
        return medicine_Name;
    }

    public void setMedicineName(String medicine_Name) {
        this.medicine_Name = medicine_Name;
    }

    public String getPatientName() {
        return patient_Name;
    }

    public void setPatientName(String patientName) {
        this.patient_Name = patientName;
    }

    public String getHospitalName() {
        return hospital_Name;
    }

    public void setHospitalName(String hospitalName) {
        this.hospital_Name = hospitalName;
    }

    public String getStatus() {
        return status1;
    }

    public void setStatus(String status1) {
        this.status1 = status1;
    }

    public Date getRequestDate() {
        return request_Date;
    }

    public void setRequestDate(Date requestDate) {
        this.request_Date = requestDate;
    }

    public int getQuantity() {
        return Quantity1;
    }

    public void setQuantity(int Quantity1) {
        this.Quantity1= Quantity1;
    }
    
    public Doctor_WorkRequest(){
        request_Date = new Date();
    }
    
}
