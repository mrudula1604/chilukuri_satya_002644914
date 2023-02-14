/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;
import java.util.ArrayList;

/**
 *
 * @author Prasad
 */
public class UserAccountDirectory {
    ArrayList<UserAccount> useraccountlist;
    
    public UserAccountDirectory () {
    this.useraccountlist = new ArrayList<UserAccount> ();
    
    
}
    public UserAccount createUserAccount (String username, String password, String role){
        UserAccount user = new UserAccount (username, password, role);
        
        useraccountlist.add(user);
       return user;
       
    }
    public UserAccount findById(String id) {
        for(UserAccount u: this.useraccountlist) {
            if(u.getAccountId().equals(id)) {
                return u;
            }
                
            }
            
        }

    return null;
}
