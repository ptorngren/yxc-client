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
import java.util.List;
import java.util.Map;

/**
 *
 * @author enrico
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
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
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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
        return "System{" + "functions=" + functions + ", numberOfZones=" + numberOfZones + ", inputList=" + inputList + ", rangeSteps=" + rangeSteps + ", speakerSettings=" + speakerSettings + ", ymapList=" + ymapList + ", webControlUrl=" + webControlUrl + ", additionalProperties=" + additionalProperties + '}';
    }
}
