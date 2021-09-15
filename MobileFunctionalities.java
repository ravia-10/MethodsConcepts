package com.xworkz.methods;

import java.util.Date;

public class MobileFunctionalities {

	public static void Calls() {
		System.out.println("You got 2missed calls");
	}

	public static void Email() {
		System.out.println("checking....No!! emails ....");
	}

	public static void Songs() {
		System.out.println("Playing songs ---:)");
	}

	public static void Downloads() {
		System.out.println("files are downloaded successfully!!!");
	}

	public static void Clock() {
		System.out.println("present time is :");
		System.out.println(new Date());
	}

	public static void main(String[] args) {
		MobileFunctionalities.Calls();
//		MobileFunctionalities.Email();
//		MobileFunctionalities.Downloads();
//		MobileFunctionalities.Songs();
//		MobileFunctionalities.Clock();
	}

}
