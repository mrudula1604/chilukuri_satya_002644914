/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personal;

/**
 *
 * @author Prasad
 */
public class Person {
    String PersonID;
    String name;
    String age;
    private String personID;
    
    public Person() {
        
    }
    public Person (String personID, String name, String age) {
        this.PersonID = personID;
        this.name = name;
        this.age = age;
    }

    public String getPersonId() {
        return PersonID;
    }

    public void setPersonId(String PersonId) {
        this.PersonID = PersonID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
    @override
    public String toString() {
        return this.personID;
    }
    
    
}
