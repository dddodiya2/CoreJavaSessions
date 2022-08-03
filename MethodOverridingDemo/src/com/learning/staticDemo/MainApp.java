package com.learning.staticDemo;

public class MainApp {

	public static void main(String[] args) {
		
		Utils u = new Utils();
		Utils.giveDate();
		u.giveDate();
		
		
		System.out.println("\n\nFor DateUtils = new DateUtils()");
		DateUtils d = new DateUtils();
		DateUtils.giveDate();
		d.giveDate();		
		
		System.out.println("\n\nFor Utils = new DateUtils()");
		Utils ud = new DateUtils();
		Utils.giveDate();
		DateUtils.giveDate();
		ud.giveDate();
//		ud.checkMethod();
		

	}

}
