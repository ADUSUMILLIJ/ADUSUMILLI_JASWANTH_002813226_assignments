/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author VAMSI VAS
 */
public class ProductCatalog {
    
    private List<ProductClass> productCatalog;

    public ProductCatalog() {
    productCatalog = new ArrayList<ProductClass>();
    }
    
    public List<ProductClass> getProductcatalog(){
        return productCatalog;
    }
    
    
    public ProductClass addProduct(){
        ProductClass p = new ProductClass();
        productCatalog.add(p);
        return p;
    }
    
    public void removeProduct(ProductClass p){
        productCatalog.remove(p);
    }
    
    public ProductClass searchProduct(int id){
        for (ProductClass product : productCatalog) {
            if(product.getModelNumb()==id){
                return product;
            }
        }
        return null;
    }
}
