/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Prasad
 */
public class ApplicationDirectory {
    ArrayList<Application> applicationsList;
 
   public ApplicationDirectory() {
        this.applicationsList = new ArrayList<Application>();
    }

    public ArrayList<Application> getApplications() {
        return this.applicationsList;
    }

    public void setApplications(ArrayList<Application> applicationsList) {
        this.applicationsList = applicationsList;
    }
    
    public Application createApplication(
            String applicationId,
            String applicantFirstName,
            String applicantLastName,
            Date applicationDate,
            String petName,
            float petAge,
            String petBreed,
            String pettype,
            String petGender,
            ArrayList<Vaccine> petVaccinations,
            InsurancePlan petInsurancePlan
            ) 
    {
        Application application = new Application();
        application.setApplicationId(applicationId);
        application.setApplicantFirstName(applicantFirstName);
        application.setApplicantLastName(applicantLastName);
        application.setApplicationDate(applicationDate);
        application.setPetName(petName);
        application.setAge(petAge);
        application.setBreed(petBreed);
        application.setPetType(pettype);
        application.setPetGender(petGender);
        application.setPetVaccinations(petVaccinations);
        application.setPetInsurancePlan(petInsurancePlan);
        
        this.applicationsList.add(application);
        
        return application;
    }
    
    public Boolean checkIfApplicationExists(String applicationId) {
        for(Application app: this.applicationsList) {
            if(app.getApplicationId().equals(applicationId)) {
                return false;
            }
        }      
        return true;
    }
    
    public Application findApplicationById(String applicationId) {
        for(Application app: this.applicationsList) {
            if(app.getApplicationId().equals(applicationId)) {
                return app;
            }
        }
        
        return null;
    }
    
    public ArrayList<Application> findApplicationByFirstName(String applicantFirstName) {
        ArrayList<Application> searchResults = new ArrayList<Application>();
        for(Application app: this.applicationsList) {
            if(app.getApplicantFirstName().equals(applicantFirstName)) {
                //return app;
                searchResults.add(app);
            }
        }
        return searchResults;
    }
    
    public void removeApplication(String applicationId) {
        for(Application app: this.applicationsList) {
            if(app.getApplicationId().equals(applicationId)) {
                this.applicationsList.remove(app);
                break;
            }
        }
    }
    
}
