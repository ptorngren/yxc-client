/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.asynchronized.yxc.facade;

import java.io.IOException;
import net.asynchronized.yxc.Response;
import net.asynchronized.yxc.networkusb.AccountStatus;
import net.asynchronized.yxc.networkusb.ListInfo;
import net.asynchronized.yxc.networkusb.NetworkUsbPlayInfo;
import net.asynchronized.yxc.networkusb.NetworkUsbPresetInfo;
import net.asynchronized.yxc.networkusb.SearchString;
import net.asynchronized.yxc.networkusb.ServiceInfo;

/**
 *
 * @author enrico
 */
public class NetworkUsbFacade extends AbstractFacade {

    /**
     *
     * @param host IP address of the target device
     */
    public NetworkUsbFacade(String host) {
        super(host);
    }

    /**
     * For retrieving preset information. Presets are common use among Net/USB
     * related input sources
     *
     * @return NetworkUsbPresetInfo
     * @throws IOException
     */
    public NetworkUsbPresetInfo getNetworkUsbPresetInfo() throws IOException {
        NetworkUsbPresetInfo info = call(NetworkUsbPresetInfo.PATH, NetworkUsbPresetInfo.class);
        return info;
    }

    /**
     * For retrieving playback information
     *
     * @return NetworkUsbPlayInfo
     * @throws IOException
     */
    public NetworkUsbPlayInfo getNetworkUsbPlayInfo() throws IOException {
        NetworkUsbPlayInfo info = call(NetworkUsbPlayInfo.PATH, NetworkUsbPlayInfo.class);
        return info;
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
        ListInfo info = call(ListInfo.PATH + input + "&list_id=" + listId + "&index=" + index + "&size=" + size + "&lang=" + lang, ListInfo.class);
        return info;
    }

    /**
     * For retrieving account information registered on Device
     *
     * @return AccountStatus
     * @throws IOException
     */
    public AccountStatus getAccountStatus() throws IOException {
        AccountStatus status = call(AccountStatus.PATH, AccountStatus.class);
        return status;
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
        Response response = call(Response.NETWORK_USB_SET_PLAYBACK_PATH + playback, Response.class);
        return response;
    }

    /**
     * For toggling repeat setting. No direct / discrete setting commands
     * available
     *
     * @return Response code
     * @throws IOException
     */
    public Response toggleRepeat() throws IOException {
        Response response = call(Response.NETWORK_USB_TOGGLE_REPEAT_PATH, Response.class);
        return response;
    }

    /**
     * For toggling shuffle setting. No direct / discrete setting commands
     * available
     *
     * @return Response code
     * @throws IOException
     */
    public Response toggleShuffe() throws IOException {
        Response response = call(Response.NETWORK_USB_TOGGLE_SHUFFLE_PATH, Response.class);
        return response;
    }

    // TODO: extend
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
        Response response = call(Response.NETWORK_USB_SET_LIST_CONTROL_PATH + listId + "&type=" + type + "&index=" + index + "&zone=" + zone, Response.class);
        return response;
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
        Response response = post(SearchString.PATH, s);
        return response;
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
        Response response = call(Response.NETWORK_USB_RECALL_PRESET_PATH + zone + "&num=" + num, Response.class);
        return response;
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
    public Response storePreset(Integer num) throws IOException {
        Response response = call(Response.NETWORK_USB_STORE_PRESET_PATH + num, Response.class);
        return response;
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
        Response response = call(Response.NETWORK_USB_SWITCH_ACCOUNT_PATH + input + "&index=" + index + "&timeout=" + timeout, Response.class);
        return response;
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
        ServiceInfo info = call(ServiceInfo.PATH + input + "&type=" + type + "&timeout=" + timeout, ServiceInfo.class);
        return info;
    }
}
