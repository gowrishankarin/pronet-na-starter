/* 
* @Author: Gowri Gary Shankar
* @Date:   2014-04-19 12:09:38
* @Last Modified by:   Gowri Gary Shankar
* @Last Modified time: 2014-04-19 12:10:42
*/
package com.prodapt.m2m.da.core;

import java.util.Date;

import com.prodapt.m2m.rest.domain.Command;

public class CommandInfo {
    
    private Command command;
    private String appId;
    private String deviceId;
    private Date receivedTime;
    
    public CommandInfo(String appId, String deviceId, Command command) {
    	this.appId = appId;
    	this.deviceId = deviceId;
    	this.command = command;
    	this.receivedTime = new Date();
    }
    
	public Command getCommand() {
		return command;
	}
	public String getAppId() {
		return appId;
	}
	public String getDeviceId() {
		return deviceId;
	}
	
	public Date getReceivedTime() {
		return receivedTime;
	}
}