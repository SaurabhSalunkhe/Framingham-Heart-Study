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
public class Family {


private PersonDirectory personDirectory= new PersonDirectory();

       private int familyID;

    public int getFamilyID() {
        return familyID;
    }

    public void setFamilyID(int familyID) {
        this.familyID = familyID;
    }
       
       

    public PersonDirectory getPersonDirectory() {
        return personDirectory;
    }

    public void setPersonDirectory(PersonDirectory personDirectory) {
        this.personDirectory = personDirectory;
    }


    public double getAverageRiskScore(){
        double t_riskScore=0;int counter=0;
        for(Person person: personDirectory.getPersonDirectory()){
            t_riskScore = t_riskScore+person.getAverageRiskScore();
            counter++;
            
        }return t_riskScore/counter;
    }
    
    public int peopleAtRisk(){
        int count = 0;
        for(Person person: getPersonDirectory().getPersonDirectory()){
            if(person.isAtRisk())
                count++;
        }
        return count;
    }
    
    public int maleWithRisk(){
        int count = 0;
        for(Person person : personDirectory.getPersonDirectory()){
            if(person.getGender().equals("male") && person.isAtRisk()){
                count++;
            }
        }
        return count;
    }
    
    public int femaleWithRisk(){
        int count = 0;
        for(Person person : personDirectory.getPersonDirectory()){
            if(person.getGender().equals("female") && person.isAtRisk()){
                count++;
            }
        }
        return count;
    }
    
    
    public Person selectPerson(){
        System.out.println("Please select a family. Enter a number");
        int i = 1;
        Scanner sc = new Scanner(System.in);
        
        for(Person person: personDirectory.getPersonDirectory()){
            System.out.println(i++ +" - " + person.getFirstName());
        }
        try{
            i = sc.nextInt();
        }catch(NumberFormatException e){
            System.err.println("Invalid option please select a valid option");
        }
        return personDirectory.get(i-1);
    }
    
    
}