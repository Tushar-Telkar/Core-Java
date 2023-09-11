package com.tnsif.builtinannotations;

import java.util.*;

public class PredefinedAnnotationsDemo {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		
		List s=new ArrayList();
		s.add(12);
		s.add(12.6f);
		s.add(new Student (101,"Tushar","CSE"));
		s.add("Abc");
		
		List<Student> s1=new ArrayList<>();
		s1.add(new Student(102,"Sandy","Bio"));
		
		System.out.println(s);
		System.out.println(s1);
		s.forEach(System.out::println);
	}

}
