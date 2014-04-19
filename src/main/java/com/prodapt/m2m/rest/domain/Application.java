package com.prodapt.m2m.rest.domain;

import java.util.ArrayList;
import java.util.Date;

public class Application {
	
	private String appId;
	private String accessRightID;
	private ArrayList<String> searchStrings;
	private Date creationTime;
	private Date lastModifiedTime;
	private String aPoC;
	private ArrayList<String> aPocPaths;
	private String containersReference;
	private String groupsReference;
	private String accessRightsReference;
	private String notificationChannelReference;
	
	public String getAppId() {
		return appId;
	}
	
	public String getAccessRightID() {
		return accessRightID;
	}
	
	public ArrayList<String> getSearchStrings() {
		return searchStrings;
	}
	
	public Date getCreationTime() {
		return creationTime;
	}
	
	public Date getLastModifiedTime() {
		return lastModifiedTime;
	}
	
	public String getaPoC() {
		return aPoC;
	}
	
	public ArrayList<String> getaPocPaths() {
		return aPocPaths;
	}
	
	public String getContainersReference() {
		return containersReference;
	}
	public String getGroupsReference() {
		return groupsReference;
	}
	
	public String getAccessRightsReference() {
		return accessRightsReference;
	}
	
	public String getNotificationChannelReference() {
		return notificationChannelReference;
	}
}