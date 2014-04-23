package com.prodapt.m2m.na;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.prodapt.m2m.na.core.ContentInstanceInfo;
import com.prodapt.m2m.na.core.NetworkApp;
import com.prodapt.m2m.na.events.Publisher;
import com.prodapt.m2m.rest.domain.Command;
import com.prodapt.m2m.rest.domain.ContentInstance;

@Controller
public class NetworkController {
	
	@Autowired
	private Publisher publisher;

	private NetworkApp networkApp = null;

	@RequestMapping(value = {"/pronet-na-starter/applications/{appId}/containers/{deviceId}/contentinstances"},
		method = RequestMethod.POST)
	public ResponseEntity<String> receiveDeviceParams(
		@PathVariable String appId,
		@PathVariable String deviceId,
		@RequestBody ContentInstance contentInstance) {

		try {
			ContentInstanceInfo contentInstanceInfo 
				= new ContentInstanceInfo(appId, deviceId, contentInstance);
			
			publisher.contentInstanceReceivedEvent(contentInstanceInfo);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new ResponseEntity<String>("Success Guaranteed", HttpStatus.OK);

	}

	@RequestMapping(value = "/pronet-na-starter/configure", 
		method = RequestMethod.GET)
	public ResponseEntity<String> configure(
		@RequestParam(value = "m2mPoC", required=true) String m2mPoC,
		@RequestParam(value = "appId", required=true) String appId) {

		if(null == networkApp) {
			networkApp = new NetworkApp();
			networkApp.init(appId, m2mPoC);
			return new ResponseEntity<String> (
				"Network Application Configured Successfully", HttpStatus.OK);
		} else {
			return new ResponseEntity<String> (
				"NA Reconfiguration Forbidden", HttpStatus.FORBIDDEN);
		}
	}

	@RequestMapping(value = "/pronet-na-starter/send-command/{deviceId}", 
		method = RequestMethod.GET)
	public ResponseEntity<String> sendCommand(
		@PathVariable String deviceId,
		@RequestParam(value = "command", required=true) String commandId) {

		if(networkApp != null && true == networkApp.isCreated()) {

			Command command = networkApp.sendDeviceCommand(deviceId);

			System.out.println("Device Id: " + deviceId + " Command Reference: " + 
				command.getCommand());
			
			return new ResponseEntity<String> ("Device Id: " + deviceId + 
				" Command Reference: " + command.getCommand(), HttpStatus.OK);

		} else {

			if(null == networkApp) {

				return new ResponseEntity<String> (
					"Add Device Forbidden, Configure NA Simulator", 
						HttpStatus.FORBIDDEN);
			} else {
				return new ResponseEntity<String> (
					"Device Exists , Device Id: " + deviceId, 
						HttpStatus.FORBIDDEN);
			}
		}
	}
}

