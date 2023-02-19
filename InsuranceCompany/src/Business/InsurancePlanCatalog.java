/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author Chilukuri
 */
public class InsurancePlanCatalog {
     ArrayList<InsurancePlan> insurancePlans;
 
   public InsurancePlanCatalog() {
        this.insurancePlans = new ArrayList<InsurancePlan>();
    }

    public ArrayList<InsurancePlan> getInsurancePlans() {
        return this.insurancePlans;
    }

    public void setInsurancePlans(ArrayList<InsurancePlan> insurancePlans) {
        this.insurancePlans = insurancePlans;
    }
    
    public InsurancePlan createInsurancePlan(
            String planId, String planName, Double costPerMonth) 
    {
        InsurancePlan insurancePlan = new InsurancePlan();
        insurancePlan.setPlanId(planId);
        insurancePlan.setPlanName(planName);
        insurancePlan.setCostPerMonth(costPerMonth);
        insurancePlan.setCostPerYear(costPerMonth);
        
        this.insurancePlans.add(insurancePlan);
        return insurancePlan;
    }
    
    public Boolean checkIfPlanExists(String planId) {
        for(InsurancePlan ip: this.insurancePlans) {
            if(ip.getPlanId().equals(planId)) {
                return false;
            }
        }      
        return true;
    }
    
    public InsurancePlan findInsurancePlan(String planId) {
        for(InsurancePlan ip: this.insurancePlans) {
            if(ip.getPlanId().equals(planId)) {
                return ip;
            }
        }
        return null;
    }  
}
