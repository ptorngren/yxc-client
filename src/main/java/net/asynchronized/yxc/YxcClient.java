/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.asynchronized.yxc;

import java.io.IOException;
import net.asynchronized.yxc.cd.CdPlayInfo;
import net.asynchronized.yxc.facade.CdFacade;
import net.asynchronized.yxc.facade.NetworkUsbFacade;
import net.asynchronized.yxc.facade.SystemFacade;
import net.asynchronized.yxc.facade.TunerFacade;
import net.asynchronized.yxc.facade.ZoneFacade;
import net.asynchronized.yxc.networkusb.AccountStatus;
import net.asynchronized.yxc.networkusb.ListInfo;
import net.asynchronized.yxc.networkusb.NetworkUsbPlayInfo;
import net.asynchronized.yxc.networkusb.NetworkUsbPresetInfo;
import net.asynchronized.yxc.networkusb.SearchString;
import net.asynchronized.yxc.networkusb.ServiceInfo;
import net.asynchronized.yxc.system.DeviceInfo;
import net.asynchronized.yxc.system.FeatureInfo;
import net.asynchronized.yxc.system.FuncStatus;
import net.asynchronized.yxc.system.LocationInfo;
import net.asynchronized.yxc.system.NetworkStatus;
import net.asynchronized.yxc.tuner.TunerPlayInfo;
import net.asynchronized.yxc.tuner.TunerPresetInfo;
import net.asynchronized.yxc.zone.SoundProgramList;
import net.asynchronized.yxc.zone.Status;
/**
 *
 * @author enrico
 */
public class YxcClient {
    private String host;
    private SystemFacade systemFacade;
    private ZoneFacade zoneFacade;
    private TunerFacade tunerFacade;
    private NetworkUsbFacade networkUsbFacade;
    private CdFacade cdFacade;

    /**
     * 
     * @param host IP address of the target device
     * @param zone Target zone ("main", "zone2", "zone3", "zone4")
     */
    public YxcClient(String host, String zone) {
        this.host = host;
        systemFacade = new SystemFacade(host);
        zoneFacade = new ZoneFacade(host, zone);
        tunerFacade = new TunerFacade(host);
        networkUsbFacade = new NetworkUsbFacade(host);
        cdFacade = new CdFacade(host);
    }

    // SYSTEM
    
    /**
     * For retrieving basic information of a Device
     *
     * @return DeviceInfo
     * @throws IOException
     */
    public DeviceInfo getDeviceInfo() throws IOException {
        return systemFacade.getDeviceInfo();
    }

    /**
     * For retrieving feature information equipped with a Device
     *
     * @return FeatureInfo
     * @throws IOException
     */
    public FeatureInfo getFeatures() throws IOException {
        return systemFacade.getFeatures();
    }

    /**
     * For retrieving network related setup / information
     *
     * @return NetworkStatus
     * @throws IOException
     */
    public NetworkStatus getNetworkStatus() throws IOException {
        return systemFacade.getNetworkStatus();
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
        return systemFacade.getFuncStatus();
    }

    /**
     * For retrieving Location information
     *
     * @return LocationInfo
     * @throws IOException
     */
    public LocationInfo getLocationInfo() throws IOException {
        return systemFacade.getLocationInfo();
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
        return systemFacade.setAutoPowerStandby(enable);
    }

    // ZONE
    /**
     * For retrieving basic information of each Zone like power, volume, input
     * and so on
     *
     * @return Status
     * @throws IOException
     */
    public Status getStatus() throws IOException {
        return zoneFacade.getStatus();
    }

    /**
     * For retrieving a list of Sound Program available in each Zone. It is
     * possible for the list contents to be dynamically changed
     *
     * @return SoundProgramList
     * @throws IOException
     */
    public SoundProgramList getSoundProgramList() throws IOException {
        return zoneFacade.getSoundProgramList();
    }

    /**
     * For setting power status of each Zone
     *
     * @param power power status ("on", "standby", "toggle")
     * @return Response code
     * @throws IOException
     */
    public Response setPower(String power) throws IOException {
        return zoneFacade.setPower(power);
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
        return zoneFacade.setSleep(sleep);
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
        return zoneFacade.setVolume(volume);
    }

    /**
     * For setting mute status in each Zone
     *
     * @param enable mute status
     * @return Response code
     * @throws IOException
     */
    public Response setMute(Boolean enable) throws IOException {
        return zoneFacade.setMute(enable);
    }

    /**
     * For selecting each Zone input
     *
     * @param input Input IDs gotten via /system/getFeatures
     * @return Response code
     * @throws IOException
     */
    public Response setInput(String input) throws IOException {
        return zoneFacade.setInput(input);
    }

    /**
     * For selecting Sound Programs
     *
     * @param program Sound Program IDs gotten via /system/getFeatures
     * @return Response code
     * @throws IOException
     */
    public Response setSoundProgram(String program) throws IOException {
        return zoneFacade.setSoundProgram(program);
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
        return zoneFacade.prepareInputChange(input);
    }

    // TUNER
    
    /**
     * Input IDs gotten via /system/getFeatures
     *
     * @return TunerPresetInfo
     * @throws IOException
     */
    public TunerPresetInfo getTunerPresetInfo() throws IOException {
        return tunerFacade.getTunerPresetInfo();
    }

    /**
     * For retrieving playback information of Tuner
     *
     * @return TunerPlayInfo
     * @throws IOException
     */
    public TunerPlayInfo getTunerPlayInfo() throws IOException {
        return tunerFacade.getTunerPlayInfo();
    }

    /**
     * Fr setting Tuner frequency
     *
     * @param band Band ("am", "fm")
     * @param tuning Tuning method ("up" / "down" / "cancel" / "auto_up" /
     * "auto_down" / "tp_up" / "tp_down" / "direct")
     * @return Response code
     * @throws IOException
     */
    public Response setFreq(String band, String tuning) throws IOException {
        return tunerFacade.setFreq(band, tuning);
    }

    /**
     * Fr setting Tuner frequency
     *
     * @param band Band ("am", "fm")
     * @param khz frequency in kHz
     * @return Response code
     * @throws IOException
     */
    public Response setFreq(String band, Integer khz) throws IOException {
        return tunerFacade.setFreq(band, khz);
    }

    /**
     * For recalling a Tuner preset
     *
     * @param zone Station recalling zone ("main", "zone2", "zone3", "zone4)
     * @param band Band type. Depending on Preset Type gotten via
     * /system/getFeatures, specifying value is different ("common" (band
     * common) / "separate" (each band preset))
     * @param num Preset number (one in the range gotten via
     * /system/getFeatures)
     * @return Response code
     * @throws IOException
     */
    public Response recallPreset(String zone, String band, Integer num) throws IOException {
        return tunerFacade.recallPreset(zone, band, num);
    }

    /**
     * For selecting Tuner preset. Call this API after change the target zone’s
     * input to Tuner. It is possible to change Band in case of preset type is
     * “common”. In case of preset type is “separate”, need to change the target
     * Band before calling this API. This API is available on and after API
     * Version 1.17.
     *
     * @param dir change direction of preset ("next", "previous")
     * @return Response code
     * @throws IOException
     */
    public Response switchPreset(String dir) throws IOException {
        return tunerFacade.switchPreset(dir);
    }

    /**
     * For registering current station to a preset
     *
     * @param num Preset number (one in the range gotten via
     * /system/getFeatures)
     * @return Response code
     * @throws IOException
     */
    public Response storeTunerPreset(Integer num) throws IOException {
        return tunerFacade.storePreset(num);
    }

    /**
     * For selecting DAB Service. Available only when DAB is valid to use
     *
     * @param dir change direction of services ("next", "previous")
     * @return Response code
     * @throws IOException
     */
    public Response setDabService(String dir) throws IOException {
        return tunerFacade.setDabService(dir);
    }

    // NETWORK/USB
    
    /**
     * For retrieving preset information. Presets are common use among Net/USB
     * related input sources
     *
     * @return NetworkUsbPresetInfo
     * @throws IOException
     */
    public NetworkUsbPresetInfo getNetworkUsbPresetInfo() throws IOException {
        return networkUsbFacade.getNetworkUsbPresetInfo();
    }

    /**
     * For retrieving playback information
     *
     * @return NetworkUsbPlayInfo
     * @throws IOException
     */
    public NetworkUsbPlayInfo getNetworkUsbPlayInfo() throws IOException {
        return networkUsbFacade.getNetworkUsbPlayInfo();
    }

    /**
     * For retrieving list information. Basically this info is available to all
     * relevant inputs, not limited to or independent from current input
     *
     * @param listId List ID (common for all Net/USB sources: "main", Pandora:
     * "auto_complete", "search_artist", "search_track")
     * @param input Target Input ID. Controls for setListControl are to work
     * with the input specified here (Values: Input IDs for Net/USB related
     * sources)
     * @param index Specifies the reference index (offset from the beginning of
     * the list). Note that this index must be in multiple of 8. If nothing was
     * specified, the reference index previously specified would be used
     * (Values: 0, 8, 16, 24, ..., 64984, 64992)
     * @param size Specifies max list size retrieved at a time (Value Range: 1 -
     * 8)
     * @param lang Specifies list language. But menu names or text info are not
     * always necessarily pulled in a language specified here. If nothing
     * specified, English ("en") is used implicitly Values: "en" (English)/ "ja"
     * (Japanese)/ "fr" (French)/ "de" (German)/ "es" (Spanish)/ "ru" (Russian)/
     * "it" (Italy)/ "zh" (Chinese)
     * @return ListInfo
     * @throws IOException
     */
    public ListInfo getNetworkUsbListInfo(String listId, String input, Integer index, Integer size, String lang) throws IOException {
        return networkUsbFacade.getNetworkUsbListInfo(listId, input, index, size, lang);
    }
    
    /**
     * For retrieving account information registered on Device
     *
     * @return AccountStatus
     * @throws IOException
     */
    public AccountStatus getAccountStatus() throws IOException {
        return networkUsbFacade.getAccountStatus();
    }

    /**
     * For controlling playback status
     *
     * @param playback Playback status ("play" / "stop" / "pause" / "play_pause"
     * / "previous" / "next" / "fast_reverse_start" / "fast_reverse_end" /
     * "fast_forward_start" / "fast_forward_end")
     * @return Response code
     * @throws IOException
     */
    public Response setPlayback(String playback) throws IOException {
        return networkUsbFacade.setPlayback(playback);
    }

    /**
     * For toggling repeat setting. No direct / discrete setting commands
     * available
     *
     * @return Response code
     * @throws IOException
     */
    public Response toggleNetworkUsbRepeat() throws IOException {
        return networkUsbFacade.toggleRepeat();
    }

    /**
     * For toggling shuffle setting. No direct / discrete setting commands
     * available
     *
     * @return Response code
     * @throws IOException
     */
    public Response toggleNetworkUsbShuffe() throws IOException {
        return networkUsbFacade.toggleShuffe();
    }

    /**
     * For retrieving list information. Basically this info is available to all
     * relevant inputs, not limited to or independent from current input
     *
     * @param listId List ID (common for all Net/USB sources: "main", Pandora:
     * "auto_complete", "search_artist, "search_track")
     * @param type List transition type. "select" is to enter and get into one
     * deeper layer than the current layer where the element specified by the
     * index belongs to. "play" is to start playback current index element,
     * "return" is to go back one upper layer than current. "select" and "play"
     * needs to specify an index at the same time. In case to “select” an
     * element with its attribute being "Capable of Yamaha Extended Control API
     * Specification (Basic) Copyright  2016 Yamaha Corporation, ALL rights
     * reserved. Page 38 of 61 Search", specify search text using
     * setSearchString in advance. (Or it is possible to specify search text and
     * move layers at the same time by specifying an index in setSearchString)
     * Values: "select" / "play" / "return"
     * @param index Specifies an element position in the list being selected
     * (offset from the beginning of the list). This is mandatory to specify if
     * the type is "select" or "play" Value Range: 0 - 64999
     * @param zone Specifies target zone to playback. In the specified zone,
     * input change occurs at the same time of playback. This parameter is valid
     * only when type "play" is specified. ("main", "zone2", "zone3", "zone4)
     * @return Response code
     * @throws IOException
     */
    public Response setListControl(String listId, String type, Integer index, String zone) throws IOException {
        return networkUsbFacade.setListControl(listId, type, index, zone);
    }
    
    /**
     * For setting search text. Specifies string executing this API before
     * select an element with its attribute being “Capable of Search” or
     * retrieve info about searching list(Pandora).
     *
     * @param s List ID (All: "main", Pandora: "auto_complete", "search_artist",
     * "search_track")
     * @return Response code
     * @throws IOException
     */
    public Response setSearchString(SearchString s) throws IOException {
        return networkUsbFacade.setSearchString(s);
    }
    
    /**
     * For recalling a content preset
     *
     * @param zone station recalling zone. This causes input change in specified
     * zone ("main", "zone2", "zone3", "zone4")
     * @param num Preset number (one in the range gotten via
     * /system/getFeatures)
     * @return Response code
     * @throws IOException
     */
    public Response recallPreset(String zone, Integer num) throws IOException {
        return networkUsbFacade.recallPreset(zone, num);
    }
    
    /**
     * For registering current content to a preset. Presets are common use among
     * Net/USB related input sources.
     *
     * @param num Preset number (one in the range gotten via
     * /system/getFeatures)
     * @return Response code
     * @throws IOException
     */
    public Response storeNetworkUsbPreset(Integer num) throws IOException {
        return networkUsbFacade.storePreset(num);
    }
    
    /**
     * For switching account for service corresponding multi account
     *
     * @param input Target Input ID ("pandora")
     * @param index switch account index (0 - 7)
     * @param timeout Specifies timeout duration(ms) for this API process. If
     * specifies 0, treat as maximum value. (0 - 60000)
     * @return Response code
     * @throws IOException
     */
    public Response switchAccount(String input, Integer index, Integer timeout) throws IOException {
        return networkUsbFacade.switchAccount(input, index, timeout);
    }
    
    /**
     * For retrieving information of various Streaming Service
     *
     * Account List (account_list) : retrieving list of account registed on
     * Device Licensing (licensing) : checking license Activation Code
     * (activation_code) : retrieving Activation Code ※Disable to check Rhapsody
     * license by refering the value of this APIs response_code. a Device issues
     * events of netusb – account_updated by condition, retrieve the info excute
     * /netusb/getAccountStatus. (Sometimes Deivice not issue events) ※Before
     * retrieve Activation Code, retrieve Account List and check not to reach
     * Max about the num of registration. Note: Rhapsody service name will be
     * changed to Napster.
     *
     * @param input Target Input ID ("pandora", "rhapsody", "napster")
     * @param type type of retrieving info (Rhapsody/Napster/Pandora:
     * "licensing", Pandora: "account_list", "activation_code")
     * @param timeout Specifies timeout duration(ms) for this API process. If
     * specifies 0, treat as maximum value. (0 - 60000)
     * @return ServiceInfo
     * @throws IOException
     */
    public ServiceInfo getServiceInfo(String input, String type, Integer timeout) throws IOException {
        return networkUsbFacade.getServiceInfo(input, type, timeout);
    }
    
    
    // CD
    
    /**
     * For retrieving playback information of CD
     *
     * @return CdPlayInfo
     * @throws IOException
     */
    public CdPlayInfo getCdPlayInfo() throws IOException {
        return cdFacade.getPlayInfo();
    }
    
    /**
     * For controlling playback status
     *
     * @param playback Specifies playback status Values: "play" / "stop" /
     * "pause" / "previous" / "next" / "fast_reverse_start" / "fast_reverse_end"
     * / "fast_forward_start" / "fast_forward_end" / "track_select "
     * @param num Specifies target track number to playback. This parameter is
     * valid only when playback "track_select" is specified. Values: 1 ~ 512
     * @return Response code
     * @throws IOException
     */
    public Response setPlayback(String playback, Integer num) throws IOException {
        return cdFacade.setPlayback(playback, num);
    }
    
    /**
     * For toggling CD tray Open/Close setting
     * 
     * @return Response code
     * @throws IOException 
     */
    public Response toggleTray() throws IOException {
        return cdFacade.toggleTray();
    }
    
    /**
     * For toggling repeat setting. No direct / discrete setting commands available
     * 
     * @return Response code
     * @throws IOException 
     */
    public Response toggleCdRepeat() throws IOException {
        return cdFacade.toggleRepeat();
    }
    
    /**
     * For toggling shuffle setting. No direct / discrete setting commands available
     * 
     * @return Response code
     * @throws IOException 
     */
    public Response toggleCdShuffle() throws IOException {
        return cdFacade.toggleShuffle();
    }
}
