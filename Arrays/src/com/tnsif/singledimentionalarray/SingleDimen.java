package com.tnsif.singledimentionalarray;

import java.util.Arrays;

public class SingleDimen {

	public static void main(String[] args) {
		
		int arr[]= {10,30,40,50,452,71,45,1,2,12,0,-10};
		
		//print array
		System.out.println(Arrays.toString(arr));
		
		//sort
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		//binarysearch
		int key=50;
		System.out.println(Arrays.binarySearch(arr, key));
	}

}
