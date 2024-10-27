package Business;

import java.util.ArrayList;

/**
 *
 * @author VAMSI VAS
 */
public class MasterOrderCatalClass {

    private ArrayList<OrderClass> orderCatal;
    
    public MasterOrderCatalClass() {
        orderCatal = new ArrayList<>();
    }
    
    public ArrayList<OrderClass> getOrderCatal() {
        return orderCatal;
    }
    
    public OrderClass addOrder(OrderClass o) {
        orderCatal.add(o);
        return o;
    }
    
}
