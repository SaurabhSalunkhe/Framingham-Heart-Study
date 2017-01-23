/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author Saurabh Salunkhe
 */
public class Person {


    private String firstName;
    private LocalDate dob;
    private Patient patient;
    private Person father;
    private Person mother;
    private Person sibling1;
    private Person sibling2;
    private String gender;
    
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    


    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public Person getSibling1() {
        return sibling1;
    }

    public void setSibling1(Person sibling1) {
        this.sibling1 = sibling1;
    }

    public Person getSibling2() {
        return sibling2;
    }

    public void setSibling2(Person sibling2) {
        this.sibling2 = sibling2;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }
 
    
    public double getAverageRiskScore(){
        double t_riskScore=0;int counter=0;
        for(VitalSign vitalSign: patient.getVitalSignDirectory().getVitalSignDirectory()){
            t_riskScore = t_riskScore + calculateRiskScore(vitalSign);
            counter++;    
        }
        return t_riskScore/counter;
    }
    
    
    
    
    
    public boolean isAtRisk(){
        if(calculateRiskScore(patient.getVitalSignDirectory().getVitalSignDirectory().get(patient.getVitalSignDirectory().getVitalSignDirectory().size() - 1)) > 11)
            return false;
        else
            return true;
    }
    

    public double calculateRiskScore(VitalSign vitalSign) {
        
        Scanner sc = new Scanner(System.in);
        int agepoints = 0;
        int lowCholesterolLevel = 0;
        int highCholesterolLevel = 0;
        int bloodPressureCount = 0;
        int diabetesCheck = 0;
        int smokingCheck = 0;
        double tenYearChdRisk=0 ;
        //calculation for male
        if(getGender()=="male"){
            

            //Assigning points according to age
            if (vitalSign.getAge(this.getDob()) > 30 && vitalSign.getAge(this.getDob()) < 35) {
                agepoints = -1;
            }
            if (vitalSign.getAge(this.getDob()) > 35 && vitalSign.getAge(this.getDob()) < 40) {
                agepoints = 0;
            }
            if (vitalSign.getAge(this.getDob()) > 40 && vitalSign.getAge(this.getDob()) < 45) {
                agepoints = 1;
            }
            if (vitalSign.getAge(this.getDob()) > 45 && vitalSign.getAge(this.getDob()) < 50) {
                agepoints = 2;
            }
            if (vitalSign.getAge(this.getDob()) > 50 && vitalSign.getAge(this.getDob()) < 55) {
                agepoints = 3;
            }
            if (vitalSign.getAge(this.getDob()) > 55 && vitalSign.getAge(this.getDob()) < 60) {
                agepoints = 4;
            }
            if (vitalSign.getAge(this.getDob()) > 60 && vitalSign.getAge(this.getDob()) < 65) {
                agepoints = 5;
            }
            if (vitalSign.getAge(this.getDob()) > 65 && vitalSign.getAge(this.getDob()) < 70) {
                agepoints = 6;
            }
            if (vitalSign.getAge(this.getDob()) > 70 && vitalSign.getAge(this.getDob()) < 80) {
                agepoints = 7;
            }

            
            //Assigning points according to ldl cholesterol
            if (vitalSign.getLdlCholesterol() < 100&&vitalSign.getLdlCholesterol()>0) {
                lowCholesterolLevel = -3;
            }
            if (vitalSign.getLdlCholesterol() > 100 && vitalSign.getLdlCholesterol() < 130) {
                lowCholesterolLevel = 0;
            }
            if (vitalSign.getLdlCholesterol() > 130 && vitalSign.getLdlCholesterol() < 160) {
                lowCholesterolLevel = 0;
            }
            if (vitalSign.getLdlCholesterol() > 160 && vitalSign.getLdlCholesterol() < 190) {
                lowCholesterolLevel = 1;
            }
            if (vitalSign.getLdlCholesterol() > 190) {
                lowCholesterolLevel = 2;
            }
            
            //Assigning points according to hdl cholesterol
            if (vitalSign.getHdlCholesterol() < 35&&vitalSign.getHdlCholesterol()>0) {
                highCholesterolLevel = 2;
            }
            if (vitalSign.getHdlCholesterol() > 35 && vitalSign.getHdlCholesterol() < 44) {
                highCholesterolLevel = 1;
            }
            if (vitalSign.getHdlCholesterol() > 45 && vitalSign.getHdlCholesterol() < 49) {
                highCholesterolLevel = 0;
            }
            if (vitalSign.getHdlCholesterol() > 50 && vitalSign.getHdlCholesterol() < 59) {
                highCholesterolLevel = 0;
            }
            if (vitalSign.getHdlCholesterol() >= 60) {
                highCholesterolLevel = -1;
            }
            
            
            //Assigning points according to Blood Pressure
            if (vitalSign.getBloodPressure() < 80&&vitalSign.getBloodPressure()>50) {
                bloodPressureCount = 0;
            }
            if (vitalSign.getBloodPressure() > 80 && vitalSign.getBloodPressure() < 84) {
                bloodPressureCount = 0;
            }
            if (vitalSign.getBloodPressure() > 85 && vitalSign.getBloodPressure() < 89) {
                bloodPressureCount = 1;
            }
            if (vitalSign.getBloodPressure() > 90 && vitalSign.getBloodPressure() < 99) {
                bloodPressureCount = 2;
            }
            if (vitalSign.getBloodPressure() >= 100) {
                bloodPressureCount = 3;
            }

            
            //Assigning points according to diabetes
            if (vitalSign.isHasDiabetes() == false) {
                diabetesCheck = 0;
            }
            if (vitalSign.isHasDiabetes() == true) {
                diabetesCheck = 2;
            }

            if (vitalSign.isSmoking() == false) {
                smokingCheck = 0;
            }
            if (vitalSign.isSmoking() == true) {
                smokingCheck = 2;
            }

            //Adding all points
            int total = agepoints + lowCholesterolLevel + highCholesterolLevel + bloodPressureCount + diabetesCheck + smokingCheck;
            
            
            //Assigning percentage to points
            if(total<-3)tenYearChdRisk=1;
            if(total==-2)tenYearChdRisk=2;
            if(total==-1)tenYearChdRisk=2;
            if(total==0)tenYearChdRisk=2;
            if(total==1)tenYearChdRisk=4;
            if(total==2)tenYearChdRisk=4;
            if(total==3)tenYearChdRisk=6;
            if(total==4)tenYearChdRisk=7;
            if(total==5)tenYearChdRisk=11;
            if(total==6)tenYearChdRisk=14;
            if(total==7)tenYearChdRisk=18;
            if(total==8)tenYearChdRisk=22;
            if(total==9)tenYearChdRisk=27;
            if(total==10)tenYearChdRisk=33;
            if(total==11)tenYearChdRisk=40;
            if(total==12)tenYearChdRisk=47;
            if(total>12)tenYearChdRisk=56;

            return tenYearChdRisk;
      
    }
    
    //Calculation for female
    else if(getGender()=="female"){
      
        //Assigning points according to age
        if (vitalSign.getAge(getDob()) > 30 && vitalSign.getAge(getDob()) < 35) {
            agepoints = -9;
        }
        if (vitalSign.getAge(getDob()) > 35 && vitalSign.getAge(getDob()) < 40) {
            agepoints = -4;
        }
        if (vitalSign.getAge(getDob()) > 40 && vitalSign.getAge(getDob()) < 45) {
            agepoints = 0;
        }
        if (vitalSign.getAge(getDob()) > 45 && vitalSign.getAge(getDob()) < 50) {
            agepoints = 3;
        }
        if (vitalSign.getAge(getDob()) > 50 && vitalSign.getAge(getDob()) < 55) {
            agepoints = 6;
        }
        if (vitalSign.getAge(getDob()) > 55 && vitalSign.getAge(getDob()) < 60) {
            agepoints = 7;
        }
        if (vitalSign.getAge(getDob()) > 60 && vitalSign.getAge(getDob()) < 65) {
            agepoints = 8;
        }
        if (vitalSign.getAge(getDob()) > 65 && vitalSign.getAge(getDob()) < 70) {
            agepoints = 8;
        }
        if (vitalSign.getAge(getDob()) > 70 && vitalSign.getAge(getDob()) < 80) {
            agepoints = 8;
        }

        
        //Assigning points according to ldl cholesterol
        if (vitalSign.getLdlCholesterol() < 100&&vitalSign.getLdlCholesterol()>0) {
            lowCholesterolLevel = -2;
        }
        if (vitalSign.getLdlCholesterol() > 100 && vitalSign.getLdlCholesterol() < 130) {
            lowCholesterolLevel = 0;
        }
        if (vitalSign.getLdlCholesterol() > 130 && vitalSign.getLdlCholesterol() < 160) {
            lowCholesterolLevel = 0;
        }
        if (vitalSign.getLdlCholesterol() > 160 && vitalSign.getLdlCholesterol() < 190) {
            lowCholesterolLevel = 2;
        }
        if (vitalSign.getLdlCholesterol() > 190) {
            lowCholesterolLevel = 2;
        }

        
        //Assigning points according to hdl cholesterol
        if (vitalSign.getHdlCholesterol() < 35&&vitalSign.getHdlCholesterol()>0) {
            highCholesterolLevel = 5;
        }
        if (vitalSign.getHdlCholesterol() > 35 && vitalSign.getHdlCholesterol() < 44) {
            highCholesterolLevel = 2;
        }
        if (vitalSign.getHdlCholesterol() > 45 && vitalSign.getHdlCholesterol() < 49) {
            highCholesterolLevel = 1;
        }
        if (vitalSign.getHdlCholesterol() > 50 && vitalSign.getHdlCholesterol() < 59) {
            highCholesterolLevel = 0;
        }
        if (vitalSign.getHdlCholesterol() >= 60) {
            highCholesterolLevel = -2;
        }

        
        //Assigning points according to Blood Pressure
        if (vitalSign.getBloodPressure() < 80&&vitalSign.getBloodPressure()>50) {
            bloodPressureCount = -3;
        }
        if (vitalSign.getBloodPressure() > 80 && vitalSign.getBloodPressure() < 84) {
            bloodPressureCount = 0;
        }
        if (vitalSign.getBloodPressure() > 85 && vitalSign.getBloodPressure() < 89) {
            bloodPressureCount = 0;
        }
        if (vitalSign.getBloodPressure() > 90 && vitalSign.getBloodPressure() < 99) {
            bloodPressureCount = 2;
        }
        if (vitalSign.getBloodPressure() >= 100) {
            bloodPressureCount = 3;
        }

        
        //Assigning points according to diabetes
        if (vitalSign.isHasDiabetes() == false) {
            diabetesCheck = 0;
        }
        if (vitalSign.isHasDiabetes() == true) {
            diabetesCheck = 2;
        }

        if (vitalSign.isSmoking() == false) {
            smokingCheck = 0;
        }
        if (vitalSign.isSmoking() == true) {
            smokingCheck = 2;
        }

        
        //Adding all points
        int total = agepoints + lowCholesterolLevel + highCholesterolLevel + bloodPressureCount + diabetesCheck + smokingCheck;

        
        //Assigning percentage to points
        if(total<-3)tenYearChdRisk=1;
        if(total==-2)tenYearChdRisk=2;
        if(total==-1)tenYearChdRisk=2;
        if(total==0)tenYearChdRisk=2;
        if(total==1)tenYearChdRisk=4;
        if(total==2)tenYearChdRisk=4;
        if(total==3)tenYearChdRisk=6;
        if(total==4)tenYearChdRisk=7;
        if(total==5)tenYearChdRisk=11;
        if(total==6)tenYearChdRisk=14;
        if(total==7)tenYearChdRisk=18;
        if(total==8)tenYearChdRisk=22;
        if(total==9)tenYearChdRisk=27;
        if(total==10)tenYearChdRisk=33;
        if(total==11)tenYearChdRisk=40;
        if(total==12)tenYearChdRisk=47;
        if(total>12)tenYearChdRisk=56;
      
    return tenYearChdRisk;
    }
return tenYearChdRisk;
    }    

    
    
    public void diaplayAllVitalsSigns(){
        for(VitalSign vitalSign : patient.getVitalSignDirectory().getVitalSignDirectory()){
            System.out.println("Age: " +  vitalSign.getAge(dob) + 
                    " || Blood Pressure: " + vitalSign.getBloodPressure() +
                    " || Total Cholesterol" + (vitalSign.getHdlCholesterol()+vitalSign.getLdlCholesterol())+
                    " || LDL Cholesterol " + vitalSign.getLdlCholesterol() +
                    " || Pulse: " + vitalSign.getPulse() 
            );
        }
    }
    
    
}
































