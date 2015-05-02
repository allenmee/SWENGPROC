/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CIWS;

/**
 *
 * @author EBIEMI
 */
public class Autocannon {
    
    private float azimuth;
    private float elevation;
    private byte fire;
    private int roundsFired;
    
    public Autocannon(){
    
    }

    public float getAzimuth() {
        return azimuth;
    }

    public void setAzimuth(float azimuth) {
        this.azimuth = azimuth;
    }

    public float getElevation() {
        return elevation;
    }

    public void setElevation(float elevation) {
        this.elevation = elevation;
    }

    public void setFire(byte fire) {
        this.fire = fire;
    }

    public int getRoundsFired() {
        return roundsFired;
    }
}
