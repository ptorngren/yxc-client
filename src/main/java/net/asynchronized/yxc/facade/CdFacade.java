/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.asynchronized.yxc.facade;

import java.io.IOException;
import net.asynchronized.yxc.Response;
import net.asynchronized.yxc.cd.CdPlayInfo;

/**
 *
 * @author enrico
 */
public class CdFacade extends AbstractFacade {

    /**
     *
     * @param host IP address of the target device
     */
    public CdFacade(String host) {
        super(host);
    }

    /**
     * For retrieving playback information of CD
     *
     * @return CdPlayInfo
     * @throws IOException
     */
    public CdPlayInfo getPlayInfo() throws IOException {
        CdPlayInfo info = call(CdPlayInfo.PATH, CdPlayInfo.class);
        return info;
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
        Response response = call(Response.CD_SET_PLAYBACK_PATH + playback + "&num=" + num, Response.class);
        return response;
    }

    /**
     * For toggling CD tray Open/Close setting
     * 
     * @return Response code
     * @throws IOException 
     */
    public Response toggleTray() throws IOException {
        Response response = call(Response.CD_TOGGLE_TRAY_PATH, Response.class);
        return response;
    }

    /**
     * For toggling repeat setting. No direct / discrete setting commands available
     * 
     * @return Response code
     * @throws IOException 
     */
    public Response toggleRepeat() throws IOException {
        Response response = call(Response.CD_TOGGLE_REPEAT_PATH, Response.class);
        return response;
    }

    /**
     * For toggling shuffle setting. No direct / discrete setting commands available
     * 
     * @return Response code
     * @throws IOException 
     */
    public Response toggleShuffle() throws IOException {
        Response response = call(Response.CD_TOGGLE_SHUFFLE_PATH, Response.class);
        return response;
    }
}
