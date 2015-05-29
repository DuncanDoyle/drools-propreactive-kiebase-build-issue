package org.jboss.ddoyle.drools.propreactive.model;

public class Event1 {
	
	private int id;
	private String code;
	
	private long timestamp;
	
	public Event1(String code, int id) {
		this.code = code;
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public int getId() {
		return id;
	}

	public long getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setCode(String code) {
		this.code = code;
	}
	
	
	
	
}
