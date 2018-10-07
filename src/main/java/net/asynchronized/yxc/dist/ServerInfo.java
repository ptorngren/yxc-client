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
public class ServerInfo {
    public static final String PATH = ROOT_PATH + "/dist/setServerInfo";
    public static final String TYPE_ADD = "add";
    public static final String TYPE_REMOVE = "remove";
    
    @JsonProperty("group_id")
    private String groupId;
    @JsonProperty("zone")
    private String zone;
    @JsonProperty("type")
    private String type;
    @JsonProperty("client_list")
    private List<String> clients;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public String getGroupId() {
        return groupId;
    }

    /**
     * Specify Group ID in 32-digit hex. Specify "" (empty text) here to cancel a Device being the Link distribution server.
     * Group ID will be initialized ("000...") after the cancel operation
     * @param groupId 
     */
    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getZone() {
        return zone;
    }

    /**
     * Specifies which target Zone ID to be the Link distribution
     * server. If nothing is specified, current setting is kept. Zone
     * ID to be the Link distribution server is confirmable using
     * system/getFeatures server_zone_list.
     * Values: "main" / "zone2" / "zone3" / "zone4"
     * @param zone 
     */
    public void setZone(String zone) {
        this.zone = zone;
    }

    public String getType() {
        return type;
    }

    /**
     * Specifies a type of adding or removing clients. Not necessary
     * to specify when canceling the Link master status,
     * Values: "add" / "remove"
     * @param type 
     */
    public void setType(String type) {
        this.type = type;
    }

    public List<String> getClients() {
        return clients;
    }

    /**
     * Specifies IP addresses of adding/removing clients. Specifiable
     * up to 9 clients
     * @param clients 
     */
    public void setClients(List<String> clients) {
        this.clients = clients;
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
        return "ServerInfo{" + "groupId=" + groupId + ", zone=" + zone + ", type=" + type + ", clients=" + clients + ", additionalProperties=" + additionalProperties + '}';
    }
}
