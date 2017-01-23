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
public class City {

    private int cityId;
    private CommunityDirectory communityDirectory;

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public CommunityDirectory getCommunityDirectory() {
        return communityDirectory;
    }

    public void setCommunityDirectory(CommunityDirectory communityDirectory) {
        this.communityDirectory = communityDirectory;
    }

    public double getAverageRiskScore() {
        double t_riskScore = 0;
        int counter = 0;
        for (Community community : communityDirectory.getCommunityDirectory()) {
            t_riskScore = t_riskScore + community.getAverageRiskScore();
            counter++;

        }
        return t_riskScore / counter;
    }

    public int peopleAtRisk() {
        int count = 0;
        for (Community community : communityDirectory.getCommunityDirectory()) {
            count += community.peopleAtRisk();
        }
        return count;
    }
    
    public int maleWithRisk(){
        int count = 0;
        for(Community community : communityDirectory.getCommunityDirectory()){
            count += community.maleWithRisk();
        }
        return count;
    }
    
    public int femaleWithRisk(){
        int count = 0;
        for(Community community : communityDirectory.getCommunityDirectory()){
            count += community.femaleWithRisk();
        }
        return count;
    }
    
    
    public Community selectCommunity(){
        System.out.println("Please select an community. Enter a number");
        int i = 1;
        Scanner sc = new Scanner(System.in);
        
        for(Community community: communityDirectory.getCommunityDirectory()){
            System.out.println(i++ +" - " + community.getName());
        }
        try{
            i = sc.nextInt();
        }catch(NumberFormatException e){
            System.err.println("Invalid option please select a valid option");
        }
        return communityDirectory.get(i-1);
    }
    
    
    
    

}
