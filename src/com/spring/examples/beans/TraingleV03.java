package com.spring.examples.beans;

/*
 * Constructor Injection
 */
public class TraingleV03 {
	private String type;
	private Integer height;
	
	public TraingleV03(String type , Integer height) {
		this.type = type;
		this.height = height;
	}

	public TraingleV03(String type) {
		this.type = type;
	}
	
	public TraingleV03(Integer height) {
		this.height = height;
	}

	public void draw() {
		System.out.println("Draw "+this.type + " height "+ this.height);
	}

}
