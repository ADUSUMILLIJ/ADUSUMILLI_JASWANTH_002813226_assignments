/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author VAMSI VAS
 */
public class ProductClass implements Comparable<ProductClass> {

    private static int countNumber = 0;
    private String prodName;
    private int modelNumb;
    private int avail;
    private double floorRate;
    private double rate;
    private double ceiligRate;
    private int soldCountNumber;

    public ProductClass() {
        countNumber++;
        modelNumb = countNumber;
    }

    public static int getCountNumber() {
        return countNumber;
    }

    public static void setCountNumber(int countNumber) {
        ProductClass.countNumber = countNumber;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public int getModelNumb() {
        return modelNumb;
    }

    public void setModelNumb(int modelNumb) {
        this.modelNumb = modelNumb;
    }

    public int getAvail() {
        return avail;
    }

    public void setAvail(int avail) {
        this.avail = avail;
    }

    public double getFloorRate() {
        return floorRate;
    }

    public void setFloorRate(double floorRate) {
        this.floorRate = floorRate;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getCeiligRate() {
        return ceiligRate;
    }

    public void setCeiligRate(double ceiligRate) {
        this.ceiligRate = ceiligRate;
    }

    public int getSoldCountNumber() {
        return soldCountNumber;
    }

    public void setSoldCountNumber(int soldCountNumber) {
        this.soldCountNumber = soldCountNumber;
    }

    @Override
    public String toString() {
        return prodName; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int compareTo(ProductClass o) {
        if(this.getSoldCountNumber()>o.getSoldCountNumber())
        {
            return -1;
        }
        else if(this.getSoldCountNumber()<o.getSoldCountNumber())
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }

}
