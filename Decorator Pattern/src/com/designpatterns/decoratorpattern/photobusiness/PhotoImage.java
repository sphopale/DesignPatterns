package com.designpatterns.decoratorpattern.photobusiness;

public class PhotoImage {

	String title;
	
	String fileName;
	
	int pixWidth, pixHeight;
	
	public PhotoImage() {
		
	}
	
	public PhotoImage(String title, String fileName) {
		super();
		this.title=title;
		this.fileName=fileName;
	}
	
	public String getDescription() {

		return getTitle();

	}



	/** Default toString() just uses getDescription */

	@Override

	public String toString() {

		return getDescription();

	}



	public String getTitle() {

		return title;

	}



	public void setTitle(String title) {

		this.title = title;

	}



	public String getFileName() {

		return fileName;

	}



	public void setFileName(String fileName) {

		this.fileName = fileName;

	}



	public int getPixWidth() {

		return pixWidth;

	}



	public void setPixWidth(int width) {

		this.pixWidth = width;

	}



	public int getPixHeight() {

		return pixHeight;

	}



	public void setPixHeight(int height) {

		this.pixHeight = height;

	}


}
