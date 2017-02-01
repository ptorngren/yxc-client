/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.asynchronized.yxc.zone;

import com.fasterxml.jackson.annotation.JsonProperty;
import net.asynchronized.yxc.Response;

/**
 *
 * @author enrico
 */
public class Status extends Response {
//    public static final String PATH = ROOT_PATH + "/main/getStatus";
    public static final String METHOD = "/getStatus";
    
    private String power;
    private Integer sleep;
    private Integer volume;
    private Boolean mute;
    @JsonProperty("max_volume")
    private Integer maxVolume;
    private String input;
    @JsonProperty("distribution_enable")
    private Boolean distributionEnable;
    @JsonProperty("sound_program")
    private String soundProgram;
    private Boolean direct;
    @JsonProperty("pure_direct")
    private Boolean pureDirect;
    private Boolean enhancer;
    @JsonProperty("tone_control")
    private ToneControl toneControl;
    private Equalizer equalizer;
    private Integer balance;
    @JsonProperty("dialogue_level")
    private Integer dialogueLevel;
    @JsonProperty("dialogue_lift")
    private Integer dialogueLift;
    @JsonProperty("clear_voice")
    private Boolean clearVoice;
    @JsonProperty("subwoofer_volume")
    private Integer subwooferVolume;
    @JsonProperty("bass_extensions")
    private Boolean bassExtension;
    @JsonProperty("link_control")
    private String linkControl;
    @JsonProperty("link_audio_delay")
    private String linkAudioDelay;
    @JsonProperty("disable_flags")
    private Integer disableFlags;

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public Integer getSleep() {
        return sleep;
    }

    public void setSleep(Integer sleep) {
        this.sleep = sleep;
    }

    public Integer getVolume() {
        return volume;
    }

    public void setVolume(Integer volume) {
        this.volume = volume;
    }

    public Boolean getMute() {
        return mute;
    }

    public void setMute(Boolean mute) {
        this.mute = mute;
    }

    public Integer getMaxVolume() {
        return maxVolume;
    }

    public void setMaxVolume(Integer maxVolume) {
        this.maxVolume = maxVolume;
    }

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    public Boolean getDistributionEnable() {
        return distributionEnable;
    }

    public void setDistributionEnable(Boolean distributionEnable) {
        this.distributionEnable = distributionEnable;
    }

    public String getSoundProgram() {
        return soundProgram;
    }

    public void setSoundProgram(String soundProgram) {
        this.soundProgram = soundProgram;
    }

    public Boolean getDirect() {
        return direct;
    }

    public void setDirect(Boolean direct) {
        this.direct = direct;
    }

    public Boolean getPureDirect() {
        return pureDirect;
    }

    public void setPureDirect(Boolean pureDirect) {
        this.pureDirect = pureDirect;
    }

    public Boolean getEnhancer() {
        return enhancer;
    }

    public void setEnhancer(Boolean enhancer) {
        this.enhancer = enhancer;
    }

    public ToneControl getToneControl() {
        return toneControl;
    }

    public void setToneControl(ToneControl toneControl) {
        this.toneControl = toneControl;
    }

    public Equalizer getEqualizer() {
        return equalizer;
    }

    public void setEqualizer(Equalizer equalizer) {
        this.equalizer = equalizer;
    }

    public Integer getBalance() {
        return balance;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }

    public Integer getDialogueLevel() {
        return dialogueLevel;
    }

    public void setDialogueLevel(Integer dialogueLevel) {
        this.dialogueLevel = dialogueLevel;
    }

    public Integer getDialogueLift() {
        return dialogueLift;
    }

    public void setDialogueLift(Integer dialogueLift) {
        this.dialogueLift = dialogueLift;
    }

    public Boolean getClearVoice() {
        return clearVoice;
    }

    public void setClearVoice(Boolean clearVoice) {
        this.clearVoice = clearVoice;
    }

    public Integer getSubwooferVolume() {
        return subwooferVolume;
    }

    public void setSubwooferVolume(Integer subwooferVolume) {
        this.subwooferVolume = subwooferVolume;
    }

    public Boolean getBassExtension() {
        return bassExtension;
    }

    public void setBassExtension(Boolean bassExtension) {
        this.bassExtension = bassExtension;
    }

    public String getLinkControl() {
        return linkControl;
    }

    public void setLinkControl(String linkControl) {
        this.linkControl = linkControl;
    }

    public String getLinkAudioDelay() {
        return linkAudioDelay;
    }

    public void setLinkAudioDelay(String linkAudioDelay) {
        this.linkAudioDelay = linkAudioDelay;
    }

    public Integer getDisableFlags() {
        return disableFlags;
    }

    public void setDisableFlags(Integer disableFlags) {
        this.disableFlags = disableFlags;
    }

    @Override
    public String toString() {
        return "Status{" + "responseCode=" + getResponseCode() + ", power=" + power + ", sleep=" + sleep + ", volume=" + volume + ", mute=" + mute + ", maxVolume=" + maxVolume + ", input=" + input + ", distributionEnable=" + distributionEnable + ", soundProgram=" + soundProgram + ", direct=" + direct + ", pureDirect=" + pureDirect + ", enhancer=" + enhancer + ", toneControl=" + toneControl + ", equalizer=" + equalizer + ", balance=" + balance + ", dialogueLevel=" + dialogueLevel + ", dialogueLift=" + dialogueLift + ", clearVoice=" + clearVoice + ", subwooferVolume=" + subwooferVolume + ", bassExtension=" + bassExtension + ", linkControl=" + linkControl + ", linkAudioDelay=" + linkAudioDelay + ", disableFlags=" + disableFlags + '}';
    }

}
