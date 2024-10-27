/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;

import java.util.ArrayList;

/**
 *
 * @author VAMSI VAS
 */
public class PrescriptionRepo {

    private ArrayList<DoctorPrescription> dpresRepo;

    public DoctorPrescription addDocPres() {
        DoctorPrescription dosage = new DoctorPrescription();
        dpresRepo.add(dosage);
        return dosage;

    }

    public ArrayList<DoctorPrescription> getDpresRepo() {
        return dpresRepo;
    }

    public void setDpresRepo(ArrayList<DoctorPrescription> dpresRepo) {
        this.dpresRepo = dpresRepo;
    }

}
