package Business;

import Business.UserAccountDirectory;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nidhi Raghavendra
 */
public class Branch {
    String BranchId;
    String name;
    UserAccountDirectory branchuseraccountDirectory;
    Library library;
    
    public Branch(String name, Library library) {
        this.name = name;
        this.branchuseraccountDirectory = new UserAccountDirectory();
        this.library = library;
    }
    
    public Branch(String branchId, String name)
    {
        this.BranchId = branchId;
        this.name = name;
    }
    
    public String getBranchId() {
        return BranchId;
    }

    public void setBranchId(String BranchId) {
        this.BranchId = BranchId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UserAccountDirectory getBranchuseraccountDirectory() {
        return branchuseraccountDirectory;
    }

    public void setBranchuseraccountDirectory(UserAccountDirectory branchuseraccountDirectory) {
        this.branchuseraccountDirectory = branchuseraccountDirectory;
    }
    
    public Library getLibrary() {
        return library;
    }

    public void setLibrary(Library library) {
        this.library = library;
    }
    
    
}
