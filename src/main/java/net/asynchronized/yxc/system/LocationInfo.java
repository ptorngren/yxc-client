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
public class LocationInfo extends Response {
    public static final String PATH = ROOT_PATH + "/system/getLocationInfo";
    
    private String id;
    private String name;
    @JsonProperty("zone_list")
    private ZoneList zoneList;
    @JsonProperty("stereo_pair_status")
    private String stereoPairStatus;

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

    @Override
    public String toString() {
        return "LocationInfo{"  + "responseCode=" + getResponseCode() + ", id=" + id + ", name=" + name + ", zoneList=" + zoneList + ", stereoPairStatus=" + stereoPairStatus + '}';
    }
    
}
