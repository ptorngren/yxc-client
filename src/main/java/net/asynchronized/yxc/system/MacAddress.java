/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.asynchronized.yxc.system;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author enrico
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MacAddress {
    @JsonProperty("wired_lan")
    private String wiredLan;
    @JsonProperty("wireless_lan")
    private String wirelessLan;
    @JsonProperty("wireless_direct")
    private String wirelessDirect;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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
        return "MacAddress{" + "wiredLan=" + wiredLan + ", wirelessLan=" + wirelessLan + ", wirelessDirect=" + wirelessDirect + ", additionalProperties=" + additionalProperties + '}';
    }
}
