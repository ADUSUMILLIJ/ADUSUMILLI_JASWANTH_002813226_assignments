/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author jaswa
 */
public class DrugPantryList {

    private ArrayList<Drug_Store> ListOfDrugs;

    public DrugPantryList() {
        ListOfDrugs = new ArrayList<>();

    }

    public ArrayList<Drug_Store> getListOfDrugs() {
        return ListOfDrugs;
    }

    public void setListOfDrugs(ArrayList<Drug_Store> ListOfDrugs) {
        this.ListOfDrugs = ListOfDrugs;
    }

    public Drug_Store AddDrug() {
        Drug_Store dp = new Drug_Store();
        ListOfDrugs.add(dp);
        return dp;
    }

    public void removeDrug(Drug_Store dp1) {

        ListOfDrugs.remove(dp1);

    }

}
