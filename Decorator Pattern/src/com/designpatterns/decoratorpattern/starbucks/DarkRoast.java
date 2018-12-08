package com.designpatterns.decoratorpattern.starbucks;

public class DarkRoast extends Beverage {

	public DarkRoast() {
		description="Espresso";
	}
	
	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 1.99;
	}
	
	
}
