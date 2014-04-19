/* 
* @Author: Gowri Gary Shankar
* @Date:   2014-04-19 09:34:03
* @Last Modified by:   Gowri Gary Shankar
* @Last Modified time: 2014-04-19 09:35:42
*/

package com.prodapt.m2m.da.events;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prodapt.m2m.da.core.CommandInfo;

import reactor.event.Event;
import reactor.function.Consumer;


@Service
public class Receiver implements Consumer<Event<CommandInfo>> {

	
	@Autowired
	EventProcessor eventProcessor;
	
	public void accept(Event<CommandInfo> ev) {
		
		CommandInfo commandInfo = ev.getData();
		
		System.out.println("New Command Received.......");
		
		System.out.println("Command Id: " + commandInfo.getCommand().getCommand());

		System.out.println("App Id: " + commandInfo.getAppId());
		System.out.println("Device Id: " + commandInfo.getDeviceId());
		System.out.println("Time of Issue: " + commandInfo.getCommand().getCreationTime());
		System.out.println("Recieved Time: " + commandInfo.getReceivedTime());
		
		
		System.out.println("-----------------------------");
		System.out.println();
		
	}
}