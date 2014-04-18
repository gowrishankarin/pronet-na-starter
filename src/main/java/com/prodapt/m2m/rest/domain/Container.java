package com.prodapt.m2m.rest.domain;

import java.util.ArrayList;
import java.util.Date;

public class Container {

	private String key;
	
	private String containerId;
	private String accessRightID;
	private ArrayList<String> searchStrings;
	private Date creationTime;
	private Date lastModifiedTime;
	private int maxNrOfInstances;
	private String contentInstancesReference;
	private String subscriptionReference;
	
	public String getKey() {
		return key;
	}
	
	public String getContainerId() {
		return containerId;
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
	public int getMaxNrOfInstances() {
		return maxNrOfInstances;
	}
	public String getContentInstancesReference() {
		return contentInstancesReference;
	}
	public String getSubscriptionReference() {
		return subscriptionReference;
	}
/*
	public ContainerDetails toContainerDetails(final String containerId) { 
		ContainerDetails details = new ContainerDetails();

		details.setContainerId(containerId);
		details.setAccessRightID(accessRightID);
		details.setSearchStrings(searchStrings);
		details.setCreationTime(creationTime);
		details.setLastModifiedTime(lastModifiedTime);
		details.setMaxNrOfInstances(maxNrOfInstances);
		details.setContentInstancesReference(contentInstancesReference);
		details.setSubscriptionReference(subscriptionReference);

		return details;


	}

	public static Container fromContainerDetails(
		ContainerDetails containerDetails) {

		Container container = new Container();

		container.containerId = containerDetails.getContainerId();
		container.accessRightID = containerDetails.getAccessRightID();
		container.searchStrings = containerDetails.getSearchStrings();
		container.creationTime = containerDetails.getCreationTime();
		container.lastModifiedTime = containerDetails.getLastModifiedTime();
		container.maxNrOfInstances = containerDetails.getMaxNrOfInstances();
		container.contentInstancesReference
			= containerDetails.getContentInstancesReference();
		container.subscriptionReference
			= containerDetails.getSubscriptionReference();	

		return container;

	}
	*/
}