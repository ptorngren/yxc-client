/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.asynchronized.yxc.networkusb;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * @author enrico
 */
public class ServiceListEntry {
    private String id;
    private Boolean registered;
    @JsonProperty("login_status")
    private String loginStatus;
    private String username;
    private String type;
    @JsonProperty("trial_time_left")
    private Integer trialTimeLeft;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Boolean getRegistered() {
        return registered;
    }

    public void setRegistered(Boolean registered) {
        this.registered = registered;
    }

    public String getLoginStatus() {
        return loginStatus;
    }

    public void setLoginStatus(String loginStatus) {
        this.loginStatus = loginStatus;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getTrialTimeLeft() {
        return trialTimeLeft;
    }

    public void setTrialTimeLeft(Integer trialTimeLeft) {
        this.trialTimeLeft = trialTimeLeft;
    }

    @Override
    public String toString() {
        return "ServiceListEntry{" + "id=" + id + ", registered=" + registered + ", loginStatus=" + loginStatus + ", username=" + username + ", type=" + type + ", trialTimeLeft=" + trialTimeLeft + '}';
    }
    
}
