package com.tnsif.builtInObjects;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		List lst1=new ArrayList(); //dynamic binding
		
		System.out.println(lst1.isEmpty());
		
		lst1.add(10);
		lst1.add(20);
		lst1.add("Tushar");
		lst1.add(true);
		lst1.add(145.4f);
		lst1.add(4,3);
		System.out.println("List : "+lst1);
		System.out.println(lst1.isEmpty());
		System.out.println(lst1.size());
	}

}
