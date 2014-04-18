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
	
	/*public ApplicationDetails toApplicationDetails(final String appId) {

		ApplicationDetails details =  new ApplicationDetails();
		details.setAppId(appId);
		details.setAccessRightID(accessRightID);
		details.setSearchStrings(searchStrings);
		details.setCreationTime(creationTime);
		details.setLastModifiedTime(lastModifiedTime);
		details.setaPoC(aPoC);
		details.setaPocPaths(aPocPaths);
		
		return details;

	}

	public static Application fromApplicationDetails(ApplicationDetails appDetails) {
		
		Application application = new Application();

		application.appId = appDetails.getAppId();
		application.accessRightID = appDetails.getAccessRightID();
		application.searchStrings = appDetails.getSearchStrings();
		application.creationTime = appDetails.getCreationTime();
		application.lastModifiedTime = appDetails.getLastModifiedTime();
		application.aPoC = appDetails.getaPoC();
		application.aPocPaths = appDetails.getaPocPaths();
		application.containersReference = appDetails.getContainersReference();
		application.groupsReference = appDetails.getGroupsReference();
		application.accessRightsReference = appDetails.getAccessRightsReference();
		application.notificationChannelReference = appDetails.getNotificationChannelReference();

		return application;
	}*/
}