/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

/**
 *
 * @author Chilukuri
 */
public class InsurancePlan {
    String planId;
    String planName;
    Double costPerMonth;
    Double costPerYear;
    
    public InsurancePlan () {

    }

    public String getPlanId() {
        return planId;
    }

    public void setPlanId(String planId) {
        this.planId = planId;
    }

    public String getPlanName() {
        return planName;
    }

    public void setPlanName(String planName) {
        this.planName = planName;
    }

    public Double getCostPerMonth() {
        return costPerMonth;
    }

    public void setCostPerMonth(Double costPerMonth) {
        this.costPerMonth = costPerMonth;
    }
    
    public Double getCostPerYear() {
        return costPerMonth * 12;
    }

    public void setCostPerYear(Double costPerMonth) {
        this.costPerYear = costPerMonth * 12;
    }
     
    @Override
    public String toString() {
        return this.planId;
    }
}
