package com.tnsif.uncheckeddemo;

public class UncheckedException {

	public static void main(String[] args) {
		
		//declare array
		int x[];
		try {
		x= new int[] {10,20,30,40,12};
		System.out.println(x[10]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.err.println("specified index does not exist"+e.getMessage());
		}
		finally {
			System.out.println("finally");
		}
		
	}

}
