/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Customer;
import Services.RentalRequest;
import java.util.ArrayList;

/**
 *
 * @author Nidhi Raghavendra
 */
public class Customer extends Person{
    private ArrayList<RentalRequest> rentalRequests;
    
    public Customer()
    {
        
    }

    public Customer(String customerId, String name) {
        super();
        this.id = customerId;
        this.name = name;
    }
    
    public ArrayList<RentalRequest> getRentalRequests() {
        return rentalRequests;
    }

    public void setRentalRequests(ArrayList<RentalRequest> rentalRequests) {
        this.rentalRequests = rentalRequests;
    }
    
    @Override
    public String toString(){
        return this.id;
    }
    
}
