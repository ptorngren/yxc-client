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
public class System {
    @JsonProperty("func_list")
    private List<String> functions;
    @JsonProperty("zone_num")
    private Integer numberOfZones;
    @JsonProperty("input_list")
    private List<Input> inputList;
    @JsonProperty("range_step")
    private List<RangeStep> rangeSteps;
    @JsonProperty("speaker_settings")
    private Object speakerSettings;
    @JsonProperty("ymap_list")
    private List<String> ymapList;
    @JsonProperty("web_control_url")
    private String webControlUrl;

    public List<String> getFunctions() {
        return functions;
    }

    public void setFunctions(List<String> functions) {
        this.functions = functions;
    }

    public Integer getNumberOfZones() {
        return numberOfZones;
    }

    public void setNumberOfZones(Integer numberOfZones) {
        this.numberOfZones = numberOfZones;
    }

    public List<Input> getInputList() {
        return inputList;
    }

    public void setInputList(List<Input> inputList) {
        this.inputList = inputList;
    }

    public List<RangeStep> getRangeSteps() {
        return rangeSteps;
    }

    public void setRangeSteps(List<RangeStep> rangeSteps) {
        this.rangeSteps = rangeSteps;
    }

    public Object getSpeakerSettings() {
        return speakerSettings;
    }

    public void setSpeakerSettings(Object speakerSettings) {
        this.speakerSettings = speakerSettings;
    }

    public List<String> getYmapList() {
        return ymapList;
    }

    public void setYmapList(List<String> ymapList) {
        this.ymapList = ymapList;
    }

    public String getWebControlUrl() {
        return webControlUrl;
    }

    public void setWebControlUrl(String webControlUrl) {
        this.webControlUrl = webControlUrl;
    }

    @Override
    public String toString() {
        return "System{" + "functions=" + functions + ", numberOfZones=" + numberOfZones + ", inputList=" + inputList + ", rangeSteps=" + rangeSteps + ", speakerSettings=" + speakerSettings + ", ymapList=" + ymapList + ", webControlUrl=" + webControlUrl + '}';
    }
    
}
