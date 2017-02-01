/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.asynchronized.yxc.system;

import com.fasterxml.jackson.annotation.JsonProperty;
import net.asynchronized.yxc.Response;

/**
 *
 * @author enrico
 */
public class DeviceInfo extends Response {
    public static final String PATH = ROOT_PATH + "/system/getDeviceInfo";
    
    @JsonProperty("model_name")
    private String modelName;
    private String destination;
    @JsonProperty("device_id")
    private String deviceId;
    @JsonProperty("system_id")  // system_id not content of API doc
    private String systemId;
    @JsonProperty("system_version")
    private Float systemVersion;
    @JsonProperty("api_version")
    private Float apiVersion;
    @JsonProperty("netmodule_version")
    private String netModuleVersion;
    @JsonProperty("netmodule_checksum")
    private String netModuleChecksum;
    @JsonProperty("operation_mode")
    private String operationMode;
    @JsonProperty("update_error_code")
    private String updateErrorCode;
    @JsonProperty("update_progress")
    private Object updateProgress;

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getSystemId() {
        return systemId;
    }

    public void setSystemId(String systemId) {
        this.systemId = systemId;
    }

    public Float getSystemVersion() {
        return systemVersion;
    }

    public void setSystemVersion(Float systemVersion) {
        this.systemVersion = systemVersion;
    }

    public Float getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(Float apiVersion) {
        this.apiVersion = apiVersion;
    }

    public String getNetModuleVersion() {
        return netModuleVersion;
    }

    public void setNetModuleVersion(String netModuleVersion) {
        this.netModuleVersion = netModuleVersion;
    }

    public String getNetModuleChecksum() {
        return netModuleChecksum;
    }

    public void setNetModuleChecksum(String netModuleChecksum) {
        this.netModuleChecksum = netModuleChecksum;
    }

    public String getOperationMode() {
        return operationMode;
    }

    public void setOperationMode(String operationMode) {
        this.operationMode = operationMode;
    }

    public String getUpdateErrorCode() {
        return updateErrorCode;
    }

    public void setUpdateErrorCode(String updateErrorCode) {
        this.updateErrorCode = updateErrorCode;
    }

    public Object getUpdateProgress() {
        return updateProgress;
    }

    public void setUpdateProgress(Object updateProgress) {
        this.updateProgress = updateProgress;
    }

    @Override
    public String toString() {
        return "DeviceInfo{" + "responseCode=" + getResponseCode() + ", modelName=" + modelName + ", destination=" + destination + ", deviceId=" + deviceId + ", systemId=" + systemId + ", systemVersion=" + systemVersion + ", apiVersion=" + apiVersion + ", netModuleVersion=" + netModuleVersion + ", netModuleChecksum=" + netModuleChecksum + ", operationMode=" + operationMode + ", updateErrorCode=" + updateErrorCode + ", updateProgress=" + updateProgress + '}';
    }

}
