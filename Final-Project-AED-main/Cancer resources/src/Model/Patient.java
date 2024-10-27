/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author VAMSI VAS
 */
public class Patient {


private int PId;
private int PAge;
private String PName;
private String PGend;

  

    public int getPAge() {
        return PAge;
    }

    public void setPAge(int PAge) {
        this.PAge = PAge;
    }

    public String getPName() {
        return PName;
    }

    public void setPName(String PName) {
        this.PName = PName;
    }

 public int getPId() {
        return PId;
    }

    public void setPId(int PId) {
        this.PId = PId;
    }
    
 public String getPGend() {
        return PGend;
    }

    public void setPGend(String PGend) {
        this.PGend = PGend;
    }
}
