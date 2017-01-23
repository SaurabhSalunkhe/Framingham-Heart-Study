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
public class CommunityDirectory {
 
        ArrayList<Community> communityDirectory = new ArrayList<Community>();

    public ArrayList<Community> getCommunityDirectory() {
        return communityDirectory;
    }

    public void setCommunityDirectory(ArrayList<Community> communityDirectory) {
        this.communityDirectory = communityDirectory;
    }
        
    public Community addCommunity(){
        Community community= new Community();
        communityDirectory.add(community);
        return community;
    }
    
    public void delCommunity(Community community){
        communityDirectory.remove(community);
    }
        
    public Community get(int index){
        return communityDirectory.get(index);
    }
    
    
    
}
