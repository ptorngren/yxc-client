/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.asynchronized.yxc.system;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 *
 * @author enrico
 */
public class Distribution {
    @JsonProperty("server_zone_list")
    private List<String> serverZoneList;

    public List<String> getServerZoneList() {
        return serverZoneList;
    }

    public void setServerZoneList(List<String> serverZoneList) {
        this.serverZoneList = serverZoneList;
    }

    @Override
    public String toString() {
        return "Distribution{" + "serverZoneList=" + serverZoneList + '}';
    }
    
}
