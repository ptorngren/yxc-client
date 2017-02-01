/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.asynchronized.yxc.system;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 *
 * @author enrico
 */
public class Tuner {
    @JsonProperty("func_list")
    private List<String> functionList;
    @JsonProperty("range_step")
    private List<RangeStep> rangeSteps;
    private Preset preset;

    public List<String> getFunctionList() {
        return functionList;
    }

    public void setFunctionList(List<String> functionList) {
        this.functionList = functionList;
    }

    public List<RangeStep> getRangeSteps() {
        return rangeSteps;
    }

    public void setRangeSteps(List<RangeStep> rangeSteps) {
        this.rangeSteps = rangeSteps;
    }

    public Preset getPreset() {
        return preset;
    }

    public void setPreset(Preset preset) {
        this.preset = preset;
    }

    @Override
    public String toString() {
        return "Tuner{" + "functionList=" + functionList + ", rangeSteps=" + rangeSteps + ", preset=" + preset + '}';
    }
    
}
