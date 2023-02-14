/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Customer;
import Personal.Person;
import Services.Order;
import java.util.ArrayList;


      

/**
 *
 * @author Prasad
 */
public class Customer extends Person{
    private int ordersTotal;
    
    private ArrayList<order> customerOrderlist;
    
    public Customer() {
        super();
        this.customerOrderlist = new ArrayList<Order> ();
        
    }

    public int getOrdersTotal() {
        return ordersTotal;
    }

    public void setOrdersTotal(int ordersTotal) {
        this.ordersTotal = ordersTotal;
    }

    public ArrayList<order> getCustomerOrderlist() {
        return customerOrderlist;
    }

    public void setCustomerOrderlist(ArrayList<order> customerOrderlist) {
        this.customerOrderlist = customerOrderlist;
    }
    
}
  
