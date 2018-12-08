package com.designpatterns.decoratorpattern.starbucks;

public class soy extends CondimentDecorator {

	Beverage beverage;
	
	public soy(Beverage beverage) {
		this.beverage=beverage;
	}
	
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return beverage.getDescription()+",Soy";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return beverage.cost()+0.15;
	}

}
