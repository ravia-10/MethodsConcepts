package com.xworkz.methods;

public class TollGate {

	public static void closedGate() {
		System.out.println("gate is closed ,please pay the amount .....");
	}

	public static void Pay() {
		System.out.println("amount is paid ......");
	}

	public static void openGate() {
		System.out.println("gate is opened You may goo.....");
	}

	public static void main(String[] args) {
		TollGate.closedGate();
		System.out.println();
		TollGate.Pay();
		System.out.println();
		TollGate.openGate();
	}

}
