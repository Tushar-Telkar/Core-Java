package com.tnsif.runtime;

public class RBI {

	public float rateOfInterest()
	{
		return 5.2f;
	}
}
class Axis extends RBI {

	public float rateOfInterest()
	{
		return 10.2f;
	}
}
class HDFC extends RBI {

	@Override
	public String toString() {
		return "HDFC [rateOfInterest()=" + rateOfInterest() + "]";
	}

	public float rateOfInterest()
	{
		return 15.2f;
	}
}
class SBI extends RBI {

	public float rateOfInterest()
	{
		return 4.2f;
	}
}