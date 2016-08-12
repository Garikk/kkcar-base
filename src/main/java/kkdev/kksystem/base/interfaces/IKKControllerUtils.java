/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kkdev.kksystem.base.interfaces;

import java.util.List;
import kkdev.kksystem.base.classes.display.DisplayInfo;
import kkdev.kksystem.base.classes.display.pages.DisplayPage;
import kkdev.kksystem.base.classes.kkcontroller.RS232Device;
import kkdev.kksystem.base.classes.kkcontroller.UIContextInfo;
import kkdev.kksystem.base.classes.plugins.PluginInfo;
import kkdev.kksystem.base.classes.plugins.QuickParameterInfo;

/**
 *
 * @author blinov_is
 */
public interface IKKControllerUtils {
    public enum ControllerUtilsPinRequestTypes
    {
        HWDev_GetRS232Devices,
        PLUGINS_GetLoadedPlugins,
        DISPLAY_GetUIDisplayPages,
        DISPLAY_GetUIDisplayPage,
        DISPLAY_AddUIDisplayPage,
        UICONTEXT_AddUIContext,
        UICONTEXT_GetUIContext,
        UICONTEXT_UpdateUIContext
    }
    //HWDevices
    public List<RS232Device> HWDEVICES_GetRS232Devices();
    // Plugin information
    public List<PluginInfo> PLUGINS_GetLoadedPlugins();
    public List<QuickParameterInfo> PLUGINS_GetPluginQuickParameters(String UUID);
    // Display pages
    public List<DisplayPage> DISPLAY_GetUIDisplayPages();
    public DisplayPage DISPLAY_GetUIDisplayPage(String Page);
    public void DISPLAY_AddUIDisplayPage(DisplayPage Page);
    // UIContexts
    public void UICONTEXT_AddUIContext(String UIContextID);
    public UIContextInfo UICONTEXT_GetUIContextInfo(String ContextID);
    public void UICONTEXT_UpdateDisplayInUIContext(String ContextID,DisplayInfo DI);
     
}
