/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.asynchronized.yxc.cd;

import com.fasterxml.jackson.annotation.JsonProperty;
import net.asynchronized.yxc.Response;

/**
 *
 * @author enrico
 */
public class CdPlayInfo extends Response {
    public static final String PATH = ROOT_PATH + "/cd/getPlayInfo";
    
    @JsonProperty("device_status")
    private String deviceStatus;
    private String playback;
    private String repeat;
    private String shuffle;
    @JsonProperty("play_time")
    private Integer playTime;
    @JsonProperty("total_time")
    private Integer totalTime;
    @JsonProperty("disc_time")
    private Integer discTime;
    @JsonProperty("track_number")
    private Integer trackNumber;
    @JsonProperty("total_tracks")
    private Integer totalTracks;
    private String artist;
    private String album;
    private String track;

    public String getDeviceStatus() {
        return deviceStatus;
    }

    public void setDeviceStatus(String deviceStatus) {
        this.deviceStatus = deviceStatus;
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

    public Integer getDiscTime() {
        return discTime;
    }

    public void setDiscTime(Integer discTime) {
        this.discTime = discTime;
    }

    public Integer getTrackNumber() {
        return trackNumber;
    }

    public void setTrackNumber(Integer trackNumber) {
        this.trackNumber = trackNumber;
    }

    public Integer getTotalTracks() {
        return totalTracks;
    }

    public void setTotalTracks(Integer totalTracks) {
        this.totalTracks = totalTracks;
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

    @Override
    public String toString() {
        return "CdPlayInfo{" + "responseCode=" + getResponseCode() + ", deviceStatus=" + deviceStatus + ", playback=" + playback + ", repeat=" + repeat + ", shuffle=" + shuffle + ", playTime=" + playTime + ", totalTime=" + totalTime + ", discTime=" + discTime + ", trackNumber=" + trackNumber + ", totalTracks=" + totalTracks + ", artist=" + artist + ", album=" + album + ", track=" + track + '}';
    }
    
}
