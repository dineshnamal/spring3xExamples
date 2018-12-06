package com.spring.examples.beans;

/*
 * Constructor Injection
 */
public class TraingleV06 {
	private Point06 pointA;
	private Point06 pointB;
	private Point06 pointC;

	public Point06 getPointA() {
		return pointA;
	}

	public void setPointA(Point06 pointA) {
		this.pointA = pointA;
	}

	public Point06 getPointB() {
		return pointB;
	}

	public void setPointB(Point06 pointB) {
		this.pointB = pointB;
	}

	public Point06 getPointC() {
		return pointC;
	}

	public void setPointC(Point06 pointC) {
		this.pointC = pointC;
	}
	
	public void draw() {
		
		System.out.println(" POINT A (" + pointA.getX() + " , " + pointA.getY() +")");
		System.out.println(" POINT B (" + pointB.getX() + " , " + pointB.getY() +")");
		System.out.println(" POINT C (" + pointC.getX() + " , " + pointC.getY() +")");
	}
	

}
