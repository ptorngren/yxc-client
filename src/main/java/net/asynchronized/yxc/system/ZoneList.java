/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.asynchronized.yxc.system;

/**
 *
 * @author enrico
 */
public class ZoneList {
    private Boolean main;
    private Boolean zone2;
    private Boolean zone3;
    private Boolean zone4;

    public Boolean getMain() {
        return main;
    }

    public void setMain(Boolean main) {
        this.main = main;
    }

    public Boolean getZone2() {
        return zone2;
    }

    public void setZone2(Boolean zone2) {
        this.zone2 = zone2;
    }

    public Boolean getZone3() {
        return zone3;
    }

    public void setZone3(Boolean zone3) {
        this.zone3 = zone3;
    }

    public Boolean getZone4() {
        return zone4;
    }

    public void setZone4(Boolean zone4) {
        this.zone4 = zone4;
    }

    @Override
    public String toString() {
        return "LocationInfoZone{" + "main=" + main + ", zone2=" + zone2 + ", zone3=" + zone3 + ", zone4=" + zone4 + '}';
    }
    
}
