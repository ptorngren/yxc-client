/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.asynchronized.yxc.tuner;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * @author enrico
 */
public class FM {
    private Integer preset;
    private Integer freq;
    private Boolean tuned;
    @JsonProperty("audio_mode")
    private String audioMode;

    public Integer getPreset() {
        return preset;
    }

    public void setPreset(Integer preset) {
        this.preset = preset;
    }

    public Integer getFreq() {
        return freq;
    }

    public void setFreq(Integer freq) {
        this.freq = freq;
    }

    public Boolean getTuned() {
        return tuned;
    }

    public void setTuned(Boolean tuned) {
        this.tuned = tuned;
    }

    public String getAudioMode() {
        return audioMode;
    }

    public void setAudioMode(String audioMode) {
        this.audioMode = audioMode;
    }

    @Override
    public String toString() {
        return "FM{" + "preset=" + preset + ", freq=" + freq + ", tuned=" + tuned + ", audioMode=" + audioMode + '}';
    }
    
}
