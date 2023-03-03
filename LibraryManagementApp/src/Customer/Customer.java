/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Customer;
import Business.Person;

/**
 *
 * @author Nidhi Raghavendra
 */
public class Customer extends Person{
    private String customerId;
    private String designation;
    private float yearsOfExperience;

    public Customer(String empId, String name, String designation, float experience) {
        super();
        this.employeeId = empId;
        this.name = name;
        this.designation = designation;
        this.yearsOfExperience = experience;
    }
    
    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public float getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(float yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }
    
    @Override
    public String toString(){
        return this.employeeId;
    }
    
}
