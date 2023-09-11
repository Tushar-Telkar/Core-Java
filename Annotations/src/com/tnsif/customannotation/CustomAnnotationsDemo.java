package com.tnsif.customannotation;

import java.lang.annotation.Annotation;

public class CustomAnnotationsDemo {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		AndroidSeries as=new AndroidSeries("POCO F1",20);
		System.out.println(as.modelNo);
		System.out.println(as.screenSize);

		System.out.println("SmartPhone Details");
		
		@SuppressWarnings("rawtypes")
		Class c=as.getClass();
		
		Annotation an=c.getAnnotation(SmartPhone.class);
		SmartPhone s=(SmartPhone)an;
		System.out.println(s.os());
		System.out.println(s.version());
		
		System.out.println("SmartTV Details");
		
		@SuppressWarnings("rawtypes")
		Class c1=as.getClass();
		
		Annotation an1=c1.getAnnotation(SmartTV.class);
		SmartTV s1=(SmartTV)an1;
		System.out.println(s1.os());
		System.out.println(s1.width());
		System.out.println(s1.height());
	}

}
