/* 
* @Author: Gowri Gary Shankar
* @Date:   2014-04-19 12:45:13
* @Last Modified by:   Gowri Gary Shankar
* @Last Modified time: 2014-04-19 12:51:20
*/
package com.prodapt.m2m.da.core;

import com.prodapt.m2m.rest.domain.Application;
import com.prodapt.m2m.rest.domain.Command;
import com.prodapt.m2m.rest.domain.Container;


public class NetworkApp {

	public Application createApplication() {

		Application newApp = new Application();
		
		return newApp;

	}

	public Container createDevice() {

		Container newContainer = new Container();
		
		return newContainer;

	}

	public Command sendDeviceCommand() {

		Command command = new Command();
		
		return command;

	}
}