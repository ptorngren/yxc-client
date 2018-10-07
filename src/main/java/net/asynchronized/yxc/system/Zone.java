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
public class Zone {
    private String id;
    @JsonProperty("zone_b")
    private Boolean zoneB;
    @JsonProperty("func_list")
    private List<String> functionList;
    @JsonProperty("input_list")
    private List<String> inputList;
    @JsonProperty("sound_program_list")
    private List<String> soundProgramList;
    @JsonProperty("tone_control_mode_list")
    private List<String> toneControlModeList;
    @JsonProperty("equalizer_mode_list")
    private List<String> equalizerModeList;
    @JsonProperty("link_control_list")
    private List<String> linkControlList;
    @JsonProperty("link_audio_delay_list")
    private List<String> linkAudioDelayList;
    @JsonProperty("range_step")
    private List<RangeStep> rangeSteps;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Boolean getZoneB() {
        return zoneB;
    }

    public void setZoneB(Boolean zoneB) {
        this.zoneB = zoneB;
    }

    public List<String> getFunctionList() {
        return functionList;
    }

    public void setFunctionList(List<String> functionList) {
        this.functionList = functionList;
    }

    public List<String> getInputList() {
        return inputList;
    }

    public void setInputList(List<String> inputList) {
        this.inputList = inputList;
    }

    public List<String> getSoundProgramList() {
        return soundProgramList;
    }

    public void setSoundProgramList(List<String> soundProgramList) {
        this.soundProgramList = soundProgramList;
    }

    public List<String> getToneControlModeList() {
        return toneControlModeList;
    }

    public void setToneControlModeList(List<String> toneControlModeList) {
        this.toneControlModeList = toneControlModeList;
    }

    public List<String> getEqualizerModeList() {
        return equalizerModeList;
    }

    public void setEqualizerModeList(List<String> equalizerModeList) {
        this.equalizerModeList = equalizerModeList;
    }

    public List<String> getLinkControlList() {
        return linkControlList;
    }

    public void setLinkControlList(List<String> linkControlList) {
        this.linkControlList = linkControlList;
    }

    public List<String> getLinkAudioDelayList() {
        return linkAudioDelayList;
    }

    public void setLinkAudioDelayList(List<String> linkAudioDelayList) {
        this.linkAudioDelayList = linkAudioDelayList;
    }

    public List<RangeStep> getRangeSteps() {
        return rangeSteps;
    }

    public void setRangeSteps(List<RangeStep> rangeSteps) {
        this.rangeSteps = rangeSteps;
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
        return "Zone{" + "id=" + id + ", zoneB=" + zoneB + ", functionList=" + functionList + ", inputList=" + inputList + ", soundProgramList=" + soundProgramList + ", toneControlModeList=" + toneControlModeList + ", equalizerModeList=" + equalizerModeList + ", linkControlList=" + linkControlList + ", linkAudioDelayList=" + linkAudioDelayList + ", rangeSteps=" + rangeSteps + ", additionalProperties=" + additionalProperties + '}';
    }
}
