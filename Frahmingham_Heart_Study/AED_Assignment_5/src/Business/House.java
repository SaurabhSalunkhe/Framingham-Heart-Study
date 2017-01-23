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
public class House {
    private int houseId;
    private FamilyDirectory familyDirectory;

    public int getHouseId() {
        return houseId;
    }

    public void setHouseId(int houseId) {
        this.houseId = houseId;
    }

    public FamilyDirectory getFamilyDirectory() {
        return familyDirectory;
    }

    public void setFamilyDirectory(FamilyDirectory familyDirectory) {
        this.familyDirectory = familyDirectory;
    }

    
    public double getAverageRiskScore(){
        double t_riskScore=0;int counter=0;
        for(Family family: familyDirectory.getFamilyDirectory()){
            t_riskScore = t_riskScore+family.getAverageRiskScore();
            counter++;
            
        }return t_riskScore/counter;
    }
    
    public int peopleAtRisk(){
        int count = 0;
        for(Family family: getFamilyDirectory().getFamilyDirectory()){
            count += family.peopleAtRisk();
        }
        return count;
    }
    
    public int maleWithRisk(){
        int count = 0;
        for(Family family : familyDirectory.getFamilyDirectory()){
            count += family.maleWithRisk();
        }
        return count;
    }
    
    public int femaleWithRisk(){
        int count = 0;
        for(Family family : familyDirectory.getFamilyDirectory()){
            count += family.femaleWithRisk();
        }
        return count;
    }
    
    
    public Family selectFamily(){
        System.out.println("Please select a family. Enter a number");
        int i = 1;
        Scanner sc = new Scanner(System.in);
        
        for(Family family: familyDirectory.getFamilyDirectory()){
            System.out.println(i++ +" - Family of no." + family.getFamilyID());
        }
        try{
            i = sc.nextInt();
        }catch(NumberFormatException e){
            System.err.println("Invalid option please select a valid option");
        }
        return familyDirectory.get(i-1);
    }
    
}