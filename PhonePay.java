package com.xworkz.methods;

public class PhonePay {

	public static void moneyTransfer() {
		System.out.println("Successfully Transfered to account!!!!");
	}

	public static void mobileRecharge() {
		System.out.println("Successfully Recharged");
	}

	public static void bills() {
		System.out.println("Successfully paid for water bills....");
	}

	public static void main(String[] args) {

		System.out.println("Login successfully---");
		System.out.println();
		PhonePay.moneyTransfer();
		System.out.println();
		System.out.println("Logout .....");
	}

}
