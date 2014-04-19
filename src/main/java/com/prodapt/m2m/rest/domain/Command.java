/* 
* @Author: Gowri Gary Shankar
* @Date:   2014-04-15 19:27:23
* @Last Modified by:   Gowri Gary Shankar
* @Last Modified time: 2014-04-15 20:17:34
*/

package com.prodapt.m2m.rest.domain;

import java.util.Date;

public class Command {
	
	private String commandId;	
	private Date creationTime;
	private Date lastModifiedTime;
	private String commandType;
	private boolean execEnable;
	private String description;
	private String execInstancesReference;
	private String subscriptionsReference;
	private int command;
	
	
	public String getCommandId() {
		return commandId;
	}
	public Date getCreationTime() {
		return creationTime;
	}
	public Date getLastModifiedTime() {
		return lastModifiedTime;
	}
	public String getCommandType() {
		return commandType;
	}
	
	public boolean getExecEnable() {
		return execEnable;
	}
	public String getDescription() {
		return description;
	}
	public String getExecInstancesReference() {
		return execInstancesReference;
	}
	public String getSubscriptionsReference() {
		return subscriptionsReference;
	}
	public int getCommand() {
		return command;
	}
}