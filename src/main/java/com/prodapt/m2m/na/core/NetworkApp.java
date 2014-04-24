/* 
* @Author: Gowri Gary Shankar
* @Date:   2014-04-19 12:45:13
* @Last Modified by:   Gowri Gary Shankar
* @Last Modified time: 2014-04-19 12:51:20
*/
package com.prodapt.m2m.na.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.prodapt.m2m.rest.domain.Application;
import com.prodapt.m2m.rest.domain.Command;


@Component
public class NetworkApp {

	@Autowired
    RestTemplate restTemplate;

	private String appId;
	private boolean isCreated;
	private String m2mPoC;

	public Application createApplication() {
		Application newApp = new Application();
		return newApp;
	}

	public NetworkApp() {
		this.isCreated = false;
	}
	
	public void init(String appId, String m2mPoC) {
		this.appId = appId;
		this.m2mPoC = m2mPoC;
		this.isCreated = true;
	}
	
	public boolean isCreated() {
		return isCreated;
	}
	
	public String getAppId() {
		return appId;
	}

	
/*
	public Container createContainer() {

		Container device = new Container();
		
		HttpEntity<Container> deviceEntity = new HttpEntity<Container>(device);
			
		String deviceLocationAtm2mPoC = m2mPoC + "/pronet/applications/" + 
			appId + "/containers";
			
		ResponseEntity<Container> newDeviceEntity = restTemplate.postForEntity(
			deviceLocationAtm2mPoC, deviceEntity, Container.class);
			
		Container newDevice = newDeviceEntity.getBody();
		String deviceId = newDevice.getContainerId();

		this.deviceId = deviceId;

		System.out.println("Device Id: " + deviceId);
		
		return newDevice;

	}
*/
	public Command sendDeviceCommand(String deviceId) {

		Command command = new Command();
		command.setCommand(1927);

		HttpEntity<Command> commandEntity
			= new HttpEntity<Command> (command);

		String commandAtm2mPoC = m2mPoC + "/pronet/applications/" + 
			appId + "/containers/" + deviceId + "/commands";
	
		ResponseEntity<Command> newCommandEntity = 
			restTemplate.postForEntity(commandAtm2mPoC, commandEntity, 
				Command.class);
	
		Command newCommand = newCommandEntity.getBody();

		System.out.println("Device Id: " + deviceId + " Reading Reference: " + 
			newCommand.getCommandId());
		
		return newCommand;

	}

	
}