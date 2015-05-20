/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kkdev.kksystem.base.classes.display;

import kkdev.kksystem.base.classes.base.PinBaseData;
import kkdev.kksystem.base.classes.display.DisplayConstants.KK_DISPLAY_DATA;

/**
 *
 * @author blinov_is
 */
public class PinLedData extends PinBaseData {
    public KK_DISPLAY_DATA DataType;
    //
    public String TargetPage;           //Target page
    //
    public String[] OnFrame_DataKeys;
    public String[] OnFrame_DataValues;
    //
    public String[] Direct_DisplayText;        //Text for display
    public String[] Direct_DisplayTextUpdate;    //Updated text (using positions)
    public int[] Direct_StartPositionColumn;     //Position for update text
    public int[] Direct_StartPositionLine;       //Position for update text
    //
    public DisplayInfo[] DisplayState;    //
}
