/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Saurabh Salunkhe
 */
public class VitalSign {

    Scanner sc = new Scanner(System.in);

    
    private double ldlCholesterol;
    private double hdlCholesterol;
    private double bloodPressure;
    private boolean hasDiabetes;
    private boolean smoking;
    private double totalCholesterol; 
    private LocalDate recordDate;
    private int pulse;

    public VitalSign( double ldlCholesterol, double hdlCholesterol, double bloodPressure, boolean hasDiabetes, boolean smoking, double totalCholesterol, LocalDate recordDate, int pulse) {
        
        this.ldlCholesterol = ldlCholesterol;
        this.hdlCholesterol = hdlCholesterol;
        this.bloodPressure = bloodPressure;
        this.hasDiabetes = hasDiabetes;
        this.smoking = smoking;
        this.totalCholesterol = totalCholesterol;
       
        this.recordDate = recordDate;
        this.pulse = pulse;
    }

    public VitalSign() {
    }

    public double getLdlCholesterol() {
        return ldlCholesterol;
    }

    public void setLdlCholesterol(double ldlCholesterol) {
        this.ldlCholesterol = ldlCholesterol;
    }

    public double getHdlCholesterol() {
        return hdlCholesterol;
    }

    public void setHdlCholesterol(double hdlCholesterol) {
        this.hdlCholesterol = hdlCholesterol;
    }

    public double getBloodPressure() {
        return bloodPressure;
    }

    public void setBloodPressure(double bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public boolean isHasDiabetes() {
        return hasDiabetes;
    }

    public void setHasDiabetes(boolean hasDiabetes) {
        this.hasDiabetes = hasDiabetes;
    }

    public boolean isSmoking() {
        return smoking;
    }

    public void setSmoking(boolean smoking) {
        this.smoking = smoking;
    }

    public double getTotalCholesterol() {
        return totalCholesterol;
    }

    public void setTotalCholesterol(double totalCholesterol) {
        this.totalCholesterol = totalCholesterol;
    }

    

    public LocalDate getRecordDate() {
        return recordDate;
    }

    public void setRecordDate(LocalDate recordDate) {
        this.recordDate = recordDate;
    }

 
    public int getPulse() {
        return pulse;
    }

    public void setPulse(int pulse) {
        this.pulse = pulse;
    }

   
     public int getAge(LocalDate dob){
         int dobYear=dob.getYear();
         int age=getRecordDate().getYear()-dobYear;
         return age;
         
     }
    

}



