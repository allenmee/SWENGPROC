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
public class SearchRadar {

    private final int range = 20;
    private byte searchRadarPower;
    private byte valid;
    private byte objNum;
    private byte bearing;
    private byte climbRate;
    private int altitude;
    private float closingSpeed;

    public SearchRadar() {

    }

    public void setSearchRadarPower(byte searchRadarPower) {
        this.searchRadarPower = searchRadarPower;
    }

    public int getRange() {
        return range;
    }

    public byte getValid() {
        return valid;
    }

    public byte getObjNum() {
        return objNum;
    }

    public byte getBearing() {
        return bearing;
    }

    public byte getClimbRate() {
        return climbRate;
    }

    public int getAltitude() {
        return altitude;
    }

    public float getClosingSpeed() {
        return closingSpeed;
    }
}
