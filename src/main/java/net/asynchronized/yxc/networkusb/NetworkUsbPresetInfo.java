/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.asynchronized.yxc.networkusb;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import net.asynchronized.yxc.Response;

/**
 *
 * @author enrico
 */
public class NetworkUsbPresetInfo extends Response {
    public static final String PATH = ROOT_PATH + "/netusb/getPresetInfo";
    
    @JsonProperty("preset_info")
    private List<NetworkUsbPresetInfoEntry> presetInfoList;
    @JsonProperty("func_list")
    private List<String> funcList;

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

    @Override
    public String toString() {
        return "PresetInfo{" + "responseCode=" + getResponseCode() + ", presetInfoList=" + presetInfoList + ", funcList=" + funcList + '}';
    }
    
}
