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
public class NetworkUsbPresetInfoEntry {
    private String input;
    private String text;
    private Integer attribute;  // attribute not content in API doc

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Integer getAttribute() {
        return attribute;
    }

    public void setAttribute(Integer attribute) {
        this.attribute = attribute;
    }

    @Override
    public String toString() {
        return "NetworkUsbPresetInfoEntry{" + "input=" + input + ", text=" + text + ", attribute=" + attribute + '}';
    }
    
}
