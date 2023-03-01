/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

/**
 *
 * @author Prasad
 */
public class Employee {
    private String employeeId;
    private String employeeName;
    private String designation;
    private float yearsOfExperience;

    public Employee(String empId, String name, String designation, float experience) {
        this.employeeId = empId;
        this.employeeName = name;
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
