/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.asynchronized.yxc.system;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * @author enrico
 */
public class MusiccastNetwork {
    private Boolean ready;
    @JsonProperty("device_type")
    private String deviceType;
    @JsonProperty("child_num")
    private Integer childNum;
    private Integer ch;
    @JsonProperty("initial_join_running")
    private Boolean initialJoinRunning;

    public Boolean getReady() {
        return ready;
    }

    public void setReady(Boolean ready) {
        this.ready = ready;
    }

    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    public Integer getChildNum() {
        return childNum;
    }

    public void setChildNum(Integer childNum) {
        this.childNum = childNum;
    }

    public Integer getCh() {
        return ch;
    }

    public void setCh(Integer ch) {
        this.ch = ch;
    }

    public Boolean getInitialJoinRunning() {
        return initialJoinRunning;
    }

    public void setInitialJoinRunning(Boolean initialJoinRunning) {
        this.initialJoinRunning = initialJoinRunning;
    }

    @Override
    public String toString() {
        return "MusiccastNetwork{" + "ready=" + ready + ", deviceType=" + deviceType + ", childNum=" + childNum + ", ch=" + ch + ", initialJoinRunning=" + initialJoinRunning + '}';
    }
    
}
