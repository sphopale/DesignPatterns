package com.designpatterns.decoratorpattern.photobusiness;

public class Print extends ImageDecorator {
	
	private double printWidth, printHeight;
	
	public Print(double printWidth, double printHeight, PhotoImage target) {
		super(target);
		this.printHeight=printHeight;
		this.printWidth=printWidth;
	}
	
	@Override

	public String getDescription() {

		return target.getDescription() + " " + String.format("(%4.1f x %4.1f in)", getPrintWidth(), getPrintHeight());

	}



	public double getPrintWidth() {

		return printWidth;

	}



	public void setPrintWidth(double printWidth) {

		this.printWidth = printWidth;

	}



	public double getPrintHeight() {

		return printHeight;

	}



	public void setPrintHeight(double printHeight) {

		this.printHeight = printHeight;

	}
}
