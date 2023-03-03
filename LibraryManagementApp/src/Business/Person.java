/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author Chilukuri
 */
public class Person {
    String id;
    String name;
    
    public Person() {
        
    }
    
    public Person(String personID, String name, String age) {
        this.id = personID;
        this.name = name;
    }

    public String getPersonID() {
        return id;
    }

    public void setPersonID(String personID) {
        this.id = personID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
        
    @Override
    public String toString() {
        return this.id;
    }
    
}
