package com.tnsif.runtime;

public class RateOfInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RBI rate;
		
		rate=new RBI();
		System.out.println(rate.rateOfInterest());
		
		
	  rate=new Axis(); 
	  System.out.println(rate.rateOfInterest());
	  
	  rate=new HDFC(); 
	  System.out.println(rate.rateOfInterest());
	  
	  rate=new SBI(); 
	  System.out.println(rate.rateOfInterest());
		 
	}

}
