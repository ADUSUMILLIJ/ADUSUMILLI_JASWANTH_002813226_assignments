/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.WorkQueue;

import java.util.ArrayList;


/**
 *
 * @author jaswa
 */
public class Work_Queue {
    private ArrayList<Work_Request> work_Request_List;
    
    public Work_Queue(){
        work_Request_List = new ArrayList<>();
    }
    public ArrayList<Work_Request>getWorkRequestList(){
        return work_Request_List;
    }
    
    
}
