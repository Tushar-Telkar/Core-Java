package com.tnsif.customannotation;

@SmartTV(height = 50, os = "Oreo", width = 55)
@SmartPhone(os="Mac",version=2)
public class AndroidSeries {

	String modelNo;
	
	int screenSize;

	public AndroidSeries(String modelNo, int screenSize) {
		super();
		this.modelNo = modelNo;
		this.screenSize = screenSize;
	}
	
	
}
