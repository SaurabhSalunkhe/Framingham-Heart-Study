/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author keval
 */
public class Patient {
    private VitalSignDirectory vitalSignDirectory;

    public Patient() {
    
        this.vitalSignDirectory=new VitalSignDirectory();
    
    }

    
    
    
    public VitalSignDirectory getVitalSignDirectory() {
        return vitalSignDirectory;
    }

    public void setVitalSignDirectory(VitalSignDirectory vitalSignDirectory) {
        this.vitalSignDirectory = vitalSignDirectory;
    }
    
}
