/* 
* @Author: Gowri Gary Shankar
* @Date:   2014-04-19 09:04:42
* @Last Modified by:   Gowri Gary Shankar
* @Last Modified time: 2014-04-19 09:33:54
*/

package com.prodapt.m2m.na.events;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import reactor.core.Reactor;
import reactor.event.Event;

@Service
public class EventProcessor {
    
	@Autowired
	Reactor reactor;

	public void commandReceivedEvent(int command) throws InterruptedException {

		reactor.notify("events", Event.wrap(command));
	}
}