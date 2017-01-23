/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.time.LocalDate;
import java.util.Random;

/**
 *
 * @author keval
 */
public class Initilization {

    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
     */
    /**
     *
     * @author keval
     */
    final static java.util.Random rand = new java.util.Random();
    private static final String CHAR_LIST = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final int RANDOM_STRING_LENGTH = 10;

    public static void popolateCity(City city) {
        Person person;
        Family family;
        House house;
        Community community;
        Patient patient;
        VitalSignDirectory vitalSignDirectory;
        city.setCommunityDirectory(new CommunityDirectory());
        for (int communityNumber = 0; communityNumber <= 4; communityNumber++) {
            community = city.getCommunityDirectory().addCommunity();
            community.setHouseDirectory(new HouseDirectory());
            community.setCommunityID(communityNumber);
            community.setName(generateRandomString());

            for (int houseNumber = 0; houseNumber <= 9; houseNumber++) {
                house = community.getHouseDirectory().addHouse();
                house.setFamilyDirectory(new FamilyDirectory());
                house.setHouseId(houseNumber);

                for (int familyNumber = 0; familyNumber <= 4; familyNumber++) {
                    family = house.getFamilyDirectory().addFAmily();
                    family.setPersonDirectory(new PersonDirectory());
                    family.setFamilyID(familyNumber);

                    for (int personNumber = 0; personNumber <= 5; personNumber++) {

                        patient = new Patient();
                        person = family.getPersonDirectory().addPerson();
                        person.setFirstName(generateRandomString());
                        vitalSignDirectory = patient.getVitalSignDirectory();
                        for (int i = 0; i < 5; i++) {
                            VitalSign vitalSign = vitalSignDirectory.addVitalSign(generateldlInteger(), generatehdlInteger(), generateInteger(), generateBoolean(), generateBoolean(), generateInteger(), dobGenerator(2015, 2016), generateInteger());

                        }

                        switch (personNumber) {
                            case 0:
                                person.setPatient(patient);
                                person.setDob(dobGenerator(1945, 1955));
                                person.setGender("male");
                                break;
                            case 1:
                                person.setPatient(patient);
                                person.setDob(dobGenerator(1945, 1955));
                                person.setGender("female");
                                break;
                            case 2:
                                person.setPatient(patient);
                                person.setDob(dobGenerator(1956, 1970));
                                person.setGender("male");
                                break;
                            case 3:
                                person.setPatient(patient);
                                person.setDob(dobGenerator(1956, 1970));
                                person.setGender("female");
                                break;
                            case 4:
                                person.setPatient(patient);
                                person.setDob(dobGenerator(1972, 1985));
                                person.setGender(getGender());

                                break;
                            case 5:
                                person.setPatient(patient);
                                person.setDob(dobGenerator(1972, 1985));
                                person.setGender(getGender());

                                break;

                        }
                    }

                }

            }
        }
    }

    public static void assignFather(City city) {

        for (int i = 0; i < 1000; i = i + 4) {

            String s = city.getCommunityDirectory().getCommunityDirectory().get(i).getHouseDirectory().getHouseDirectory().get(i).getFamilyDirectory().getFamilyDirectory().get(i).getPersonDirectory().getPersonDirectory().get(i).getFirstName();
            System.out.println(i + "th Father is " + s);
        }

    }

    public static String generateRandomString() {

        StringBuffer randStr = new StringBuffer();
        for (int i = 0; i < RANDOM_STRING_LENGTH; i++) {
            int number = rand.nextInt(10);
            char ch = CHAR_LIST.charAt(number);
            randStr.append(ch);

        }
        return randStr.toString();
    }

    public static LocalDate dobGenerator(int lim1, int lim2) {

        Random random = new Random();
        int minDay = (int) LocalDate.of(lim1, 1, 1).toEpochDay();
        int maxDay = (int) LocalDate.of(lim2, 1, 1).toEpochDay();

        long randomDay = minDay + random.nextInt(maxDay - minDay);

        LocalDate randomBirthDate = LocalDate.ofEpochDay(randomDay);
        return randomBirthDate;

    }

    public static String getGender() {

        Random gender = new Random();
        Boolean flag = gender.nextBoolean();

        if (flag == true) {
            return "male";
        } else {
            return "female";
        }
    }

    public static boolean generateBoolean() {
        boolean flag = false;
        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            flag = r.nextBoolean();
        }
        return flag;
    }

    public static int generateInteger() {        //generate random interger for blood prossure

        Random r = new Random();
        int minNumber = 80;
        int maxNumber = 160;
        int randomNumber = minNumber + r.nextInt(maxNumber - minNumber);
        return randomNumber;
    }

    public static int generateldlInteger() {         //generator for low cholestrol

        Random r = new Random();
        int minNumber = 50;
        int maxNumber = 220;
        int randomNumber = minNumber + r.nextInt(maxNumber - minNumber);
        return randomNumber;

    }

    public static int generatehdlInteger() {      //generator for high cholestrol

        Random r = new Random();
        int minNumber = 20;
        int maxNumber = 60;
        int randomNumber = minNumber + r.nextInt(maxNumber - minNumber);
        return randomNumber;
    }

}
