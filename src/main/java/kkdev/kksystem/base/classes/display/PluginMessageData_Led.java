/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kkdev.kksystem.base.classes.display;

import kkdev.kksystem.base.classes.plugins.PluginMessage;

/**
 *
 * @author blinov_is
 */
public class PluginMessageData_Led extends PluginMessage {


    public void setPinData(PinDataLed PinData) {
        super.setPinData(PinData); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public PinDataLed getPinData() {
        return (PinDataLed)super.getPinData(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
