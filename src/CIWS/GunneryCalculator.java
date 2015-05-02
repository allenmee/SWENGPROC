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
public class GunneryCalculator {
    
    private int range;
    private int altitude;
    private byte calculate;
    private float elevation;
    private float time;
    private float elevation1;
    private float time1;

    public GunneryCalculator() {
        
    }

    public void setRange(int range) {
        this.range = range;
    }

    public void setAltitude(int altitude) {
        this.altitude = altitude;
    }

    public void setCalculate(byte calculate) {
        this.calculate = calculate;
    }

    public byte getCalculate() {
        return calculate;
    }

    public float getElevation() {
        return elevation;
    }

    public float getTime() {
        return time;
    }

    public float getElevation1() {
        return elevation1;
    }

    public float getTime1() {
        return time1;
    }
}
