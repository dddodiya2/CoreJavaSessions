package com.learning;

public abstract class Vehicle{
	
	
	double weightOfVehicle;
	String classOfVehicle;
	
	public static void doSome() {
		
	}
	
	public abstract void applyBreaks() ;
	
	public void displayVehicleInfo() {
		System.out.println("This is the vehicle");
	}
	
}