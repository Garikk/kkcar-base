/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kkdev.kksystem.base.classes.display;

import kkdev.kksystem.base.classes.base.PinBaseCommand;
import kkdev.kksystem.base.classes.display.DisplayConstants.KK_DISPLAY_COMMAND;

/**
 *
 * @author blinov_is
 */
public class PinLedCommand extends PinBaseCommand {
    public KK_DISPLAY_COMMAND Command;
    
    public String PageID;
    public int[] INT;
    public String[] STRING;
    public boolean[] BOOL;
    //
    
    
}
