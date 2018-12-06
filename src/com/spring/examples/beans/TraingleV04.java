package com.spring.examples.beans;

/*
 * Constructor Injection
 */
public class TraingleV04 {
	private Point04 pointA;
	private Point04 pointB;
	private Point04 pointC;

	public Point04 getPointA() {
		return pointA;
	}

	public void setPointA(Point04 pointA) {
		this.pointA = pointA;
	}

	public Point04 getPointB() {
		return pointB;
	}

	public void setPointB(Point04 pointB) {
		this.pointB = pointB;
	}

	public Point04 getPointC() {
		return pointC;
	}

	public void setPointC(Point04 pointC) {
		this.pointC = pointC;
	}
	
	public void draw() {
		
		System.out.println(" POINT A (" + pointA.getX() + " , " + pointA.getY() +")");
		System.out.println(" POINT B (" + pointB.getX() + " , " + pointB.getY() +")");
		System.out.println(" POINT C (" + pointC.getX() + " , " + pointC.getY() +")");
	}
	

}
