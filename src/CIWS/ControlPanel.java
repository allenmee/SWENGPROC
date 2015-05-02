/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CIWS;

/**
 *
 * @author p4279494
 */
public class ControlPanel {
    
    private int maxEngRange;
    private int minEngRange;
    private int maxEngAlt;
    private int minEngAlt;
    private int maxEngSpeed;
    private int minEngSpeed;
    private byte masterMode;
    private byte weaponMode;
    
    private byte actualTarget;
    private byte desiredTarget;
    private byte nofireSoln;
    private byte fireIndicator;
    private byte lowAmmoIndicator;
    private byte ammoEmpty;
            
    public ControlPanel(){
        
    }

    public int getMaxEngRange() {
        return maxEngRange;
    }

    public int getMinEngRange() {
        return minEngRange;
    }

    public int getMaxEngAlt() {
        return maxEngAlt;
    }

    public int getMinEngAlt() {
        return minEngAlt;
    }

    public int getMaxEngSpeed() {
        return maxEngSpeed;
    }

    public int getMinEngSpeed() {
        return minEngSpeed;
    }

    public byte getMasterMode() {
        return masterMode;
    }

    public byte getWeaponMode() {
        return weaponMode;
    }

    public void setActualTarget(byte actualTarget) {
        this.actualTarget = actualTarget;
    }

    public void setDesiredTarget(byte desiredTarget) {
        this.desiredTarget = desiredTarget;
    }

    public void setNofireSoln(byte nofireSoln) {
        this.nofireSoln = nofireSoln;
    }

    public void setFireIndicator(byte fireIndicator) {
        this.fireIndicator = fireIndicator;
    }

    public void setLowAmmoIndicator(byte lowAmmoIndicator) {
        this.lowAmmoIndicator = lowAmmoIndicator;
    }

    public void setAmmoEmpty(byte ammoEmpty) {
        this.ammoEmpty = ammoEmpty;
    }
    
    
}
