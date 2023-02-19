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
 public class VaccineCatalog {
    ArrayList<Vaccine> vaccineList;
 
   public VaccineCatalog() {
        this.vaccineList = new ArrayList<Vaccine>();
    }

    public ArrayList<Vaccine> getVaccines() {
        return this.vaccineList;
    }

    public void setVacccineName(ArrayList<Vaccine> vaccine) {
        this.vaccineList = vaccine;
    }
    
    public Vaccine createVaccine(String name, double dosage) {
        Vaccine vaccine = new Vaccine();
        vaccine.setVaccineName(name);
        vaccine.setDosage(dosage);
        
        this.vaccineList.add(vaccine);
        
        return vaccine;
    }
    
    public Boolean checkIfVaccineUnique(String vaccineName) {
        for(Vaccine vac: this.vaccineList) {
            if(vac.getVaccineName().equals(vaccineName)) {
                return false;
            }
        }      
        return true;
    }
    
    public Vaccine findVaccine(String vaccineName) {
        for(Vaccine vac: this.vaccineList) {
            if(vac.getVaccineName().equals(vaccineName)) {
                return vac;
            }
        }
        
        return null;
    }
    
    public void removeVaccine(String vaccineName) {
        for(Vaccine vac: this.vaccineList) {
            if(vac.getVaccineName().equals(vaccineName)) {
                this.vaccineList.remove(vac);
                break;
            }
        }
    }
 }
    
    