/* 
* @Author: Gowri Gary Shankar
* @Date:   2014-04-19 09:34:03
* @Last Modified by:   Gowri Gary Shankar
* @Last Modified time: 2014-04-19 09:36:04
*/

package com.prodapt.m2m.da.events;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prodapt.m2m.da.core.ContentInstanceInfo;

import reactor.core.Reactor;
import reactor.event.Event;

@Service
public class Publisher {
    
	@Autowired
	Reactor reactor;

	public void contentInstanceReceivedEvent(ContentInstanceInfo contentInstanceInfo) throws InterruptedException {

		reactor.notify("events", Event.wrap(contentInstanceInfo));
	}
}