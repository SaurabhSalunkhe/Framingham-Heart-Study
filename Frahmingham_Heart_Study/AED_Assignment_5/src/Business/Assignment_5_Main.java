/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.text.ParseException;
import java.util.Scanner;

/**
 *
 * @author Saurabh Salunkhe
 */
public class Assignment_5_Main {

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws ParseException {

        Scanner sc = new Scanner(System.in);
        City city = new City();
        Initilization.popolateCity(city);

        // TODO code application logic here
        int option = 1;
        //Menu Starts here
        do {

            System.out.println("Please select an option. /n"
                    + "Enter a number"
                    + "\n1 - Number of people with CHD risk greater than 11%"
                    + "\n2 - Average risk score for the city "
                    + "\n3 - Gender wise ditribution of CHD"
                    + "\n4 - Select a community level problem"
                    + "\n5 - Calculate manual risk score"
                    + "\n0 - Exit "
            );

            try {
                option = sc.nextInt();
            } catch (NumberFormatException e) {
                System.err.println("Invalid option please select a valid option");
            }

            switch (option) {
                case 0:
                    break;
                case 1:
                    System.out.println(city.peopleAtRisk());
                    break;
                case 2:
                    System.out.println(city.getAverageRiskScore());
                    break;
                case 3:
                    getGenderfWiseDistributionOfRisk(city);
                    break;
                case 4:
                    displayOptionsForCommunities(city.selectCommunity());
                    break;
                case 5:
                    ManualRiskScore.calculateManualRsikScore();
                    break;
                default:
                    System.err.println("Invalid option please select a valid option");
                    break;

            }
        } while (option != 0);
    }
    //Menu for Community level Questions
    public static void displayOptionsForCommunities(Community community) {
        Scanner sc = new Scanner(System.in);
        int option = 1;

        do {

            System.out.println("Please select an option. /n"
                    + "Enter a number"
                    + "\n1 - Number of people with CHD risk greater than 14%"
                    + "\n2 - Average risk score for the community "
                    + "\n3 - Gender wise ditribution of CHD"
                    + "\n4 - Select a house level problem in this community"
                    + "\n0 - Back "
            );

            try {
                option = sc.nextInt();
            } catch (NumberFormatException e) {
                System.err.println("Invalid option please select a valid option");
            }

            switch (option) {
                case 0:
                    break;
                case 1:
                    System.out.println(community.peopleAtRisk());
                    break;
                case 2:
                    System.out.println(community.getAverageRiskScore());
                    break;
                case 3:
                    getGenderfWiseDistributionOfRisk(community);
                    break;
                case 4:
                    displayOptionsForHouse(community.selectHouse());
                    break;
                default:
                    System.err.println("Invalid option please select a valid option");
                    break;
            }
        } while (option != 0);
    }
    //Menu for House Level Questions
    public static void displayOptionsForHouse(House house) {
        Scanner sc = new Scanner(System.in);
        int option = 1;

        do {

            System.out.println("Please select an option. /n"
                    + "Enter a number"
                    + "\n1 - Number of people with CHD risk greater than 14%"
                    + "\n2 - Average risk score for the house "
                    + "\n3 - Gender wise ditribution of CHD"
                    + "\n4 - Select a family level problem in this community"
                    + "\n0 - Back "
            );

            try {
                option = sc.nextInt();
            } catch (NumberFormatException e) {
                System.err.println("Invalid option please select a valid option");
            }

            switch (option) {
                case 0:
                    break;
                case 1:
                    System.out.println(house.peopleAtRisk());
                    break;
                case 2:
                    System.out.println(house.getAverageRiskScore());
                    break;
                case 3:
                    getGenderfWiseDistributionOfRisk(house);
                    break;
                case 4:
                    displayOptionsForFamily(house.selectFamily());
                    break;
                default:
                    System.err.println("Invalid option please select a valid option");
                    break;
            }
        } while (option != 0);
    }
    //Menu for Famimly level Questions
    public static void displayOptionsForFamily(Family family) {
        Scanner sc = new Scanner(System.in);
        int option = 1;

        do {

            System.out.println("Please select an option. /n"
                    + "Enter a number"
                    + "\n1 - Number of people with CHD risk greater than 14%"
                    + "\n2 - Average risk score for the family "
                    + "\n3 - Gender wise ditribution of CHD"
                    + "\n4 - Select a personal level problem in this family"
                    + "\n0 - Back "
            );

            try {
                option = sc.nextInt();
            } catch (NumberFormatException e) {
                System.err.println("Invalid option please select a valid option");
            }

            switch (option) {
                case 0:
                    break;
                case 1:
                    System.out.println(family.peopleAtRisk());
                    break;
                case 2:
                    System.out.println(family.getAverageRiskScore());
                    break;
                case 3:
                    getGenderfWiseDistributionOfRisk(family);
                    break;
                case 4:
                    displayOptionsForPerson(family.selectPerson());
                    break;
                default:
                    System.err.println("Invalid option please select a valid option");
                    break;
            }
        } while (option != 0);
    }
    //Menu for Person Level Questions
    public static void displayOptionsForPerson(Person person) {
        Scanner sc = new Scanner(System.in);
        int option = 1;

        do {

            System.out.println("Please select an option. /n"
                    + "Enter a number"
                    + "\n1 - Latest risk score"
                    + "\n2 - Average risk score for the person "
                    + "\n3 - Display all vital signs"
                    + "\n0 - Back "
            );

            try {
                option = sc.nextInt();
            } catch (NumberFormatException e) {
                System.err.println("Invalid option please select a valid option");
            }

            switch (option) {
                case 0:
                    break;
                case 1:
                    System.out.println(person.calculateRiskScore(person.getPatient().getVitalSignDirectory().get(person.getPatient().getVitalSignDirectory().getVitalSignDirectory().size() - 1)));
                    break;
                case 2:
                    System.out.println(person.getAverageRiskScore());
                    break;
                case 3:
                    person.diaplayAllVitalsSigns();
                    break;
                default:
                    System.err.println("Invalid option please select a valid option");
                    break;
            }
        } while (option != 0);
    }

    public static void getGenderfWiseDistributionOfRisk(City city) {
        int male = city.maleWithRisk();
        int female = city.femaleWithRisk();

        if (male < female) {
            System.out.println("Male : Female = " + male / female + ": 1");
        } else {
            System.out.println("Male : Female = 1 :" + female / male);
        }
    }

    public static void getGenderfWiseDistributionOfRisk(Community community) {
        int male = community.maleWithRisk();
        int female = community.femaleWithRisk();

        if (male < female) {
            System.out.println("Male : Female = " + male / female + ": 1");
        } else {
            System.out.println("Male : Female = 1 :" + female / male);
        }
    }

    public static void getGenderfWiseDistributionOfRisk(House house) {
        int male = house.maleWithRisk();
        int female = house.femaleWithRisk();

        if (male < female) {
            System.out.println("Male : Female = " + male / female + ": 1");
        } else {
            System.out.println("Male : Female = 1 :" + female / male);
        }
    }

    public static void getGenderfWiseDistributionOfRisk(Family family) {
        int male = family.maleWithRisk();
        int female = family.femaleWithRisk();

        if (male < female) {
            System.out.println("Male : Female = " + male / female + ": 1");
        } else {
            System.out.println("Male : Female = 1 :" + female / male);
        }
    }

}
