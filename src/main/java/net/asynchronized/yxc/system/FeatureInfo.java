/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.asynchronized.yxc.system;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import net.asynchronized.yxc.Response;

/**
 *
 * @author enrico
 */
public class FeatureInfo extends Response {
    public static final String PATH = ROOT_PATH + "/system/getFeatures";
    
    private System system;
    @JsonProperty("zone")
    private List<Zone> zones;
    private Tuner tuner;
    @JsonProperty("netusb")
    private NetUsb netUsb;
    private Distribution distribution;
    private Object clock;

    public System getSystem() {
        return system;
    }

    public void setSystem(System system) {
        this.system = system;
    }

    public List<Zone> getZones() {
        return zones;
    }

    public void setZones(List<Zone> zones) {
        this.zones = zones;
    }

    public Tuner getTuner() {
        return tuner;
    }

    public void setTuner(Tuner tuner) {
        this.tuner = tuner;
    }

    public NetUsb getNetUsb() {
        return netUsb;
    }

    public void setNetUsb(NetUsb netUsb) {
        this.netUsb = netUsb;
    }

    public Distribution getDistribution() {
        return distribution;
    }

    public void setDistribution(Distribution distribution) {
        this.distribution = distribution;
    }

    public Object getClock() {
        return clock;
    }

    public void setClock(Object clock) {
        this.clock = clock;
    }

    @Override
    public String toString() {
        return "FeatureInfo{" + "responseCode=" + getResponseCode() + ", system=" + system + ", zones=" + zones + ", tuner=" + tuner + ", netUsb=" + netUsb + ", distribution=" + distribution + ", clock=" + clock + '}';
    }
    
}
