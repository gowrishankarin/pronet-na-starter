package com.prodapt.m2m.da;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.prodapt.m2m.da.core.CommandInfo;
import com.prodapt.m2m.da.events.Publisher;
import com.prodapt.m2m.rest.domain.Command;

@Controller
public class DeviceController {
	
	@Autowired
	private Publisher publisher;

	@RequestMapping(value = {"/pronet/applications/{appId}/containers/{deviceId}/commands"},
		method = RequestMethod.POST)
	public ResponseEntity<String> receiveCommand(
		@PathVariable String appId,
		@PathVariable String deviceId,
		@RequestBody Command command) {

		try {
			CommandInfo commandInfo = new CommandInfo(appId, deviceId, command);
			
			publisher.commandReceivedEvent(commandInfo);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new ResponseEntity<String>("Success Guaranteed", HttpStatus.OK);

	}
}

