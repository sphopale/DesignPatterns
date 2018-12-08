package com.designpatterns.decoratorpattern.photobusiness;

public class Frame extends ImageDecorator {



	public Frame(PhotoImage target) {

		super(target);

	}



	@Override

	public String getDescription() {

		return target.getDescription() + ", Framed";

	}



}