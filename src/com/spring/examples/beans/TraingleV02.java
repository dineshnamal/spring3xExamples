package com.spring.examples.beans;

/*
 * Setter Injection
 */
public class TraingleV02 {
	private String type;

	public void setType(String type) {
		this.type = type;
	}

	public void draw() {
		System.out.println("Draw " + this.type);
	}

}
