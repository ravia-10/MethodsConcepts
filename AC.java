package com.xworkz.methods;

public class AC {

	public static void on() {
		System.out.println("Ac is On");
	}

	public static void off() {
		System.out.println("Ac is turned off..");
	}

	public static void TemperatureIncreases() {
		System.out.println("Ac temperature is increasing....");
	}

	public static void TemperatureDecreasing() {
		System.out.println("Ac temperature is Decreasing....");
	}

	public static void main(String[] args) {
		AC.on();
		AC.TemperatureIncreases();
//		AC.TemperatureDecreasing();
//		AC.off();

	}

}
