/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kkdev.kksystem.base.classes.base;

/**
 *
 * @author blinov_is
 */
public class PinDataSystemOperations extends PinData {
     public enum SystemOperationsCommand
    {

        SYSTEM_RESTART_KKCONTROLLER,
        SYSTEM_REBOOT_HW,
        SYSTEM_POWEROFF,
        SYSTEM_RESTORE_BACKUP,
        SYSTEM_RESTORE_EMERGENCY
      
    }
     public SystemOperationsCommand CommandType;
     

}
