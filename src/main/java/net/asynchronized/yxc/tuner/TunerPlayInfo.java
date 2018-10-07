/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.asynchronized.yxc.tuner;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.HashMap;
import java.util.Map;
import net.asynchronized.yxc.Response;

/**
 *
 * @author enrico
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
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
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
    }

    @Override
    public String toString() {
        return "TunerPlayInfo{" + "band=" + band + ", autoScan=" + autoScan + ", autoPreset=" + autoPreset + ", am=" + am + ", fm=" + fm + ", rds=" + rds + ", dab=" + dab + ", hdRadio=" + hdRadio + ", additionalProperties=" + additionalProperties + '}';
    }
    
}
