package com.designpatterns.decoratorpattern.starbucks;

public class Decaf extends Beverage {

	public Decaf() {
		description="Espresso";
	}
	
	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 1.99;
	}
	
	
}
