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
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author enrico
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ZoneList {
    private Boolean main;
    private Boolean zone2;
    private Boolean zone3;
    private Boolean zone4;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Boolean getMain() {
        return main;
    }

    public void setMain(Boolean main) {
        this.main = main;
    }

    public Boolean getZone2() {
        return zone2;
    }

    public void setZone2(Boolean zone2) {
        this.zone2 = zone2;
    }

    public Boolean getZone3() {
        return zone3;
    }

    public void setZone3(Boolean zone3) {
        this.zone3 = zone3;
    }

    public Boolean getZone4() {
        return zone4;
    }

    public void setZone4(Boolean zone4) {
        this.zone4 = zone4;
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
        return "ZoneList{" + "main=" + main + ", zone2=" + zone2 + ", zone3=" + zone3 + ", zone4=" + zone4 + ", additionalProperties=" + additionalProperties + '}';
    }
    
}
