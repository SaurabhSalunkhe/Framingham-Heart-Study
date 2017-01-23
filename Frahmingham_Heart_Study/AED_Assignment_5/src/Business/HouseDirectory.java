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
public class HouseDirectory {
    
        ArrayList<House> houseDirectory= new ArrayList<House>();

    public ArrayList<House> getHouseDirectory() {
        return houseDirectory;
    }

    public void setHouseDirectory(ArrayList<House> houseDirectory) {
        this.houseDirectory = houseDirectory;
    }
        
        
    public House addHouse(){
        House house= new House();
        houseDirectory.add(house);
        return house;
    }
    
    
    public void delHouse(House house){
        houseDirectory.remove(house);
    }
        
    public House get(int index){
        return houseDirectory.get(index);
    }
}
