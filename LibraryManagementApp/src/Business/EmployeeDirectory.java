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
public class EmployeeDirectory {
    private ArrayList<Employee> employees;

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(ArrayList<Employee> employees) {
        this.employees = employees;
    }
    
    public Employee addEmployee(String empId, String name, String designation, float experience) {
        Employee emp = new Employee(empId, name, designation, experience);
        employees.add(emp);
        return emp;
    }
    
}
