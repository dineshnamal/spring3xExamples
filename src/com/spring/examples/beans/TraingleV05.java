package com.spring.examples.beans;

/*
 * Constructor Injection
 */
public class TraingleV05 {
	private Point05 pointA;
	private Point05 pointB;
	private Point05 pointC;
	
	public TraingleV05(Point05 a,Point05 b , Point05 c) {
		this.pointA =a;
		this.pointB = b;
		this.pointC = c;
	}

	
	
	public void draw() {
		
		System.out.println(" POINT A (" + pointA.getX() + " , " + pointA.getY() +")");
		System.out.println(" POINT B (" + pointB.getX() + " , " + pointB.getY() +")");
		System.out.println(" POINT C (" + pointC.getX() + " , " + pointC.getY() +")");
	}
	

}
