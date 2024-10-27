/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author ajayr
 */
public class CustDir {
     private ArrayList<CustomerClass> customerDirectory;
     
     public CustDir()
     {
         customerDirectory=new ArrayList<CustomerClass>();
     }

    public ArrayList<CustomerClass> getCustomerDirectory() {
        return customerDirectory;
    }

    public void setCustDir(ArrayList<CustomerClass> customerDirectory) {
        this.customerDirectory = customerDirectory;
    }
    
    public CustomerClass addCustData()
    {
        CustomerClass customer=new CustomerClass();
        customerDirectory.add(customer);
        return customer;
    }
    
    public void removeCust(CustomerClass customer)
    {
        customerDirectory.remove(customer);
    }
    public CustomerClass searchCust(int id)
    {
         for(CustomerClass c : customerDirectory) {
            if(c.getCustID() == id) {
                return c;
            }
        }
        return null;
    }
    
}
