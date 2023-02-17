/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author Mrudula
 */
public class Catalog {
    VaccineCatalog vaccines;
    InsurancePlanCatalog insurancePlans;
    
    public Catalog() {
        this.vaccines = new VaccineCatalog();
        this.insurancePlans = new InsurancePlanCatalog();
    }

    public VaccineCatalog getVaccines() {
        return vaccines;
    }

    public void setVaccines(VaccineCatalog vaccines) {
        this.vaccines = vaccines;
    }

    public InsurancePlanCatalog getInsurancePlans() {
        return insurancePlans;
    }

    public void setInsurancePlanCatalog(InsurancePlanCatalog insurancePlans) {
        this.insurancePlans = insurancePlans;
    }
    
    
}
