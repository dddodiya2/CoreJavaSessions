package com.learning.staticDemo;

public class DateUtils extends Utils{

	public static String giveDate() {
		System.out.println("DateUtils class static method is called");
		return "1-Dec-2022";
	}
	
	public void checkMethod() {
		System.out.println("DateUtils class non-static method is called");
	}
	
}
