/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business;

import java.util.Comparator;

/**
 *
 * @author VAMSI VAS
 */
public class SalesPersonClass implements Comparable<SalesPersonClass>, Comparator<SalesPersonClass>{
    public static int countNumber=0;
    private int salesPersId;
    private String salesPersName;
    private int floorComm;
    private int ceilComm;
    private Double totalComm;
    private int abvTrgt;
    private int blwTrgt;
    
    public SalesPersonClass()
    {
        countNumber++;
        salesPersId=countNumber;
        /*Setting default commissions*/
        floorComm=5;
        ceilComm=10;
        totalComm=0.0;
    }

    public int getSalesPersId() {
        return salesPersId;
    }

    public void setSalesPersId(int salesPersId) {
        this.salesPersId = salesPersId;
    }

    public String getSalesPersName() {
        return salesPersName;
    }

    public void setSalesPersName(String salesPersName) {
        this.salesPersName = salesPersName;
    }

    public int getFloorComm() {
        return floorComm;
    }

    public void setFloorComm(int floorComm) {
        this.floorComm = floorComm;
    }

    public int getCeilComm() {
        return ceilComm;
    }

    public void setCeilComm(int ceilComm) {
        this.ceilComm = ceilComm;
    }

    public Double getTotalComm() {
        return totalComm;
    }

    public void setTotalComm(Double totalComm) {
        this.totalComm = totalComm;
    }

    public int getAbvTrgt() {
        return abvTrgt;
    }

    public void setAbvTrgt(int abvTrgt) {
        this.abvTrgt = abvTrgt;
    }

    public int getBlwTrgt() {
        return blwTrgt;
    }

    public void setBlwTrgt(int blwTrgt) {
        this.blwTrgt = blwTrgt;
    }
    
    @Override
    public String toString()
    {
        return this.salesPersName;
    }

    @Override
    public int compareTo(SalesPersonClass o) {
        if(this.getTotalComm()>o.getTotalComm())
        {
            return 1;
        }
        else if(this.getTotalComm()<o.getTotalComm())
        {
            return -1;
        }
        else
        {
            return 0;
        }
    }

    @Override
    public int compare(SalesPersonClass o1, SalesPersonClass o2) {
        int soldCount1=o1.abvTrgt+o1.blwTrgt;
        int soldCount2=o2.abvTrgt+o2.blwTrgt;
        if(soldCount1>soldCount2)
        {
            return -1;
        }
        else if(soldCount1<soldCount2)
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }
}
