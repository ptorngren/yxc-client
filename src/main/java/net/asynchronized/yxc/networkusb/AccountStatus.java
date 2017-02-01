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
public class AccountStatus extends Response {
    public static final String PATH = ROOT_PATH + "/netusb/getAccountStatus";
    
    @JsonProperty("service_list")
    private List<ServiceListEntry> serviceList;

    public List<ServiceListEntry> getServiceList() {
        return serviceList;
    }

    public void setServiceList(List<ServiceListEntry> serviceList) {
        this.serviceList = serviceList;
    }

    @Override
    public String toString() {
        return "AccountStatus{" + "responseCode=" + getResponseCode() + ", serviceList=" + serviceList + '}';
    }
    
}
