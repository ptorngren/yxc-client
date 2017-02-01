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
public class ServiceInfo extends Response {
    public static final String PATH = ROOT_PATH + "/netusb/getServiceInfo?input=";
    
    @JsonProperty("account_list")
    private List<AccountListEntry> accountList;
    private String url;
    private String code;
    private Integer index;

    public List<AccountListEntry> getAccountList() {
        return accountList;
    }

    public void setAccountList(List<AccountListEntry> accountList) {
        this.accountList = accountList;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    @Override
    public String toString() {
        return "ServiceInfo{" + "responseCode=" + getResponseCode() + ", accountList=" + accountList + ", url=" + url + ", code=" + code + ", index=" + index + '}';
    }
    
}
