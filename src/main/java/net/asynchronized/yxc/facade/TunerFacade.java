/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.asynchronized.yxc.facade;

import java.io.IOException;
import net.asynchronized.yxc.Response;
import net.asynchronized.yxc.tuner.TunerPlayInfo;
import net.asynchronized.yxc.tuner.TunerPresetInfo;

/**
 *
 * @author enrico
 */
public class TunerFacade extends AbstractFacade {

    /**
     *
     * @param host IP address of the target device
     */
    public TunerFacade(String host) {
        super(host);
    }

    /**
     * Input IDs gotten via /system/getFeatures
     *
     * @return TunerPresetInfo
     * @throws IOException
     */
    public TunerPresetInfo getTunerPresetInfo() throws IOException {
        TunerPresetInfo info = call(TunerPresetInfo.PATH, TunerPresetInfo.class);
        return info;
    }

    /**
     * For retrieving playback information of Tuner
     *
     * @return TunerPlayInfo
     * @throws IOException
     */
    public TunerPlayInfo getTunerPlayInfo() throws IOException {
        TunerPlayInfo info = call(TunerPlayInfo.PATH, TunerPlayInfo.class);
        return info;
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
        Response response = call(Response.TUNER_SET_FREQ_PATH + band + "&tuning=" + tuning, Response.class);
        return response;
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
        Response response = call(Response.TUNER_SET_FREQ_PATH + band + "&tuning=" + Response.TUNER_FREQ_DIRECT + "&num=" + khz, Response.class);
        return response;
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
        Response response = call(Response.TUNER_RECALL_PRESET_PATH + zone + "&band=" + band + "&num=" + num, Response.class);
        return response;
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
        Response response = call(Response.TUNER_SWITCH_PRESET_PATH + dir, Response.class);
        return response;
    }

    /**
     * For registering current station to a preset
     *
     * @param num Preset number (one in the range gotten via
     * /system/getFeatures)
     * @return Response code
     * @throws IOException
     */
    public Response storePreset(Integer num) throws IOException {
        Response response = call(Response.TUNER_STORE_PRESET_PATH + num, Response.class);
        return response;
    }

    /**
     * For selecting DAB Service. Available only when DAB is valid to use
     *
     * @param dir change direction of services ("next", "previous")
     * @return Response code
     * @throws IOException
     */
    public Response setDabService(String dir) throws IOException {
        Response response = call(Response.TUNER_SET_DAB_SERVICE_PATH + dir, Response.class);
        return response;
    }
}
