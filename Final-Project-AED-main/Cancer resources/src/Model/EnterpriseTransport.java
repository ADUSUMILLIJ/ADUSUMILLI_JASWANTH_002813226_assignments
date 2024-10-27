/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import Model.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author VAMSI VAS
 */
public class EnterpriseTransport extends EnterPrise {
    
    public EnterpriseTransport(String Name){

super(Name, EnterPrise.EntType.Logistics);

}
//@Override get SupportedRole()
public ArrayList<Role> getRole(){


return null;

}

}
