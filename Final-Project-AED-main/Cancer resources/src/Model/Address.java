/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author jaswa
 */
public class Address {
    private String name;
    private String line1;
    private String line2;
    private String pin_code;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLine_1() {
        return line1;
    }

    public void setLine_1(String line1) {
        this.line1 = line1;
    }

    public String getLine_2() {
        return line2;
    }

    public void setLine_2(String line2) {
        this.line2 = line2;
    }

    public String getPincode() {
        return pin_code;
    }

    public void setPincode(String pin_code) {
        this.pin_code = pin_code;
    }
}
