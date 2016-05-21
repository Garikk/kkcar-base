/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kkdev.kksystem.base.classes.display.pages;

import static java.lang.System.out;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author blinov_is
 */
public class DisplayPage {
    public String PageName;             //ID
    public boolean DynamicElements; //want to exec anmimation by thread
    public boolean IsDefaultPage;
    public boolean IsMultifeaturePage;  //Page available in all features
    //
    public String[] Features;
    //
    public String[] UIContexts;         //links to HWDisplays
    //
    public UIFramePack UIFramesPack;
    //
    public  String[] UIFrames;
    public  UIFramesKeySet UIFramesValues;
    
    public DisplayPage GetInstance()
    {
        DisplayPage Ret;
        Ret=new DisplayPage();
        Ret.Features=this.Features;
        Ret.UIContexts=this.UIContexts;
        Ret.UIFramesPack=this.UIFramesPack;
        Ret.UIFrames=this.UIFrames;
        Ret.UIFramesValues=this.UIFramesValues;
        Ret.PageName=this.PageName;
        Ret.DynamicElements=this.DynamicElements;
        Ret.IsDefaultPage=this.IsDefaultPage;
        Ret.IsMultifeaturePage=this.IsMultifeaturePage;
        
        return Ret;
    }
    
     public void InitUIFrames() {
        int i=0;
        UIFrames = new String[UIFramesPack.Data.length];
        for (UIFrameData FrameData : UIFramesPack.Data) {
           UIFrames[i]=FrameData.FrameData;
           i++;
        }
    }
     
     public String[] GetUIContexts()
     {
         return UIContexts;
     }
}

