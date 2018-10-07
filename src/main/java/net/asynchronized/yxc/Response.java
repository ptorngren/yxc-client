/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.asynchronized.yxc;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * @author enrico
 * 
 */
public class Response {
    public static final int SUCCESS = 0;
    public static final int INITIALIZING = 1;
    public static final int INTERNAL_ERROR = 2;
    public static final int INVALID_REQUEST = 3;
    public static final int INVALID_PARAMETER = 4;
    public static final int GUARDED = 5;
    public static final int TIMEOUT = 6;
    public static final int FIRMWARE_UPDATING = 99;
    public static final int ACCESS_ERROR = 100;
    public static final int OTHER_ERRORS = 101;
    public static final int WRONG_USER_NAME = 102;
    public static final int WRONG_PASSWORD = 103;
    public static final int ACCOUNT_EXPIRED = 104;
    public static final int ACCOUNT_DISCONNECTED = 105;
    public static final int ACCOUNT_NUMBER_REACHED_TO_THE_LIMIT = 106;
    public static final int SERVER_MAINTENANCE = 107;
    public static final int INVALID_ACCOUNT = 108;
    public static final int LICENSE_ERROR = 109;
    public static final int READ_ONLY_MODE = 110;
    public static final int MAX_STATIONS = 111;
    public static final int ACCES_DENIED = 112;
    
    public static final String ROOT_PATH = "/YamahaExtendedControl/v1";
    
//    public static final String ZONE_MAIN = "main";
//    public static final String ZONE_2 = "zone2";
//    public static final String ZONE_3 = "zone3";
//    public static final String ZONE_4 = "zone4";
    
    public static final String SYSTEM_SET_AUTO_POWER_STANDBY_PATH = ROOT_PATH + "/system/setAutoPowerStandby?enable=";
    public static final String SYSTEM_SEND_IR_CODE_PATH = ROOT_PATH + "/system/sendIrCode?code=";
    
    public static final String ZONE_SET_POWER_METHOD = "/setPower?power=";
    public static final String ZONE_POWER_ON = "on";
    public static final String ZONE_POWER_STANDBY = "standby";
    public static final String ZONE_POWER_TOGGLE = "toggle";
    
    public static final String ZONE_SET_SLEEP_METHOD = "/setSleep?sleep=";
    public static final int ZONE_SLEEP_0 = 0;
    public static final int ZONE_SLEEP_30 = 30;
    public static final int ZONE_SLEEP_60 = 60;
    public static final int ZONE_SLEEP_90 = 90;
    public static final int ZONE_SLEEP_120 = 120;
    
    public static final String ZONE_SET_VOLUME_METHOD = "/setVolume?volume=";
    public static final String ZONE_SET_MUTE_METHOD = "/setMute?enable=";
    
    public static final String ZONE_SET_INPUT_METHOD = "/setInput?input=";
    public static final String ZONE_SET_SOUND_PROGRAM_METHOD = "/setSoundProgram?program=";
    public static final String ZONE_PREPARE_INPUT_CHANGE_METHOD = "/prepareInputChange?input=";
    
    public static final String ZONE_SET_LINK_CONTROL_PATH = "/system/setLinkControl?control=";
    public static final String ZONE_SET_LINK_AUDIO_DELAY_PATH = "setLinkAudioDelay?delay=";
    
    public static final String TUNER_SET_FREQ_PATH = ROOT_PATH + "/tuner/setFreq?band=";
    public static final String TUNER_FREQ_BAND_AM = "am";
    public static final String TUNER_FREQ_BAND_FM = "fm";
    public static final String TUNER_FREQ_UP = "up";
    public static final String TUNER_FREQ_DOWN = "down";
    public static final String TUNER_FREQ_CANCEL = "cancel";
    public static final String TUNER_FREQ_AUTO_UP = "auto_up";
    public static final String TUNER_FREQ_AUTO_DOWN = "auto_down";
    public static final String TUNER_FREQ_TP_UP = "tp_up";
    public static final String TUNER_FREQ_TP_DOWN = "tp_down";
    public static final String TUNER_FREQ_DIRECT = "direct";
    
    public static final String TUNER_RECALL_PRESET_PATH = ROOT_PATH + "/tuner/recallPreset?zone=";
    public static final String TUNER_PRESET_BAND_COMMON = "common";
    public static final String TUNER_PRESET_BAND_SEPARATE = "separate";
    
    public static final String TUNER_SWITCH_PRESET_PATH = ROOT_PATH + "/tuner/switchPreset?dir=";
    public static final String TUNER_SWTICH_PRESET_NEXT = "next";
    public static final String TUNER_SWTICH_PRESET_PREVIOUS = "previous";
    
    public static final String TUNER_STORE_PRESET_PATH = ROOT_PATH + "/tuner/storePreset?num=";
    
    public static final String TUNER_SET_DAB_SERVICE_PATH = ROOT_PATH + "/tuner/setDabService?dir=";
    public static final String TUNER_SET_DAB_SERVICE_NEXT = "next";
    public static final String TUNER_SET_DAB_SERVICE_PREVIOUS = "previous";
    
    public static final String NETWORK_USB_SET_PLAYBACK_PATH = ROOT_PATH + "/netusb/setPlayback?playback=";
    public static final String NETWORK_USB_PLAYBACK_PLAY = "play";
    public static final String NETWORK_USB_PLAYBACK_STOP = "stop";
    public static final String NETWORK_USB_PLAYBACK_PAUSE = "pause";
    public static final String NETWORK_USB_PLAYBACK_PLAY_PAUSE = "play_pause";
    public static final String NETWORK_USB_PLAYBACK_PREVIOUS = "previous";
    public static final String NETWORK_USB_PLAYBACK_NEXT = "next";
    public static final String NETWORK_USB_PLAYBACK_FAST_REVERSE_START = "fast_reverse_start";
    public static final String NETWORK_USB_PLAYBACK_FAST_REVERSE_END = "fast_reverse_end";
    public static final String NETWORK_USB_PLAYBACK_FAST_FORWARD_START = "fast_forward_start";
    public static final String NETWORK_USB_PLAYBACK_FAST_FORWARD_END = "fast_forward_end";
    
    public static final String NETWORK_USB_TOGGLE_REPEAT_PATH = ROOT_PATH + "/netusb/toggleRepeat";
    public static final String NETWORK_USB_TOGGLE_SHUFFLE_PATH = ROOT_PATH + "/netusb/toggleShuffle";
    public static final String NETWORK_USB_SET_LIST_CONTROL_PATH = ROOT_PATH + "/netusb/setListControl?list_id=";
    public static final String NETWORK_USB_RECALL_PRESET_PATH = ROOT_PATH + "/netusb/recallPreset?zone=";
    public static final String NETWORK_USB_STORE_PRESET_PATH = ROOT_PATH + "/netusb/storePreset?num=";
    public static final String NETWORK_USB_SWITCH_ACCOUNT_PATH = ROOT_PATH + "/netusb/switchAccount?input=";
    
    public static final String CD_SET_PLAYBACK_PATH = ROOT_PATH + "/cd/setPlayback?playback=";
    public static final String CD_TOGGLE_TRAY_PATH = ROOT_PATH + "/cd/toggleTray";
    public static final String CD_TOGGLE_REPEAT_PATH = ROOT_PATH + "/cd/toggleRepeat";
    public static final String CD_TOGGLE_SHUFFLE_PATH = ROOT_PATH + "/cd/toggleShuffle";
    
    public static final String DIST_START_DISTRIBUTION_PATH = ROOT_PATH + "/dist/startDistribution?num=";
    public static final String DIST_STOP_DISTRIBUTION_PATH = ROOT_PATH + "/dist/stopDistribution";
    
    @JsonProperty("response_code")
    private Integer responseCode;

    public Integer getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(Integer responseCode) {
        this.responseCode = responseCode;
    }

    @Override
    public String toString() {
        return "Response{" + "responseCode=" + responseCode + '}';
    }
}
