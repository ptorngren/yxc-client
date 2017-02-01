/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.asynchronized.yxc.networkusb;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import net.asynchronized.yxc.Response;

/**
 *
 * @author enrico
 */
public class ListInfo extends Response {
    public static final String PATH = ROOT_PATH + "/netusb/getListInfo?input=";
    
    private String input;
    @JsonProperty("menu_layer")
    private Integer menuLayer;
    @JsonProperty("max_line")
    private Integer maxLine;
    private Integer index;
    @JsonProperty("playing_index")
    private Integer playingIndex;
    @JsonProperty("menu_name")
    private String menuName;
    @JsonProperty("list_info")
    private List<ListInfoEntry> listInfoEntries;

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    public Integer getMenuLayer() {
        return menuLayer;
    }

    public void setMenuLayer(Integer menuLayer) {
        this.menuLayer = menuLayer;
    }

    public Integer getMaxLine() {
        return maxLine;
    }

    public void setMaxLine(Integer maxLine) {
        this.maxLine = maxLine;
    }

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    public Integer getPlayingIndex() {
        return playingIndex;
    }

    public void setPlayingIndex(Integer playingIndex) {
        this.playingIndex = playingIndex;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public List<ListInfoEntry> getListInfoEntries() {
        return listInfoEntries;
    }

    public void setListInfoEntries(List<ListInfoEntry> listInfoEntries) {
        this.listInfoEntries = listInfoEntries;
    }

    @Override
    public String toString() {
        return "ListInfo{" + "responseCode=" + getResponseCode() + ", input=" + input + ", menuLayer=" + menuLayer + ", maxLine=" + maxLine + ", index=" + index + ", playingIndex=" + playingIndex + ", menuName=" + menuName + ", listInfoEntries=" + listInfoEntries + '}';
    }
    
}
