/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.asynchronized.yxc.facade;

import java.io.IOException;
import net.asynchronized.yxc.Response;
import net.asynchronized.yxc.zone.SoundProgramList;
import net.asynchronized.yxc.zone.Status;

/**
 *
 * @author enrico
 */
public class ZoneFacade extends AbstractFacade {

    private String zone;
    private String path;

    /**
     *
     * @param host IP address of the target device
     * @param zone Target zone ("main", "zone2", "zone3", "zone4")
     */
    public ZoneFacade(String host, String zone) {
        super(host);
        this.zone = zone;
        this.path = Response.ROOT_PATH + "/" + zone;
    }

    /**
     * For retrieving basic information of each Zone like power, volume, input
     * and so on
     *
     * @return Status
     * @throws IOException
     */
    public Status getStatus() throws IOException {
        Status status = call(path + Status.METHOD, Status.class);
        return status;
    }

    /**
     * For retrieving a list of Sound Program available in each Zone. It is
     * possible for the list contents to be dynamically changed
     *
     * @return SoundProgramList
     * @throws IOException
     */
    public SoundProgramList getSoundProgramList() throws IOException {
        SoundProgramList list = call(path + SoundProgramList.METHOD, SoundProgramList.class);
        return list;
    }

    /**
     * For setting power status of each Zone
     *
     * @param power power status ("on", "standby", "toggle")
     * @return Response code
     * @throws IOException
     */
    public Response setPower(String power) throws IOException {
        Response response = call(path + Response.ZONE_SET_POWER_METHOD + power, Response.class);
        return response;
    }

    /**
     * For setting Sleep Timer for each Zone With Zone B enabled Devices, target
     * Zone is described as Master Power, but Main Zone is used to set it up via
     * YXC
     *
     * @param sleep Sleep time unit in minutes (0, 30, 60, 90, 120)
     * @return Response code
     * @throws IOException
     */
    public Response setSleep(Integer sleep) throws IOException {
        Response response = call(path + Response.ZONE_SET_SLEEP_METHOD + sleep, Response.class);
        return response;
    }

    /**
     * For setting volume in each Zone. Values of specifying range and steps are
     * different. There are some Devices that cannot allow this value to be go
     * up to Device’s maximum volume.
     *
     * @param volume volume value
     * @return Response code
     * @throws IOException
     */
    public Response setVolume(Integer volume) throws IOException {
        Response response = call(path + Response.ZONE_SET_VOLUME_METHOD + volume, Response.class);
        return response;
    }

    /**
     * For setting mute status in each Zone
     *
     * @param enable mute status
     * @return Response code
     * @throws IOException
     */
    public Response setMute(Boolean enable) throws IOException {
        Response response = call(path + Response.ZONE_SET_MUTE_METHOD + enable, Response.class);
        return response;
    }

    /**
     * For selecting each Zone input
     *
     * @param input Input IDs gotten via /system/getFeatures
     * @return Response code
     * @throws IOException
     */
    public Response setInput(String input) throws IOException {
        Response response = call(path + Response.ZONE_SET_INPUT_METHOD + input, Response.class);
        return response;
    }

    /**
     * For selecting Sound Programs
     *
     * @param program Sound Program IDs gotten via /system/getFeatures
     * @return Response code
     * @throws IOException
     */
    public Response setSoundProgram(String program) throws IOException {
        Response response = call(path + Response.ZONE_SET_SOUND_PROGRAM_METHOD + program, Response.class);
        return response;
    }

    /**
     * Let a Device do necessary process before changing input in a specific
     * zone. This is valid only when “prepare_input_change” exists in
     * “func_list” found in /system/getFuncStatus. MusicCast CONTROLLER executes
     * this API when an input icon is selected in a Room, right before sending
     * various APIs (of retrieving list information etc.) regarding selecting
     * input
     *
     * @param input Input IDs gotten via /system/getFeatures
     * @return Response code
     * @throws IOException
     */
    public Response prepareInputChange(String input) throws IOException {
        Response response = call(path + Response.ZONE_PREPARE_INPUT_CHANGE_METHOD + input, Response.class);
        return response;
    }
    
    /**
     * For setting Link Control in each Zone.
     * 
     * @param control Specifies Link Control setting (Values: Values gotten via /system/getFeatures)
     * @return Response code
     * @throws IOException 
     */
    public Response setLinkControl(String control) throws IOException {
        Response response = call(path + Response.ZONE_SET_LINK_CONTROL_PATH + control, Response.class);
        return response;
    }
    
    /**
     * For setting Link Audio Delay in each Zone. This setting is invalid when Link Control setting is
     * "Stability Boost ".
     * 
     * @param delay Specifies Link Audio Delay setting (Values: Values gotten via /system/getFeatures)
     * @return Response code
     * @throws IOException 
     */
    public Response setLinkAudioDelay(String delay) throws IOException {
        Response response = call(path + Response.ZONE_SET_LINK_AUDIO_DELAY_PATH + delay, Response.class);
        return response;
    }
}
