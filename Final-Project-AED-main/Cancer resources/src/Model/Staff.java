/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author goutam
 */
public class Staff {

  private int Monthly_Sal;
  private String name ;
  private String id;

    public int getMonthly_Sal() {
        return Monthly_Sal;
    }

    public void setMonthly_Sal(int Monthly_Sal) {
        this.Monthly_Sal = Monthly_Sal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
  private String Address;
  private int age;
    
}
