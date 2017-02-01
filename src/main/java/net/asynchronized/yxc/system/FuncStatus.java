/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.asynchronized.yxc.system;

import com.fasterxml.jackson.annotation.JsonProperty;
import net.asynchronized.yxc.Response;

/**
 *
 * @author enrico
 */
public class FuncStatus extends Response {
    public static final String PATH = ROOT_PATH + "/system/getFuncStatus";
    
    @JsonProperty("auto_power_standby")
    private Boolean autoPowerStandby;
    @JsonProperty("ir_sensor")
    private Boolean irSensor;
    @JsonProperty("speaker_a")
    private Boolean speakerA;
    @JsonProperty("speakber_b")
    private Boolean speakerB;
    private Boolean headphone;
    private Integer dimmer;
    @JsonProperty("zone_b_volume_sync")
    private Boolean zoneBVolumeSync;
    @JsonProperty("hdmi_out_1")     // hdmi_out_1 not content in API doc, all other parameters not returned
    private Boolean hdmiOut1;

    public Boolean getAutoPowerStandby() {
        return autoPowerStandby;
    }

    public void setAutoPowerStandby(Boolean autoPowerStandby) {
        this.autoPowerStandby = autoPowerStandby;
    }

    public Boolean getIrSensor() {
        return irSensor;
    }

    public void setIrSensor(Boolean irSensor) {
        this.irSensor = irSensor;
    }

    public Boolean getSpeakerA() {
        return speakerA;
    }

    public void setSpeakerA(Boolean speakerA) {
        this.speakerA = speakerA;
    }

    public Boolean getSpeakerB() {
        return speakerB;
    }

    public void setSpeakerB(Boolean speakerB) {
        this.speakerB = speakerB;
    }

    public Boolean getHeadphone() {
        return headphone;
    }

    public void setHeadphone(Boolean headphone) {
        this.headphone = headphone;
    }

    public Integer getDimmer() {
        return dimmer;
    }

    public void setDimmer(Integer dimmer) {
        this.dimmer = dimmer;
    }

    public Boolean getZoneBVolumeSync() {
        return zoneBVolumeSync;
    }

    public void setZoneBVolumeSync(Boolean zoneBVolumeSync) {
        this.zoneBVolumeSync = zoneBVolumeSync;
    }

    public Boolean getHdmiOut1() {
        return hdmiOut1;
    }

    public void setHdmiOut1(Boolean hdmiOut1) {
        this.hdmiOut1 = hdmiOut1;
    }

    @Override
    public String toString() {
        return "FuncStatus{" + "responseCode=" + getResponseCode() + ", autoPowerStandby=" + autoPowerStandby + ", irSensor=" + irSensor + ", speakerA=" + speakerA + ", speakerB=" + speakerB + ", headphone=" + headphone + ", dimmer=" + dimmer + ", zoneBVolumeSync=" + zoneBVolumeSync + ", hdmiOut1=" + hdmiOut1 + '}';
    }
    
}
