/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import Customer.CustomerDirectory;
import Restaurant.DeliveryAgentDirectory;
import Services.MasterOrderDirectory;

/**
 *
 * @author Prasad
 */
public class Business {
    private UserAccountDirectory useraccountDirectory;
    private CustomerDirectory customerDirectory;
    private DeliveryAgentDirectory deliveryAgentDirectory;
    private MasterOrderDirectory allOrder;
    
    public Business () {
        this.useraccountDirectory = new UserAccountDirectory();
        this.customerDirectory = new CustomerDirectory();
        this.deliveryAgentDirectory = new DeliveryAgentDirectory ();
        this.allOrder = new MasterOrderDirectory();
        UserAccount user = this.useraccountDirectory.createUserAccount("admin","admin","manager");
        
    }
    public static Business getBusinessInstance(){
        return new Business();
        
        public UserAccountDirectory getUseraccountDirectory() {
            return useraccountDirectory;
            
            
        }
        
        
    }
    
    
    
}
