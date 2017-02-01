/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.asynchronized.yxc.zone;

/**
 *
 * @author enrico
 */
public class Equalizer {
    private String mode;
    private Integer low;
    private Integer mid;
    private Integer high;

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public Integer getLow() {
        return low;
    }

    public void setLow(Integer low) {
        this.low = low;
    }

    public Integer getMid() {
        return mid;
    }

    public void setMid(Integer mid) {
        this.mid = mid;
    }

    public Integer getHigh() {
        return high;
    }

    public void setHigh(Integer high) {
        this.high = high;
    }

    @Override
    public String toString() {
        return "Equalizer{" + "mode=" + mode + ", low=" + low + ", mid=" + mid + ", high=" + high + '}';
    }
    
}
