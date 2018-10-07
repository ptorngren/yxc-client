/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.asynchronized.yxc.system;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.HashMap;
import java.util.Map;
import net.asynchronized.yxc.Response;

/**
 *
 * @author enrico
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class NetworkStatus extends Response {
    public static final String PATH = ROOT_PATH + "/system/getNetworkStatus";
    
    @JsonProperty("network_name")
    private String networkName;
    private String connection;
    private Boolean dhcp;
    @JsonProperty("ip_address")
    private String ip;
    @JsonProperty("subnet_mask")
    private String subnetMask;
    @JsonProperty("default_gateway")
    private String defaultGateway;
    @JsonProperty("dns_server_1")
    private String dnsServer1;
    @JsonProperty("dns_server_2")
    private String dnsServer2;
    @JsonProperty("wireless_lan")
    private WirelessLan wirelessLan;
    @JsonProperty("wireless_direct")
    private WirelessDirect wirelessDirect;
    @JsonProperty("musiccast_network")
    private MusiccastNetwork musiccastNetwork;
    @JsonProperty("mac_address")
    private MacAddress macAddress;
    @JsonProperty("vtuner_id")
    private String vtunerId;
    @JsonProperty("airplay_pin")
    private String airplayPin;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public String getNetworkName() {
        return networkName;
    }

    public void setNetworkName(String networkName) {
        this.networkName = networkName;
    }

    public String getConnection() {
        return connection;
    }

    public void setConnection(String connection) {
        this.connection = connection;
    }

    public Boolean getDhcp() {
        return dhcp;
    }

    public void setDhcp(Boolean dhcp) {
        this.dhcp = dhcp;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getSubnetMask() {
        return subnetMask;
    }

    public void setSubnetMask(String subnetMask) {
        this.subnetMask = subnetMask;
    }

    public String getDefaultGateway() {
        return defaultGateway;
    }

    public void setDefaultGateway(String defaultGateway) {
        this.defaultGateway = defaultGateway;
    }

    public String getDnsServer1() {
        return dnsServer1;
    }

    public void setDnsServer1(String dnsServer1) {
        this.dnsServer1 = dnsServer1;
    }

    public String getDnsServer2() {
        return dnsServer2;
    }

    public void setDnsServer2(String dnsServer2) {
        this.dnsServer2 = dnsServer2;
    }

    public WirelessLan getWirelessLan() {
        return wirelessLan;
    }

    public void setWirelessLan(WirelessLan wirelessLan) {
        this.wirelessLan = wirelessLan;
    }

    public WirelessDirect getWirelessDirect() {
        return wirelessDirect;
    }

    public void setWirelessDirect(WirelessDirect wirelessDirect) {
        this.wirelessDirect = wirelessDirect;
    }

    public MusiccastNetwork getMusiccastNetwork() {
        return musiccastNetwork;
    }

    public void setMusiccastNetwork(MusiccastNetwork musiccastNetwork) {
        this.musiccastNetwork = musiccastNetwork;
    }

    public MacAddress getMacAddress() {
        return macAddress;
    }

    public void setMacAddress(MacAddress macAddress) {
        this.macAddress = macAddress;
    }

    public String getVtunerId() {
        return vtunerId;
    }

    public void setVtunerId(String vtunerId) {
        this.vtunerId = vtunerId;
    }

    public String getAirplayPin() {
        return airplayPin;
    }

    public void setAirplayPin(String airplayPin) {
        this.airplayPin = airplayPin;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
    }

    @Override
    public String toString() {
        return "NetworkStatus{" + "networkName=" + networkName + ", connection=" + connection + ", dhcp=" + dhcp + ", ip=" + ip + ", subnetMask=" + subnetMask + ", defaultGateway=" + defaultGateway + ", dnsServer1=" + dnsServer1 + ", dnsServer2=" + dnsServer2 + ", wirelessLan=" + wirelessLan + ", wirelessDirect=" + wirelessDirect + ", musiccastNetwork=" + musiccastNetwork + ", macAddress=" + macAddress + ", vtunerId=" + vtunerId + ", airplayPin=" + airplayPin + ", additionalProperties=" + additionalProperties + '}';
    }
}
