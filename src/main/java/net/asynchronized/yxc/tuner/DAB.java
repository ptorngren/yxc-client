/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.asynchronized.yxc.tuner;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author enrico
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DAB {
    private Integer preset;
    private Integer id;
    private String status;
    private Integer freq;
    private String category;
    @JsonProperty("audio_mode")
    private String audioMode;
    @JsonProperty("bit_rate")
    private Integer bitRate;
    private Integer quality;
    @JsonProperty("tune_aid")
    private Integer tuneAid;
    @JsonProperty("off_air")
    private Boolean offAir;
    @JsonProperty("dab_plus")
    private Boolean dabPlus;
    @JsonProperty("program_type")
    private String programType;
    @JsonProperty("ch_label")
    private String chLabel;
    @JsonProperty("service_label")
    private String serviceLabel;
    private String dls;
    @JsonProperty("ensemble_label")
    private String ensembleLabel;
    @JsonProperty("initial_scan_progress")
    private Integer initialScanProgress;
    @JsonProperty("total_station_num")
    private Integer totalStationNum;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Integer getPreset() {
        return preset;
    }

    public void setPreset(Integer preset) {
        this.preset = preset;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getFreq() {
        return freq;
    }

    public void setFreq(Integer freq) {
        this.freq = freq;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getAudioMode() {
        return audioMode;
    }

    public void setAudioMode(String audioMode) {
        this.audioMode = audioMode;
    }

    public Integer getBitRate() {
        return bitRate;
    }

    public void setBitRate(Integer bitRate) {
        this.bitRate = bitRate;
    }

    public Integer getQuality() {
        return quality;
    }

    public void setQuality(Integer quality) {
        this.quality = quality;
    }

    public Integer getTuneAid() {
        return tuneAid;
    }

    public void setTuneAid(Integer tuneAid) {
        this.tuneAid = tuneAid;
    }

    public Boolean getOffAir() {
        return offAir;
    }

    public void setOffAir(Boolean offAir) {
        this.offAir = offAir;
    }

    public Boolean getDabPlus() {
        return dabPlus;
    }

    public void setDabPlus(Boolean dabPlus) {
        this.dabPlus = dabPlus;
    }

    public String getProgramType() {
        return programType;
    }

    public void setProgramType(String programType) {
        this.programType = programType;
    }

    public String getChLabel() {
        return chLabel;
    }

    public void setChLabel(String chLabel) {
        this.chLabel = chLabel;
    }

    public String getServiceLabel() {
        return serviceLabel;
    }

    public void setServiceLabel(String serviceLabel) {
        this.serviceLabel = serviceLabel;
    }

    public String getDls() {
        return dls;
    }

    public void setDls(String dls) {
        this.dls = dls;
    }

    public String getEnsembleLabel() {
        return ensembleLabel;
    }

    public void setEnsembleLabel(String ensembleLabel) {
        this.ensembleLabel = ensembleLabel;
    }

    public Integer getInitialScanProgress() {
        return initialScanProgress;
    }

    public void setInitialScanProgress(Integer initialScanProgress) {
        this.initialScanProgress = initialScanProgress;
    }

    public Integer getTotalStationNum() {
        return totalStationNum;
    }

    public void setTotalStationNum(Integer totalStationNum) {
        this.totalStationNum = totalStationNum;
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
        return "DAB{" + "preset=" + preset + ", id=" + id + ", status=" + status + ", freq=" + freq + ", category=" + category + ", audioMode=" + audioMode + ", bitRate=" + bitRate + ", quality=" + quality + ", tuneAid=" + tuneAid + ", offAir=" + offAir + ", dabPlus=" + dabPlus + ", programType=" + programType + ", chLabel=" + chLabel + ", serviceLabel=" + serviceLabel + ", dls=" + dls + ", ensembleLabel=" + ensembleLabel + ", initialScanProgress=" + initialScanProgress + ", totalStationNum=" + totalStationNum + ", additionalProperties=" + additionalProperties + '}';
    }
}
