/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author Saurabh Salunkhe
 */
public class FamilyDirectory {
    
    ArrayList<Family> familyDirectory = new ArrayList<Family>();

    public ArrayList<Family> getFamilyDirectory() {
        return familyDirectory;
    }

    public void setFamilyDirectory(ArrayList<Family> familyDirectory) {
        this.familyDirectory = familyDirectory;
    }
    
    
    public Family addFAmily(){
        
        Family family= new Family();
        familyDirectory.add(family);
        return family;
        
    }
    
    public void delFamily(Family family){
        familyDirectory.remove(family);
    }
    
    public Family get(int index){
        return familyDirectory.get(index);
    }
}
