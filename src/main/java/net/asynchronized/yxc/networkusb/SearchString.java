/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.asynchronized.yxc.networkusb;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * @author enrico
 */
@JsonInclude(Include.NON_NULL)
public class SearchString {
    public static final String PATH = "/YamahaExtendedControl/v1/netusb/setSearchString";
    
    @JsonProperty("list_id")
    private String listId;
    private String string;
    private Integer index;

    public String getListId() {
        return listId;
    }

    public void setListId(String listId) {
        this.listId = listId;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    @Override
    public String toString() {
        return "SearchString{" + "listId=" + listId + ", string=" + string + ", index=" + index + '}';
    }
    
}
