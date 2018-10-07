/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.asynchronized.yxc.networkusb;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.HashMap;
import java.util.Map;
import net.asynchronized.yxc.Response;

/**
 *
 * @author enrico
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class NetworkUsbPlayInfo extends Response {
    public static final String PATH = ROOT_PATH + "/netusb/getPlayInfo";
    
    private String input;
    @JsonProperty("play_queue_type")
    private String playQueueType;
    private String playback;
    private String repeat;
    private String shuffle;
    @JsonProperty("play_time")
    private Integer playTime;
    @JsonProperty("total_time")
    private Integer totalTime;
    private String artist;
    private String album;
    private String track;
    @JsonProperty("albumart_url")
    private String albumArtUrl;
    @JsonProperty("albumart_id")
    private Integer albumArtId;
    @JsonProperty("usb_devicetype")
    private String usbDeviceType;
    @JsonProperty("auto_stopped")
    private Boolean autoStopped;
    private Integer attribute;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    public String getPlayQueueType() {
        return playQueueType;
    }

    public void setPlayQueueType(String playQueueType) {
        this.playQueueType = playQueueType;
    }

    public String getPlayback() {
        return playback;
    }

    public void setPlayback(String playback) {
        this.playback = playback;
    }

    public String getRepeat() {
        return repeat;
    }

    public void setRepeat(String repeat) {
        this.repeat = repeat;
    }

    public String getShuffle() {
        return shuffle;
    }

    public void setShuffle(String shuffle) {
        this.shuffle = shuffle;
    }

    public Integer getPlayTime() {
        return playTime;
    }

    public void setPlayTime(Integer playTime) {
        this.playTime = playTime;
    }

    public Integer getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(Integer totalTime) {
        this.totalTime = totalTime;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getTrack() {
        return track;
    }

    public void setTrack(String track) {
        this.track = track;
    }

    public String getAlbumArtUrl() {
        return albumArtUrl;
    }

    public void setAlbumArtUrl(String albumArtUrl) {
        this.albumArtUrl = albumArtUrl;
    }

    public Integer getAlbumArtId() {
        return albumArtId;
    }

    public void setAlbumArtId(Integer albumArtId) {
        this.albumArtId = albumArtId;
    }

    public String getUsbDeviceType() {
        return usbDeviceType;
    }

    public void setUsbDeviceType(String usbDeviceType) {
        this.usbDeviceType = usbDeviceType;
    }

    public Boolean getAutoStopped() {
        return autoStopped;
    }

    public void setAutoStopped(Boolean autoStopped) {
        this.autoStopped = autoStopped;
    }

    public Integer getAttribute() {
        return attribute;
    }

    public void setAttribute(Integer attribute) {
        this.attribute = attribute;
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
        return "NetworkUsbPlayInfo{" + "input=" + input + ", playQueueType=" + playQueueType + ", playback=" + playback + ", repeat=" + repeat + ", shuffle=" + shuffle + ", playTime=" + playTime + ", totalTime=" + totalTime + ", artist=" + artist + ", album=" + album + ", track=" + track + ", albumArtUrl=" + albumArtUrl + ", albumArtId=" + albumArtId + ", usbDeviceType=" + usbDeviceType + ", autoStopped=" + autoStopped + ", attribute=" + attribute + ", additionalProperties=" + additionalProperties + '}';
    }
    
}
