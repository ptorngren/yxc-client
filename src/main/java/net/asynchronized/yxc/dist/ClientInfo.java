/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.asynchronized.yxc.dist;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import static net.asynchronized.yxc.Response.ROOT_PATH;

/**
 *
 * @author enrico
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ClientInfo {
    public static final String PATH = ROOT_PATH + "/dist/setClientInfo";
    
    @JsonProperty("group_id")
    private String groupId;
    @JsonProperty("zone")
    private List<String> zones;
    @JsonProperty("server_ip_address")
    private String serverIpAddress;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public String getGroupId() {
        return groupId;
    }

    /**
     * Specifies Group ID in 32-digit hex.
     * Specify "" (empty text) here to cancel a Device being a Link
     * distributed client. Group ID will be initialized ("000...") after
     * the cancel operation
     * @param groupId 
     */
    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public List<String> getZones() {
        return zones;
    }

    /**
     * Specifies which target Zone ID to be a Link distributed
     * client. Not necessary to specify when cancelling a client status.
     * Values: "main" / "zone2" / "zone3" / "zone4"
     * @param zones 
     */
    public void setZones(List<String> zones) {
        this.zones = zones;
    }

    public String getServerIpAddress() {
        return serverIpAddress;
    }

    /**
     * Specifies the IP Address of the Link distribution server
     * @param serverIpAddress 
     */
    public void setServerIpAddress(String serverIpAddress) {
        this.serverIpAddress = serverIpAddress;
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
        return "ClientInfo{" + "groupId=" + groupId + ", zones=" + zones + ", serverIpAddress=" + serverIpAddress + ", additionalProperties=" + additionalProperties + '}';
    }
}
