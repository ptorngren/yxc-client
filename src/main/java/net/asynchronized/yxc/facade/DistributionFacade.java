/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.asynchronized.yxc.facade;

import java.io.IOException;
import net.asynchronized.yxc.Response;
import net.asynchronized.yxc.dist.ClientInfo;
import net.asynchronized.yxc.dist.DistributionInfo;
import net.asynchronized.yxc.dist.GroupName;
import net.asynchronized.yxc.dist.ServerInfo;

/**
 *
 * @author enrico
 */
public class DistributionFacade extends AbstractFacade {
    
    public DistributionFacade(String host) {
        super(host);
    }
    
    /**
     * For retrieving a Device information related to Link distribution
     * 
     * @return DistributionInfo
     * @throws IOException 
     */
    public DistributionInfo getDistributionInfo() throws IOException {
        DistributionInfo info = call(DistributionInfo.PATH, DistributionInfo.class);
        return info;
    }
    
    /**
     * For setting a Link distribution server (Link master)
     * 
     * @param info
     * @return Response code
     * @throws IOException 
     */
    public Response setServerInfo(ServerInfo info) throws IOException {
        Response response = post(ServerInfo.PATH, info);
        return response;
    }
    
    /**
     * For setting Link distributed clients. If a Device is already setup as Link distribution server, this
     * client setup is denied by that Device: use this API after canceling a Device’s Link distribution
     * server setup using setServerInfo, then confirming that the target Device’s role is changed to other
     * values than “server” using getDistributionInfo.
     * 
     * @param info
     * @return
     * @throws IOException 
     */
    public Response setClientInfo(ClientInfo info) throws IOException {
        Response response = post(ClientInfo.PATH, info);
        return response;
    }
    
    /**
     * For initiating Link distribution. This is valid to a Device that is setup as Link distribution server.
     * 
     * @param id Specifies Link distribution number on current MusicCast Network
     * @return Response code
     * @throws IOException 
     */
    public Response startDistribution(Integer id) throws IOException {
        Response response = call(Response.DIST_START_DISTRIBUTION_PATH + id, Response.class);
        return response;
    }
    
    /**
     * For quitting Link distribution. This is valid to a Device that is setup as Link distribution server.
     * 
     * @return Response code
     * @throws IOException 
     */
    public Response stopDistribution() throws IOException {
        Response response = call(Response.DIST_STOP_DISTRIBUTION_PATH, Response.class);
        return response;
    }
    
    /**
     * For setting up Group Name. Note that Group Name is reserved in volatile memory
     * 
     * @param name
     * @return Response code
     * @throws IOException 
     */
    public Response setGroupName(GroupName name) throws IOException {
        Response response = post(GroupName.PATH, name);
        return response;
    }
}
