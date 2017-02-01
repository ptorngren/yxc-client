/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.asynchronized.yxc.zone;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import net.asynchronized.yxc.Response;

/**
 *
 * @author enrico
 */
public class SoundProgramList extends Response {
//    public static final String PATH = ROOT_PATH + "/main/getSoundProgramList";
    public static final String METHOD = "/getSoundProgramList";
    
    @JsonProperty("sound_program_list")
    List<String> programs;

    public List<String> getPrograms() {
        return programs;
    }

    public void setPrograms(List<String> programs) {
        this.programs = programs;
    }

    @Override
    public String toString() {
        return "SoundProgramList{" + "responseCode=" + getResponseCode() + ", programs=" + programs + '}';
    }
    
    
}
