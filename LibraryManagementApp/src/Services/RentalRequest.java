/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Business.Branch;
import Business.Library;
import Customer.Customer;

/**
 *
 * @author Chilukuri
 */
public class RentalRequest {
    
    Customer customer;
    Branch branch;
    Library library;
    private static int count = 0;
    String orderId;
    String status;
    
    public RentalRequest(Customer customer, Branch branch, Library library) {
        this.customer = customer;
        this.branch = branch;
        this.library = library;
        this.status = "requested";
        this.count++;
        
        this.orderId = "Rental_NO"+this.count;
    }

    RentalRequest() {
       
    }

    public Library getLibrary() {
        return library;
    }

    public void setLibrary(Library library) {
        this.library = library;
    }
    
    public Customer getCustomer() {
        return customer;
    }
    
    public Branch getBranch() {
        return branch;
    }

    public void setBranch(Branch branch) {
        this.branch = branch;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    @Override
    public String toString() {
       return this.orderId;
    }    
    
}
