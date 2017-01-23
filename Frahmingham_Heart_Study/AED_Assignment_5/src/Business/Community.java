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
public class Community {

private int communityID;
private HouseDirectory houseDirectory;
private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCommunityID() {
        return communityID;
    }

    public void setCommunityID(int communityID) {
        this.communityID = communityID;
    }

    public HouseDirectory getHouseDirectory() {
        return houseDirectory;
    }

    public void setHouseDirectory(HouseDirectory houseDirectory) {
        this.houseDirectory = houseDirectory;
    }

    
  public double getAverageRiskScore(){
        double t_riskScore=0;int counter=0;
        for(House house: houseDirectory.getHouseDirectory()){
            t_riskScore = t_riskScore+house.getAverageRiskScore();
            counter++;    
        }
        return t_riskScore/counter;
    }
    
    
    public int peopleAtRisk(){
        int count = 0;
        for(House house: houseDirectory.getHouseDirectory()){
            count += house.peopleAtRisk();
        }
        return count;
    }

    public int maleWithRisk(){
        int count = 0;
        for(House house : houseDirectory.getHouseDirectory()){
            count += house.maleWithRisk();
        }
        return count;
    }
    
    public int femaleWithRisk(){
        int count = 0;
        for(House house : houseDirectory.getHouseDirectory()){
            count += house.femaleWithRisk();
        }
        return count;
    }

    
    
    public House selectHouse(){
        System.out.println("Please select a house. Enter a number");
        int i = 1;
        Scanner sc = new Scanner(System.in);
        
        for(House house: houseDirectory.getHouseDirectory()){
            System.out.println(i++ +" - House no." + house.getHouseId());
        }
        try{
            i = sc.nextInt();
        }catch(NumberFormatException e){
            System.err.println("Invalid option please select a valid option");
        }
        return houseDirectory.get(i-1);
    }
    
}
