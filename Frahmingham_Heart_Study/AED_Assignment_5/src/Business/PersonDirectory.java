/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author Saurabh Salunkhe
 */
public class PersonDirectory {
   
    ArrayList<Person> personDirectory= new ArrayList<Person>();

    public ArrayList<Person> getPersonDirectory() {
        return personDirectory;
    }

    public void setPersonDirectory(ArrayList<Person> personDirectory) {
        this.personDirectory = personDirectory;
    }
    
    
    public Person addPerson(){
        Person person= new Person();
        personDirectory.add(person);
        return person;
    }
    
    public void delPerson(Person person){
        personDirectory.remove(person);
    }
    
    public Person get(int index){
        return personDirectory.get(index);
    }
    
}
