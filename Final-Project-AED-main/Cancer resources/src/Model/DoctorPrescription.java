/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.Date;

/**
 *
 * @author jaswa
 */
public class DoctorPrescription {
    
private String Diagno;
private int freq_day;
private int total_days;
private String Drug;
private Date Date_given;
private String Name_Netw;

    public Date getDategiven() {
        return Date_given;
    }

    public void setDategiven(Date Date_given) {
        this.Date_given = Date_given;
    }

    public String getName_Netw() {
        return Name_Netw;
    }

    public void setName_Netw(String Name_Netw) {
        this.Name_Netw = Name_Netw;
    }

    public String getDiagnosis() {
        return Diagno;
    }

    public void setDiagnosis(String Diagno) {
        this.Diagno = Diagno;
    }

    public int getFrequency_day() {
        return freq_day;
    }

    public void setFrequency_day(int freq_day) {
        this.freq_day = freq_day;
    }

    public int getTotal_days() {
        return total_days;
    }

    public void setTotal_days(int total_days) {
        this.total_days = total_days;
    }

    public String getDrug() {
        return Drug;
    }

    public void setDrug(String Drug) {
        this.Drug = Drug;
    }





}
