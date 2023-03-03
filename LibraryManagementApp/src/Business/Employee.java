/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

/**
 *
 * @author Prasad
 */
public class Employee extends Person {
    private String designation;
    private float yearsOfExperience;

    public Employee(String empId, String name, String designation, float experience) {
        super();
        this.id = empId;
        this.name = name;
        this.designation = designation;
        this.yearsOfExperience = experience;
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
        return this.id;
    }    
}
