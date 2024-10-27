/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Harini
 */
public class patient {
    private String patientID;
    private String PrimaryDoctor;
    private String DOLV;
    private String DONA;
    private String allergies;
    private String onMedication;
    private String InsuranceCoverage;

    public String getPatientID() {
        return patientID;
    }

    public void setPatientID(String patientID) {
        this.patientID = patientID;
    }

    public String getPrimaryDoctor() {
        return PrimaryDoctor;
    }

    public void setPrimaryDoctor(String PrimaryDoctor) {
        this.PrimaryDoctor = PrimaryDoctor;
    }

    public String getDOLV() {
        return DOLV;
    }

    public void setDOLV(String DOLV) {
        this.DOLV = DOLV;
    }

    public String getDONA() {
        return DONA;
    }

    public void setDONA(String DONA) {
        this.DONA = DONA;
    }

    public String getAllergies() {
        return allergies;
    }

    public void setAllergies(String allergies) {
        this.allergies = allergies;
    }

    public String getOnMedication() {
        return onMedication;
    }

    public void setOnMedication(String onMedication) {
        this.onMedication = onMedication;
    }

    public String getInsuranceCoverage() {
        return InsuranceCoverage;
    }

    public void setInsuranceCoverage(String InsuranceCoverage) {
        this.InsuranceCoverage = InsuranceCoverage;
    }
    
}
