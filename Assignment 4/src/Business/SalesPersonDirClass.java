/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business;

import java.util.ArrayList;

/**
 *
 * @author VAMSI VAS
 */
public class SalesPersonDirClass {
    private ArrayList<SalesPersonClass> salesPrsnDir;

    public SalesPersonDirClass()
    {
        salesPrsnDir= new ArrayList<>();
    }
    public ArrayList<SalesPersonClass> getSalesPrsnDir() {
        return salesPrsnDir;
    }

    public void setSalesPrsnDir(ArrayList<SalesPersonClass> salesPrsnDir) {
        this.salesPrsnDir = salesPrsnDir;
    }
    
    public SalesPersonClass addSalesPrsnData()
    {
        SalesPersonClass sp= new SalesPersonClass();
        salesPrsnDir.add(sp);
        return sp;
    }
}
