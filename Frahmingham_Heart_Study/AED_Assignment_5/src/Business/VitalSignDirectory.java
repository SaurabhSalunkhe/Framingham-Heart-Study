/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Saurabh Salunkhe
 */
public class VitalSignDirectory {
    
    ArrayList<VitalSign> vitalSignDirectory= new ArrayList<VitalSign>();

    public ArrayList<VitalSign> getVitalSignDirectory() {
        return vitalSignDirectory;
    }

    public void setVitalSignDirectory(ArrayList<VitalSign> vitalSignDirectory) {
        this.vitalSignDirectory = vitalSignDirectory;
    }
    
    public VitalSign addVitalSign( double ldlCholesterol, double hdlCholesterol, double bloodPressure, boolean hasDiabetes, boolean smoking, double totalCholesterol,  LocalDate recordDate, int pulse){
        
        VitalSign vitalSign= new VitalSign( ldlCholesterol, hdlCholesterol, bloodPressure, hasDiabetes, smoking, totalCholesterol,  recordDate, pulse);
        vitalSignDirectory.add(vitalSign);
        return vitalSign;
    }    
    
    public VitalSign get(int index){
        return vitalSignDirectory.get(index);
    }
}
