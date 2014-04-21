/* 
* @Author: Gowri Gary Shankar
* @Date:   2014-04-19 12:09:38
* @Last Modified by:   Gowri Gary Shankar
* @Last Modified time: 2014-04-19 12:10:42
*/
package com.prodapt.m2m.na.core;

import java.util.Date;

import com.prodapt.m2m.rest.domain.ContentInstance;

public class ContentInstanceInfo {
    
    private ContentInstance contentInstance;
    private String appId;
    private String deviceId;
    private Date receivedTime;
    
    public ContentInstanceInfo(String appId, String deviceId, ContentInstance contentInstance) {
    	this.appId = appId;
    	this.deviceId = deviceId;
    	this.contentInstance = contentInstance;
    	this.receivedTime = new Date();
    }
    
	public ContentInstance getContentInstance() {
		return contentInstance;
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