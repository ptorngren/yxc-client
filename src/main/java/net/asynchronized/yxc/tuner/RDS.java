/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.asynchronized.yxc.tuner;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * @author enrico
 */
public class RDS {
    @JsonProperty("program_type")
    private String programType;
    @JsonProperty("program_service")
    private String programService;
    @JsonProperty("radio_text_a")
    private String radioTextA;
    @JsonProperty("radio_text_b")
    private String radioTextB;

    public String getProgramType() {
        return programType;
    }

    public void setProgramType(String programType) {
        this.programType = programType;
    }

    public String getProgramService() {
        return programService;
    }

    public void setProgramService(String programService) {
        this.programService = programService;
    }

    public String getRadioTextA() {
        return radioTextA;
    }

    public void setRadioTextA(String radioTextA) {
        this.radioTextA = radioTextA;
    }

    public String getRadioTextB() {
        return radioTextB;
    }

    public void setRadioTextB(String radioTextB) {
        this.radioTextB = radioTextB;
    }

    @Override
    public String toString() {
        return "RDS{" + "programType=" + programType + ", programService=" + programService + ", radioTextA=" + radioTextA + ", radioTextB=" + radioTextB + '}';
    }
    
}
