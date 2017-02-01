/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.asynchronized.yxc.tuner;

/**
 *
 * @author enrico
 */
public class AM {
    private Integer preset;
    private Integer freq;
    private Boolean tuned;

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

    @Override
    public String toString() {
        return "AM{" + "preset=" + preset + ", freq=" + freq + ", tuned=" + tuned + '}';
    }
    
}
