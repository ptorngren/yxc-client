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
import net.asynchronized.yxc.Response;

/**
 *
 * @author enrico
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DistributionInfo extends Response {
    public static final String PATH = ROOT_PATH + "/dist/getDistributionInfo";
    
    public static final String ROLE_SERVER = "server";
    public static final String ROLE_CLIENT = "client";
    public static final String ROLE_NONE = "none";
    
    @JsonProperty("group_id")
    private String groupId;
    @JsonProperty("group_name")
    private String groupName;
    @JsonProperty("role")
    private String role;
    @JsonProperty("server_zone")
    private String serverZone;
    @JsonProperty("client_list")
    private List<ClientListEntry> clients;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getServerZone() {
        return serverZone;
    }

    public void setServerZone(String serverZone) {
        this.serverZone = serverZone;
    }

    public List<ClientListEntry> getClients() {
        return clients;
    }

    public void setClients(List<ClientListEntry> clients) {
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
        return "DistributionInfo{" + "groupId=" + groupId + ", groupName=" + groupName + ", role=" + role + ", serverZone=" + serverZone + ", clients=" + clients + ", additionalProperties=" + additionalProperties + '}';
    }
}
