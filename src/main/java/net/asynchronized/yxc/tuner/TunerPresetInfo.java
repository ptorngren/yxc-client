/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.asynchronized.yxc.tuner;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import net.asynchronized.yxc.Response;

/**
 *
 * @author enrico
 */
public class TunerPresetInfo extends Response {
    public static final String PATH = ROOT_PATH + "/tuner/getPresetInfo";
    
    @JsonProperty("preset_info")
    private List<TunerPresetInfoEntry> infoList;
    @JsonProperty("func_list")
    private List<String> funcList;

    public List<TunerPresetInfoEntry> getInfoList() {
        return infoList;
    }

    public void setInfoList(List<TunerPresetInfoEntry> infoList) {
        this.infoList = infoList;
    }

    public List<String> getFuncList() {
        return funcList;
    }

    public void setFuncList(List<String> funcList) {
        this.funcList = funcList;
    }

    @Override
    public String toString() {
        return "PresetInfo{" + "responseCode=" + getResponseCode() + ", infoList=" + infoList + ", funcList=" + funcList + '}';
    }
    
}
