/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kkdev.kksystem.base.constants;

/**
 *
 * @author blinov_is
 */
public final class PluginConsts {
    public static enum KK_PLUGIN_TYPE
    {
        PLUGIN_INPUT,
        PLUGIN_OUTPUT,
        PLUGIN_PROCESSOR
    }
    
    public static enum KK_PLUGIN_MESSAGES
    {
        BASE_MESSAGE_INFO
    }
    
    //
    public static String KK_PLUGIN_PIN_S_DEF_SELFTEST="KKPIN_S_SELFTEST";
    public static String KK_PLUGIN_PIN_S_DEF_SELFTEST_ANS="KKPIN_S_SELFTEST_ANS";
    //
    public static String KK_PLUGIN_PIN_DEF_WELCOME="KKPIN_S_WELCOME";
    
    
    public static String KK_PLUGIN_BASE_PLUGIN_ODB2="KKODB2Reader";
    public static String KK_PLUGIN_BASE_PLUGIN_LEDDISPLAY="KKLEDDisplay";
     public static String KK_PLUGIN_BASE_PLUGIN_TEXTLOG="KKTextLogWriter";
    
}
