/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.asynchronized.yxc.networkusb;

/**
 *
 * @author enrico
 */
public class ListInfoEntry {
    private String text;
    private String thumbnail;
    private Integer attribute;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public Integer getAttribute() {
        return attribute;
    }

    public void setAttribute(Integer attribute) {
        this.attribute = attribute;
    }

    @Override
    public String toString() {
        return "ListInfoEntry{" + "text=" + text + ", thumbnail=" + thumbnail + ", attribute=" + attribute + '}';
    }
    
}
