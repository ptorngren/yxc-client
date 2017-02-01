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
public class NetUsb {
    @JsonProperty("func_list")
    private List<String> functionList;
    private Preset preset;
    @JsonProperty("recent_info")
    private RecentInfo recentInfo;
    @JsonProperty("play_queue")     // play_queue not content of API doc
    private PlayQueue playQueue;
    @JsonProperty("mc_playlist")    // mc_playlist not content of API doc
    private McPlaylist mcPlaylist;
    @JsonProperty("vtuner_fver")
    private String vtunerFver;

    public List<String> getFunctionList() {
        return functionList;
    }

    public void setFunctionList(List<String> functionList) {
        this.functionList = functionList;
    }

    public Preset getPreset() {
        return preset;
    }

    public void setPreset(Preset preset) {
        this.preset = preset;
    }

    public RecentInfo getRecentInfo() {
        return recentInfo;
    }

    public void setRecentInfo(RecentInfo recentInfo) {
        this.recentInfo = recentInfo;
    }

    public PlayQueue getPlayQueue() {
        return playQueue;
    }

    public void setPlayQueue(PlayQueue playQueue) {
        this.playQueue = playQueue;
    }

    public McPlaylist getMcPlaylist() {
        return mcPlaylist;
    }

    public void setMcPlaylist(McPlaylist mcPlaylist) {
        this.mcPlaylist = mcPlaylist;
    }

    public String getVtunerFver() {
        return vtunerFver;
    }

    public void setVtunerFver(String vtunerFver) {
        this.vtunerFver = vtunerFver;
    }

    @Override
    public String toString() {
        return "NetUsb{" + "functionList=" + functionList + ", preset=" + preset + ", recentInfo=" + recentInfo + ", playQueue=" + playQueue + ", mcPlaylist=" + mcPlaylist + ", vtunerFver=" + vtunerFver + '}';
    }
    

}
