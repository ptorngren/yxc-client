/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.asynchronized.yxc.tuner;

import com.fasterxml.jackson.annotation.JsonProperty;
import net.asynchronized.yxc.Response;

/**
 *
 * @author enrico
 */
public class TunerPlayInfo extends Response {
    public static final String PATH = ROOT_PATH + "/tuner/getPlayInfo";
    
    private String band;
    @JsonProperty("auto_scan")
    private Boolean autoScan;
    @JsonProperty("auto_preset")
    private Boolean autoPreset;
    private AM am;
    private FM fm;
    private RDS rds;
    private DAB dab;
    @JsonProperty("hd_radio")
    private Object hdRadio;

    public String getBand() {
        return band;
    }

    public void setBand(String band) {
        this.band = band;
    }

    public Boolean getAutoScan() {
        return autoScan;
    }

    public void setAutoScan(Boolean autoScan) {
        this.autoScan = autoScan;
    }

    public Boolean getAutoPreset() {
        return autoPreset;
    }

    public void setAutoPreset(Boolean autoPreset) {
        this.autoPreset = autoPreset;
    }

    public AM getAm() {
        return am;
    }

    public void setAm(AM am) {
        this.am = am;
    }

    public FM getFm() {
        return fm;
    }

    public void setFm(FM fm) {
        this.fm = fm;
    }

    public RDS getRds() {
        return rds;
    }

    public void setRds(RDS rds) {
        this.rds = rds;
    }

    public DAB getDab() {
        return dab;
    }

    public void setDab(DAB dab) {
        this.dab = dab;
    }

    public Object getHdRadio() {
        return hdRadio;
    }

    public void setHdRadio(Object hdRadio) {
        this.hdRadio = hdRadio;
    }

    @Override
    public String toString() {
        return "PlayInfo{" + "responseCode=" + getResponseCode() + ", band=" + band + ", autoScan=" + autoScan + ", autoPreset=" + autoPreset + ", am=" + am + ", fm=" + fm + ", rds=" + rds + ", dab=" + dab + ", hdRadio=" + hdRadio + '}';
    }
    
}
