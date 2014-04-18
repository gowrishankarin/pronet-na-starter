package com.prodapt.m2m.da;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.prodapt.m2m.rest.domain.Command;

@Controller
public class GreetingController {
	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();

	//Ensures HTTP requests to /greeting mapped to greeting()
	@RequestMapping("/greeting") 
	// ResponseBody ensures the return is not a view(html) but Greeting object is written out directly
	public @ResponseBody Greeting greeting( 
		@RequestParam(value="name", required=false, defaultValue="World") String name) {
			return new Greeting(
				counter.incrementAndGet(),
				String.format(template, name)
				);
	}

	@RequestMapping(value = {"/pronet/applications/{appId}/containers/{containerId}/commands"},
		method = RequestMethod.POST)
	public ResponseEntity<String> receiveCommand(
		@PathVariable String appId,
		@PathVariable String containerId,
		@RequestBody Command command) {



		return new ResponseEntity<String>("Success Guaranteed", HttpStatus.OK);

	}
}

