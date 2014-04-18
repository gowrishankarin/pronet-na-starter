package com.prodapt.m2m.da;

public class Greeting {

	//http://spring.io/guides/gs/rest-service

	private final long id;
	private final String content;
	
	public Greeting(long id, String content) { 
		this.id = id;
		this.content = content;
	}

	public long get_id() {
		return this.id;
	}

	public String getContent() {
		return this.content;
	}
}

	

