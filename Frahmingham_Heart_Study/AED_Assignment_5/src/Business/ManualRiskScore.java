/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.Scanner;

/**
 *
 * @author Saurabh Salunkhe
 */
public  class ManualRiskScore {

    public static void calculateManualRsikScore(){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("---Calculate the manual risk score of an individual-----");
        
        System.out.println("Enter gender");
        String gender= sc.nextLine();
        
        System.out.println("Enter age");
        int age= sc.nextInt();
        
        System.out.println("Enter low cholesterol level");
        int lowChol=sc.nextInt();
        
        System.out.println("Enter high cholesterol level");
        int highChol=sc.nextInt();
        
        System.out.println("Enter blood pressure");
        int bp=sc.nextInt();
        
        System.out.println("Do you smoke ??? Press 1 for yes and 0 for No");
        int smoke=sc.nextInt();
        
        System.out.println("Do you have diabetes ??? Press 1 for yes and 0 for No" );
        int diabetes=sc.nextInt();
        
        
        int agepoints = 0;
        int lowCholesterolLevel = 0;
        int highCholesterolLevel = 0;
        int bloodPressureCount = 0;
        int diabetesCheck = 0;
        int smokingCheck = 0;
        double tenYearChdRisk=0 ;


        if(gender.equalsIgnoreCase("male")){
        if (age > 30 && age < 35) {
            agepoints = -9;
        }
        if (age > 35 && age < 40) {
            agepoints = -4;
        }
        if (age > 40 && age < 45) {
            agepoints = 0;
        }
        if (age > 45 && age < 50) {
            agepoints = 3;
        }
        if (age > 50 && age < 55) {
            agepoints = 6;
        }
        if (age > 55 && age < 60) {
            agepoints = 7;
        }
        if (age > 60 && age < 65) {
            agepoints = 8;
        }
        if (age > 65 && age < 70) {
            agepoints = 8;
        }
        if (age > 70 && age < 80) {
            agepoints = 8;
        }

        if (lowChol < 100&&lowChol>0) {
            lowCholesterolLevel = -2;
        }
        if (lowChol > 100 && lowChol < 130) {
            lowCholesterolLevel = 0;
        }
        if (lowChol > 130 && lowChol < 160) {
            lowCholesterolLevel = 0;
        }
        if (lowChol > 160 && lowChol < 190) {
            lowCholesterolLevel = 2;
        }
        if (lowChol > 190) {
            lowCholesterolLevel = 2;
        }

        //
        if (highChol < 35&&highChol>0) {
            highCholesterolLevel = 5;
        }
        if (highChol > 35 && highChol < 44) {
            highCholesterolLevel = 2;
        }
        if (highChol > 45 && highChol < 49) {
            highCholesterolLevel = 1;
        }
        if (highChol > 50 && highChol < 59) {
            highCholesterolLevel = 0;
        }
        if (highChol >= 60) {
            highCholesterolLevel = -2;
        }

        //
        if (bp < 80&&bp>50) {
            bloodPressureCount = -3;
        }
        if (bp > 80 && bp < 84) {
            bloodPressureCount = 0;
        }
        if (bp > 85 && bp < 89) {
            bloodPressureCount = 0;
        }
        if (bp > 90 && bp < 99) {
            bloodPressureCount = 2;
        }
        if (bp >= 100) {
            bloodPressureCount = 3;
        }
        //
        
        if (diabetes == 0) {
            diabetesCheck = 0;
        }
        if (diabetes == 1) {
            diabetesCheck = 2;
        }

        if (smoke == 0) {
            smokingCheck = 0;
        }
        if (smoke == 1) {
            smokingCheck = 2;
        }

        int total = agepoints + lowCholesterolLevel + highCholesterolLevel + bloodPressureCount + diabetesCheck + smokingCheck;

        
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
      
        System.out.println("The risk score of an individual is "+tenYearChdRisk);   
        }else if(gender.equalsIgnoreCase("female")){
            {
        if (age > 30 && age < 35) {
            agepoints = -1;
        }
        if (age > 35 && age < 40) {
            agepoints = 0;
        }
        if (age > 40 && age < 45) {
            agepoints = 1;
        }
        if (age > 45 && age < 50) {
            agepoints = 2;
        }
        if (age > 50 && age < 55) {
            agepoints = 3;
        }
        if (age > 55 && age < 60) {
            agepoints = 4;
        }
        if (age > 60 && age < 65) {
            agepoints = 5;
        }
        if (age > 65 && age < 70) {
            agepoints = 6;
        }
        if (age > 70 && age < 80) {
            agepoints = 7;
        }

        if (lowChol < 100&&lowChol>0) {
            lowCholesterolLevel = -3;
        }
        if (lowChol > 100 && lowChol < 130) {
            lowCholesterolLevel = 0;
        }
        if (lowChol > 130 && lowChol < 160) {
            lowCholesterolLevel = 0;
        }
        if (lowChol > 160 && lowChol < 190) {
            lowCholesterolLevel = 1;
        }
        if (lowChol > 190) {
            lowCholesterolLevel = 2;
        }

        //
        if (highChol < 35&&highChol>0) {
            highCholesterolLevel = 2;
        }
        if (highChol > 35 && highChol < 44) {
            highCholesterolLevel = 1;
        }
        if (highChol > 45 && highChol < 49) {
            highCholesterolLevel = 0;
        }
        if (highChol > 50 && highChol < 59) {
            highCholesterolLevel = 0;
        }
        if (highChol >= 60) {
            highCholesterolLevel = -1;
        }

        //
        if (bp < 80&&bp>50) {
            bloodPressureCount = 0;
        }
        if (bp > 80 && bp < 84) {
            bloodPressureCount = 0;
        }
        if (bp > 85 && bp < 89) {
            bloodPressureCount = 1;
        }
        if (bp > 90 && bp < 99) {
            bloodPressureCount = 2;
        }
        if (bp >= 100) {
            bloodPressureCount = 3;
        }
        //
        
        if (diabetes == 0) {
            diabetesCheck = 0;
        }
        if (diabetes == 1) {
            diabetesCheck = 2;
        }

        if (smoke == 0) {
            smokingCheck = 0;
        }
        if (smoke == 1) {
            smokingCheck = 2;
        }

        int total = agepoints + lowCholesterolLevel + highCholesterolLevel + bloodPressureCount + diabetesCheck + smokingCheck;

        
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
      
        System.out.println("The risk score of an individual is "+tenYearChdRisk);
        }
        
    }
    
}
}
