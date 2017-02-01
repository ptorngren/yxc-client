/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.asynchronized.yxc.tuner;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * @author enrico
 */
public class TunerPresetInfoEntry {
    private String band;
    private Integer number;
    @JsonProperty("hd_program")
    private Integer hdProgram;

    public String getBand() {
        return band;
    }

    public void setBand(String band) {
        this.band = band;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Integer getHdProgram() {
        return hdProgram;
    }

    public void setHdProgram(Integer hdProgram) {
        this.hdProgram = hdProgram;
    }

    @Override
    public String toString() {
        return "PInfo{" + "band=" + band + ", number=" + number + ", hdProgram=" + hdProgram + '}';
    }
    
}
