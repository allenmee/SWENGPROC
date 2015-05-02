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
public class TrackingRadar {
     private byte power;
     private float azimuth;
     private float elevation;
     private int maxRangeGate;
     private int minRangeGate;
     private byte valid;
     private byte objNum;
     private float bearing;
     private float altitude;
     private float range;
     private float closingSpeed;
     private float climbRate;

    public TrackingRadar() {
    }

    public void setPower(byte power) {
        this.power = power;
    }

    public void setAzimuth(float azimuth) {
        this.azimuth = azimuth;
    }

    public void setElevation(float elevation) {
        this.elevation = elevation;
    }

    public void setMaxRangeGate(int maxRangeGate) {
        this.maxRangeGate = maxRangeGate;
    }

    public void setMinRangeGate(int minRangeGate) {
        this.minRangeGate = minRangeGate;
    }
    
    public float getAzimuth() {
        return azimuth;
    }

    public float getElevation() {
        return elevation;
    }

    public byte getValid() {
        return valid;
    }

    public byte getObjNum() {
        return objNum;
    }

    public float getBearing() {
        return bearing;
    }

    public float getAltitude() {
        return altitude;
    }

    public float getRange() {
        return range;
    }

    public float getClosingSpeed() {
        return closingSpeed;
    }

    public float getClimbRate() {
        return climbRate;
    }
}
