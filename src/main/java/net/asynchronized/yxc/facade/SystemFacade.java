/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.asynchronized.yxc.facade;

import java.io.IOException;
import net.asynchronized.yxc.Response;
import net.asynchronized.yxc.system.DeviceInfo;
import net.asynchronized.yxc.system.FeatureInfo;
import net.asynchronized.yxc.system.FuncStatus;
import net.asynchronized.yxc.system.LocationInfo;
import net.asynchronized.yxc.system.NetworkStatus;

/**
 *
 * @author enrico
 */
public class SystemFacade extends AbstractFacade {

    /**
     * 
     * @param host IP address of the target device
     */
    public SystemFacade(String host) {
        super(host);
    }

    /**
     * For retrieving basic information of a Device
     *
     * @return DeviceInfo
     * @throws IOException
     */
    public DeviceInfo getDeviceInfo() throws IOException {
        DeviceInfo info = call(DeviceInfo.PATH, DeviceInfo.class);
        return info;
    }

    /**
     * For retrieving feature information equipped with a Device
     *
     * @return FeatureInfo
     * @throws IOException
     */
    public FeatureInfo getFeatures() throws IOException {
        FeatureInfo info = call(FeatureInfo.PATH, FeatureInfo.class);
        return info;
    }

    /**
     * For retrieving network related setup / information
     *
     * @return NetworkStatus
     * @throws IOException
     */
    public NetworkStatus getNetworkStatus() throws IOException {
        NetworkStatus status = call(NetworkStatus.PATH, NetworkStatus.class);
        return status;
    }

    /**
     * For retrieving setup/information of overall system function. Parameters
     * are readable only when corresponding functions are available in
     * “func_list” of /system/getFeatures
     *
     * @return FuncStatus
     * @throws IOException
     */
    public FuncStatus getFuncStatus() throws IOException {
        FuncStatus status = call(FuncStatus.PATH, FuncStatus.class);
        return status;
    }

    /**
     * For retrieving Location information
     *
     * @return LocationInfo
     * @throws IOException
     */
    public LocationInfo getLocationInfo() throws IOException {
        LocationInfo info = call(LocationInfo.PATH, LocationInfo.class);
        return info;
    }

    /**
     * For setting Auto Power Standby status. Actual operations/reactions of
     * enabling Auto Power Standby depend on each Device
     *
     * @param enable Auto Power Standby status
     * @return Response code
     * @throws IOException
     */
    public Response setAutoPowerStandby(Boolean enable) throws IOException {
        Response response = call(Response.SYSTEM_SET_AUTO_POWER_STANDBY_PATH + enable, Response.class);
        return response;
    }

    /**
     * For sending specific remote IR code. A Device is operated same as remote
     * IR code reception. But continuous IR code cannot be used in this command.
     * Refer to each Device’s IR code list for details
     *
     * @param code IR code in 8-digit hex
     * @return Response code
     * @throws IOException
     */
    public Response sendIrCode(String code) throws IOException {
        Response response = call(Response.SYSTEM_SEND_IR_CODE_PATH + code, Response.class);
        return response;
    }
}
