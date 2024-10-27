package Business;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author VAMSI VAS
 */
public class OrderClass {

    private static int countNumber = 0;
    private ArrayList<OrderItemClass> orderItemL;
    private int orderNumb;
    private CustomerClass cust;
    private SalesPersonClass salesP;
    private Double orderT;
    private Date orderD;
    public OrderClass() {
        countNumber++;
        orderNumb = countNumber;
        orderItemL = new ArrayList<>();
        orderD= new Date();
    }
    
    public int getOrderNumb() {
        return orderNumb;
    }
    
    public void removeOrderI(OrderItemClass o) {
        orderItemL.remove(o);
    }
    
    public OrderItemClass addOrderI(ProductClass p, int q, double price) {
        OrderItemClass o = new OrderItemClass();
        o.setProd(p);
        o.setQuant(q);
        o.setSalesPrice(price);
        orderItemL.add(o);
        return o;
    }
    
    public ArrayList<OrderItemClass> getOrderItemL() {
        return orderItemL;
    }
    
    public void setOrderItemL(ArrayList<OrderItemClass> orderItemL) {
        this.orderItemL = orderItemL;
    }

    public CustomerClass getCust() {
        return cust;
    }

    public void setCust(CustomerClass cust) {
        this.cust = cust;
    }

    public SalesPersonClass getSalesP() {
        return salesP;
    }

    public void setSalesP(SalesPersonClass salesP) {
        this.salesP = salesP;
    }

    public Double getOrderT() {
        return orderT;
    }

    public void setOrderT(Double orderT) {
        this.orderT = orderT;
    }

    public Date getOrderD() {
        return orderD;
    }

    public void setOrderD(Date orderD) {
        this.orderD = orderD;
    }
    
    @Override
    public String toString()
    {
        return String.valueOf(orderNumb);
    }
}
