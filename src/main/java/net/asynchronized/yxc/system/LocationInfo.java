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
import net.asynchronized.yxc.Response;

/**
 *
 * @author enrico
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class LocationInfo extends Response {
    public static final String PATH = ROOT_PATH + "/system/getLocationInfo";
    
    private String id;
    private String name;
    @JsonProperty("zone_list")
    private ZoneList zoneList;
    @JsonProperty("stereo_pair_status")
    private String stereoPairStatus;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ZoneList getZoneList() {
        return zoneList;
    }

    public void setZoneList(ZoneList zoneList) {
        this.zoneList = zoneList;
    }

    public String getStereoPairStatus() {
        return stereoPairStatus;
    }

    public void setStereoPairStatus(String stereoPairStatus) {
        this.stereoPairStatus = stereoPairStatus;
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
        return "LocationInfo{" + "id=" + id + ", name=" + name + ", zoneList=" + zoneList + ", stereoPairStatus=" + stereoPairStatus + ", additionalProperties=" + additionalProperties + '}';
    }
}
