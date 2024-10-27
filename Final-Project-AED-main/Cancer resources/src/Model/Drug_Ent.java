/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import Model.Role.Role;
import Model.WorkQueue.Work_Queue;
import java.util.ArrayList;
import java.util.concurrent.ForkJoinPool;

/**
 *
 * @author jaswa
 */
public class Drug_Ent extends EnterPrise {
    
private Work_Queue equiptaskq;

public Drug_Ent(String name){

super(name,EnterPrise.EntType.Pharmacy);
equiptaskq = new Work_Queue();

}
// override 
@Override
public ArrayList<Role> getRole(){


return null;
}


















}
