package Business;

/**
 *
 * @author VAMSI VAS
 */
public class OrderItemClass {

    private ProductClass prod;
    private int quant;
    private Double salesPrice;
    private Double salesComm;
    
    public ProductClass getProd() {
        return prod;
    }
    
    public void setProd(ProductClass prod) {
        this.prod = prod;
    }
    
    public int getQuant() {
        return quant;
    }
    
    public void setQuant(int quant) {
        this.quant = quant;
    }

    public Double getSalesPrice() {
        return salesPrice;
    }

    public void setSalesPrice(Double salesPrice) {
        this.salesPrice = salesPrice;
    }

    public Double getSalesComm() {
        return salesComm;
    }

    public void setSalesComm(Double salesComm) {
        this.salesComm = salesComm;
    }
    
    @Override
    public String toString() {
        return prod.getProdName();
    }
    
}
