/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author ajayr
 */
public class CustomerClass implements Comparable<CustomerClass> {
    private static int countNumber = 0;
    private int custID;
    private String custName;
    private String addr;
    private String phnNumb;
    private int buyCountNumber;
    
    public CustomerClass()
    {
        countNumber++;
        custID=countNumber;
    }

    public int getCustID() {
        return custID;
    }

    public static int getCountNumber() {
        return countNumber;
    }

    public static void setCountNumber(int countNumber) {
        CustomerClass.countNumber = countNumber;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getPhnNumb() {
        return phnNumb;
    }

    public void setPhnNumb(String phnNumb) {
        this.phnNumb = phnNumb;
    }

    public int getBuyCountNumber() {
        return buyCountNumber;
    }

    public void setBuyCountNumber(int buyCountNumber) {
        this.buyCountNumber = buyCountNumber;
    }

    @Override
    public String toString()
    {
        return custName;
    }

    @Override
    public int compareTo(CustomerClass o) {
        if(this.getBuyCountNumber()>o.getBuyCountNumber())
        {
            return -1;
        }
        else if(this.getBuyCountNumber()<o.getBuyCountNumber())
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }
}
