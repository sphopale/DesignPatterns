package com.designpatterns.decoratorpattern.photobusiness;

public class ImageSales {

	public static void main(String[] args) {
		
		final PhotoImage image=new PhotoImage("Sunset at Tres Ríos", "2020/ifd12345.jpg");
		
		Print im1=new Print(11,8.5,image);
		addToPrintOrder(im1);
		
		PhotoImage frameimage=new PhotoImage("Goodbye at the Station", "1968/ifd.00042.jpg");
		frameimage=new Mat("Lime Green",frameimage);
		frameimage=new Frame(frameimage);
		
		Print im2=
				new Print(19,11,frameimage);
		
		addToPrintOrder(im2);
		
		PhotoImage dig = new DigitalImage(image, StockAgency.Getty, 135.00);

		System.out.println(dig);
					
	}
	
	private static void addToPrintOrder(Print image) {
		System.out.println(image);
	}
	
}
