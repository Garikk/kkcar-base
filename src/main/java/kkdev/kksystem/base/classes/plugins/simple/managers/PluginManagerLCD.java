/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kkdev.kksystem.base.classes.plugins.simple.managers;

import kkdev.kksystem.base.classes.display.DisplayConstants;
import kkdev.kksystem.base.classes.display.PinLedCommand;
import kkdev.kksystem.base.classes.display.PinLedData;
import kkdev.kksystem.base.classes.odb2.ODBConstants;
import kkdev.kksystem.base.classes.odb2.PinOdb2Command;
import kkdev.kksystem.base.classes.plugins.PluginMessage;
import static kkdev.kksystem.base.constants.PluginConsts.KK_PLUGIN_BASE_LED_COMMAND;
import static kkdev.kksystem.base.constants.PluginConsts.KK_PLUGIN_BASE_LED_DATA;
import static kkdev.kksystem.base.constants.PluginConsts.KK_PLUGIN_BASE_ODB2_COMMAND;

/**
 *
 * @author blinov_is
 */
public class PluginManagerLCD extends PluginManagerBase {
    
    
    public void ODB_SendPluginMessageCommand(String FeatureID,ODBConstants.KK_ODB_COMMANDTYPE Command, ODBConstants.KK_ODB_DATAPACKET Request, int[] DataInt, int[] ReadInterval) {

        PinOdb2Command PData = new PinOdb2Command();
        PData.Command = Command;
        PData.CommandData = Request;
        //
        PData.RequestPIDs = DataInt;
        PData.DynamicRequestInterval = ReadInterval;
        //

        //
        this.BASE_SendPluginMessage(FeatureID,KK_PLUGIN_BASE_ODB2_COMMAND, PData);
    }

    public void DISPLAY_SendPluginMessageCommand(String FeatureID,DisplayConstants.KK_DISPLAY_COMMAND Command,String PageID, String[] DataStr, int[] DataInt, boolean[] DataBool) {
        //
        PinLedCommand PData = new PinLedCommand();
        PData.Command = Command;
        PData.BOOL = DataBool;
        PData.INT = DataInt;
        PData.STRING = DataStr;
        PData.PageID=PageID;
        //
        //
        this.BASE_SendPluginMessage(FeatureID,KK_PLUGIN_BASE_LED_COMMAND, PData);
    }

    public void DISPLAY_SendPluginMessageData(String FeatureID, PinLedData PData) {

        //
        this.BASE_SendPluginMessage(FeatureID,KK_PLUGIN_BASE_LED_DATA, PData);
    }
    
     public void _DISPLAY_SendPluginMessageDataDirect(String TargetUUID,String FeatureID, PinLedData PData) {
        //PData.FeatureUID=FeatureID;
        //
        this._BASE_SendPluginMessageDirect(FeatureID,TargetUUID,KK_PLUGIN_BASE_LED_DATA, PData);
    }
       public void _DISPLAY_SendPluginMessageCommandDirect(String TargetUUID,String FeatureID,DisplayConstants.KK_DISPLAY_COMMAND Command,String PageID, String[] DataStr, int[] DataInt, boolean[] DataBool) {
        
        PinLedCommand PData = new PinLedCommand();
        PData.Command = Command;
        PData.BOOL = DataBool;
        PData.INT = DataInt;
        PData.STRING = DataStr;
        PData.PageID=PageID;
        //

        //
        this._BASE_SendPluginMessageDirect(FeatureID,TargetUUID,KK_PLUGIN_BASE_LED_COMMAND, PData);
    }
}
