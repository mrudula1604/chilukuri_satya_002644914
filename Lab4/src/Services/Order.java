/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import Customer.Customer;
import Restaurant.DeliveryAgent;

/**
 *
 * @author Prasad
 */
public class Order {
    Customer customer;
    DeliveryAgent agent;
    private static int count = 0;
    String orderId;
    String status;
    
    public Order() {
        this.customer = new Customer();
        this.agent = new DeliveryAgent();
        this.count++;
        
        
    }
    
    
}
