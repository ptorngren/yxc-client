/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.asynchronized.yxc.networkusb;

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
public class NetworkUsbPresetInfo extends Response {
    public static final String PATH = ROOT_PATH + "/netusb/getPresetInfo";
    
    @JsonProperty("preset_info")
    private List<NetworkUsbPresetInfoEntry> presetInfoList;
    @JsonProperty("func_list")
    private List<String> funcList;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public List<NetworkUsbPresetInfoEntry> getPresetInfoList() {
        return presetInfoList;
    }

    public void setPresetInfoList(List<NetworkUsbPresetInfoEntry> presetInfoList) {
        this.presetInfoList = presetInfoList;
    }

    public List<String> getFuncList() {
        return funcList;
    }

    public void setFuncList(List<String> funcList) {
        this.funcList = funcList;
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
        return "NetworkUsbPresetInfo{" + "presetInfoList=" + presetInfoList + ", funcList=" + funcList + ", additionalProperties=" + additionalProperties + '}';
    }

}
