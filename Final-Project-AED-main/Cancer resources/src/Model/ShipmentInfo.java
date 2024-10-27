/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.Date;

/**
 *
 * @author goutam
 */
public class ShipmentInfo {
    
private String Delunit;
private String DelStatus;
private String drug_Name;
private int quantity;
private String SNo;
private Date Mfg_d;
private Date Exp_d;

    public String getDelunit() {
        return Delunit;
    }

    public void setDelunit(String Delunit) {
        this.Delunit = Delunit;
    }

    public String getDelStatus() {
        return DelStatus;
    }

    public void setDelStatus(String DelStatus) {
        this.DelStatus = DelStatus;
    }

    public String getDrug_Name() {
        return drug_Name;
    }

    public void setDrug_Name(String drug_Name) {
        this.drug_Name = drug_Name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getSNo() {
        return SNo;
    }

    public void setSNo(String SNo) {
        this.SNo = SNo;
    }

    public Date getMfg_d() {
        return Mfg_d;
    }

    public void setMfg_d(Date Mfg_d) {
        this.Mfg_d = Mfg_d;
    }

    public Date getExp_d() {
        return Exp_d;
    }

    public void setExp_d(Date Exp_d) {
        this.Exp_d = Exp_d;
    }

   

}
