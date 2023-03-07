/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Customer;

import java.util.ArrayList;

/**
 *
 * @author Nidhi Raghavendra
 */
public class CustomerDirectory {
    ArrayList<Customer> customerlist;
    
    public CustomerDirectory() {
        this.customerlist = new ArrayList<Customer>();
    }

    public ArrayList<Customer> getCustomerlist() {
        return customerlist;
    }

    public void setCustomerlist(ArrayList<Customer> customerlist) {
        this.customerlist = customerlist;
    }
    
    // implement code below
    public Customer createCustomer(String customerId, String customerName) {
        Customer c = new Customer(customerId, customerName);
        this.customerlist.add(c);
        return c;
        
    }
    
    public boolean checkIfCustomerExists(String customerId)
    {
        for(Customer c: this.customerlist) {
            if(c.getPersonID().equals(customerId)) {
                return true;
            }
        }      
        return false;
    }
}
