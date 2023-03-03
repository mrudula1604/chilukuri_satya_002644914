/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Business.Branch;
import Business.Library;
import Customer.Customer;
import java.util.ArrayList;

/**
 *
 * @author Chilukuri
 */
public class RentalRequestDirectory {

    ArrayList<RentalRequest> rentalList;
    
    public RentalRequestDirectory() {
        this.rentalList = new ArrayList<RentalRequest>();
    }

    public ArrayList<RentalRequest> getOrderlist() {
        return rentalList;
    }

    public void setOrderlist(ArrayList<RentalRequest> orderlist) {
        this.rentalList = orderlist;
    }
    
    // create a new order
    public RentalRequest createOrder(Customer customer, Branch branch, Library library) {
        RentalRequest o = new RentalRequest(customer, branch, library);
        this.rentalList.add(o);
        return o;
    }
    
    public void approveRequest(String orderId) {
       //
    }
    
    public void returnRental()
    {
    
    }
    
}
