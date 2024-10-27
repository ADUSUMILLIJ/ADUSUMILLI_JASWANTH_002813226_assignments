/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Design;

import Model.Organization.AdminOrganization;
import Model.Product;
import Model.WorkQueue.HealthCareEquipment_WorkRequest;
import Model.WorkQueue.Doctor_WorkRequest;
import Model.WorkQueue.Pharmacy_WorkRequest;
import java.util.Random;

/**
 *
 * @author goutam
 */
public class DataGenerator {
  

 private static String[] equipName = {"Oxygen Cylinders","Covid Testing Kits","PulseOxymeters","Stethescope", "Thermometer", "Syringe", "Beds", "BP Kits", "Diabetes Machines"};
    private static String[] medName = {"Synthroid", "Crestor", "Ventolin", "esomeprazole", "insulin", "infliximab", "fluticasone", "rosuvastatin"};
    private static String[] network = {"Boston", "Seattle", "Washington DC", "FLORIDA"};
    private static String[] hospName = {"AH", "TGH", "Boston Medical", "Brigham", "General Hospitals", "Smile Hospitals", "Cape cod"};
    private static String[] beginning = {"kr",  "Ho", "Lj", "pg", "ca", "Ra", "kre", "lop", "mat"};
    private static String[] middle = {"air", "cal", "hkg", "pokre", "lojop", "Pla", "ghdo", "kal", "mploat"};
    private static String[] orgName = {"Doctor", "Pharmacy", "Equipment", "Supplier", "Transportation"};
    private static String[] vaccineName = {"Meningococcal", "Hepititis B", "MMR", "Tdap", "HPV", "Seasonal Flu", "Varicella"};

    private static Random rand = new Random();
    
    
    public static String generateEquipName() {
        return equipName[rand.nextInt(equipName.length)];
    }

    
    
    public static String generateNetwork() {
        return network[rand.nextInt(network.length)];
    }

    
    
    public static String generateSuppliers() {

        return beginning[rand.nextInt(beginning.length)] + middle[rand.nextInt(middle.length)];
    }

    
    
    public static String generatePaitents() {

        return beginning[rand.nextInt(beginning.length)] + middle[rand.nextInt(middle.length)];
    }

    
    
    public static String generateHospName() {
        return hospName[rand.nextInt(hospName.length)];
    }

    
    
    public static String generationOrgName() {
        return orgName[rand.nextInt(orgName.length)];
    }

    
    
    public static String generateVaccineName() {
        return vaccineName[rand.nextInt(vaccineName.length)];

    }

    
    
    public static String generateMedName() {

        return medName[rand.nextInt(medName.length)];
    }

    
    
    public static HealthCareEquipment_WorkRequest InitMedicalRequest() {
        HealthCareEquipment_WorkRequest request = new HealthCareEquipment_WorkRequest();
        request.setEquipName(generateEquipName());
        request.setNetwork(generateNetwork());
        return request;
    }

    
    
    public static Pharmacy_WorkRequest InitSupplierInfo() {
        Pharmacy_WorkRequest request = new Pharmacy_WorkRequest();
        request.setSupplierName(generateSuppliers());
        request.setNetwork(generateNetwork());
        return request;
    }

    
    public static Doctor_WorkRequest InitPaitenceInfo() {
    Doctor_WorkRequest request = new Doctor_WorkRequest();
    request.setHospitalName(generateHospName());
    request.setPatientName(generatePaitents());
    return request;
    }

    
    public static AdminOrganization InitOrgName() {
    AdminOrganization request = new AdminOrganization();
    request.setOrgName(generationOrgName());
    return request;
    }

    
    public static Product InitVaccineName() {
    Product request = new Product();
        request.setVaccineName(generateVaccineName());
        request.setHospitalName(generateHospName());
        return request;
    }

    
    
    public static Product InitMedicineName() {
     Product request = new Product();
       request.setDrugName(generateMedName());
       return request;
    }
   
    
}