package com.designpatterns.decoratorpattern.starbucks;

public class SteamedMilk extends CondimentDecorator {

	Beverage beverage;
	
	public SteamedMilk(Beverage beverage) {
		this.beverage=beverage;
	}
	
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return beverage.getDescription()+",SteamedMilk";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return beverage.cost()+0.10;
	}

}
