/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author chilukuri
 */
public class Application {
    
    private String applicationId;
    private String applicantFirstName;
    private String applicantLastName;
    private Date applicationDate;
    private String petName;
    private float age;
    private String breed;
    private String petType;
    private String petGender;
    private ArrayList<Vaccine> petVaccinations;
    private InsurancePlan petInsurancePlan;
    
    public Application() {
        this.petVaccinations = new ArrayList<Vaccine>();
        this.petInsurancePlan = new InsurancePlan();
    }

    public String getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    public String getApplicantFirstName() {
        return applicantFirstName;
    }

    public void setApplicantFirstName(String applicantFirstName) {
        this.applicantFirstName = applicantFirstName;
    }

    public String getApplicantLastName() {
        return applicantLastName;
    }

    public void setApplicantLastName(String applicantLastName) {
        this.applicantLastName = applicantLastName;
    }

    public Date getApplicationDate() {
        return applicationDate;
    }

    public void setApplicationDate(Date applicationDate) {
        this.applicationDate = applicationDate;
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public float getAge() {
        return age;
    }

    public void setAge(float age) {
        this.age = age;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getPetType() {
        return petType;
    }

    public void setPetType(String petType) {
        this.petType = petType;
    }

    public String getPetGender() {
        return petGender;
    }

    public void setPetGender(String petGender) {
        this.petGender = petGender;
    }

    public ArrayList<Vaccine> getPetVaccinations() {
        return petVaccinations;
    }

    public void setPetVaccinations(ArrayList<Vaccine> petVaccinations) {
        this.petVaccinations = petVaccinations;
    }

    public InsurancePlan getPetInsurancePlan() {
        return petInsurancePlan;
    }

    public void setPetInsurancePlan(InsurancePlan petInsurancePlan) {
        this.petInsurancePlan = petInsurancePlan;
    }
}
