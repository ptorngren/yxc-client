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
public class MacAddress {
    @JsonProperty("wired_lan")
    private String wiredLan;
    @JsonProperty("wireless_lan")
    private String wirelessLan;
    @JsonProperty("wireless_direct")
    private String wirelessDirect;

    public String getWiredLan() {
        return wiredLan;
    }

    public void setWiredLan(String wiredLan) {
        this.wiredLan = wiredLan;
    }

    public String getWirelessLan() {
        return wirelessLan;
    }

    public void setWirelessLan(String wirelessLan) {
        this.wirelessLan = wirelessLan;
    }

    public String getWirelessDirect() {
        return wirelessDirect;
    }

    public void setWirelessDirect(String wirelessDirect) {
        this.wirelessDirect = wirelessDirect;
    }

    @Override
    public String toString() {
        return "MacAddress{" + "wiredLan=" + wiredLan + ", wirelessLan=" + wirelessLan + ", wirelessDirect=" + wirelessDirect + '}';
    }
    
}
