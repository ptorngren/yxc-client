/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.asynchronized.yxc.zone;

/**
 *
 * @author enrico
 */
public class ToneControl {
    private String mode;
    private Integer bass;
    private Integer treble;

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public Integer getBass() {
        return bass;
    }

    public void setBass(Integer bass) {
        this.bass = bass;
    }

    public Integer getTreble() {
        return treble;
    }

    public void setTreble(Integer treble) {
        this.treble = treble;
    }

    @Override
    public String toString() {
        return "ToneControl{" + "mode=" + mode + ", bass=" + bass + ", treble=" + treble + '}';
    }
}
