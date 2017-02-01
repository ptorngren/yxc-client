/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.asynchronized.yxc.system;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * @author enrico
 */
public class Input {
    private String id;
    @JsonProperty("distribution_enable")
    private Boolean distributionEnable;
    @JsonProperty("rename_enable")
    private Boolean renameEnable;
    @JsonProperty("account_enable")
    private Boolean accountEnable;
    @JsonProperty("play_info_type")
    private String playInfoType;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Boolean getDistributionEnable() {
        return distributionEnable;
    }

    public void setDistributionEnable(Boolean distributionEnable) {
        this.distributionEnable = distributionEnable;
    }

    public Boolean getRenameEnable() {
        return renameEnable;
    }

    public void setRenameEnable(Boolean renameEnable) {
        this.renameEnable = renameEnable;
    }

    public Boolean getAccountEnable() {
        return accountEnable;
    }

    public void setAccountEnable(Boolean accountEnable) {
        this.accountEnable = accountEnable;
    }

    public String getPlayInfoType() {
        return playInfoType;
    }

    public void setPlayInfoType(String playInfoType) {
        this.playInfoType = playInfoType;
    }

    @Override
    public String toString() {
        return "Input{" + "id=" + id + ", distributionEnable=" + distributionEnable + ", renameEnable=" + renameEnable + ", accountEnable=" + accountEnable + ", playInfoType=" + playInfoType + '}';
    }
    
}
