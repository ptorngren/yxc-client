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
public class AccountListEntry {
    private Integer index;
    private String username;
    private Boolean selected;

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Boolean getSelected() {
        return selected;
    }

    public void setSelected(Boolean selected) {
        this.selected = selected;
    }

    @Override
    public String toString() {
        return "AccountListEntry{" + "index=" + index + ", username=" + username + ", selected=" + selected + '}';
    }
    
}
