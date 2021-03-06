/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kkdev.kksystem.base.interfaces;

import kkdev.kksystem.base.classes.display.DisplayInfo;
import kkdev.kksystem.base.classes.kkcontroller.UIContextInfo;

/**
 *
 * @author blinov_is
 */
public interface IContextUtils {
   // UIContexts
    public void AddUIContext(String UIContextID);
    public UIContextInfo GetUIContextInfo(String ContextID);
    public void UpdateDisplayInUIContext(String ContextID,DisplayInfo DI);   
}
