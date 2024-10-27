/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author goutam
 */
public class SuppClass {
    private String suppName;
    private ProductCatalog proCatal;

    public SuppClass() {
    proCatal = new ProductCatalog();
    }

    public String getSuppName() {
        return suppName;
    }

    public void setSuppName(String suppName) {
        this.suppName = suppName;
    }

    public ProductCatalog getProCatal() {
        return proCatal;
    }

    public void setProCatal(ProductCatalog proCatal) {
        this.proCatal = proCatal;
    }

    @Override
    public String toString() {
        return suppName; //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
}
