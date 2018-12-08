package com.designpatterns.decoratorpattern.photobusiness;

public class DigitalImage extends ImageDecorator {
	StockAgency agency;
	boolean exclusive;
	double sellingPrice;
	
	public DigitalImage(PhotoImage target, StockAgency agency, double sellingPrice) {
		super(target);
		this.agency=agency;
		this.sellingPrice=sellingPrice;
	}
	
	public String getDescription() {
		return target.getDescription() + ", Digital Rights via " + agency;
	}
}
