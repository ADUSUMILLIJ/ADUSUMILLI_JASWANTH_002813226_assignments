/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Harini
 */
public class InsuranceCoverage {
    private String CorporateId;
    private String Address;
    private String premium;
    private String deductable;
    private String AmountToPay;
    private String Benifits;

    public String getCorporateId() {
        return CorporateId;
    }

    public void setCorporateId(String CorporateId) {
        this.CorporateId = CorporateId;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getPremium() {
        return premium;
    }

    public void setPremium(String premium) {
        this.premium = premium;
    }

    public String getDeductable() {
        return deductable;
    }

    public void setDeductable(String deductable) {
        this.deductable = deductable;
    }

    public String getAmountToPay() {
        return AmountToPay;
    }

    public void setAmountToPay(String AmountToPay) {
        this.AmountToPay = AmountToPay;
    }

    public String getBenifits() {
        return Benifits;
    }

    public void setBenifits(String Benifits) {
        this.Benifits = Benifits;
    }
    
}
