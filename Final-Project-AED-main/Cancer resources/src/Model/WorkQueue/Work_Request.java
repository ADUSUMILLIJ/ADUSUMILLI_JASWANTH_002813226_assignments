/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.WorkQueue;

import Model.Account;
import java.util.Date;



/**
 *
 * @author jaswa
 */
public class Work_Request {
    private String text;
    private Account sender;
    private Account receiving;
    private String status;
    private String requesting_Date;
    private Date resolving_Date;

    public String getMessage() {
        return text;
    }

    public void setMessage(String message) {
        this.text = message;
    }

    public Account getSender() {
        return sender;
    }

    public void setSender(Account sender) {
        this.sender = sender;
    }

    public Account getReceiver() {
        return receiving;
    }

    public void setReceiver(Account receiver) {
        this.receiving = receiver;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getRequestDate() {
        return requesting_Date;
    }

    public void setRequestDate(String requesting_Date) {
        this.requesting_Date = requesting_Date;
    }

    public Date getResolveDate() {
        return resolving_Date;
    }

    public void setResolveDate(Date resolving_Date) {
        this.resolving_Date = resolving_Date;
    }
    
    @Override
    public String toString(){
        return this.text;
    }
    
    
    
}
