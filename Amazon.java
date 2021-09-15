package com.xworkz.methods;

public class Amazon {

	public static void Order() {
		System.out.println("order placed successfull :)");
	}

	public static void addToCart() {
		System.out.println("items are added to Cart ......");
	}

	public static void paymentmethod() {
		System.out
				.println("you can to payment by Phonepay,amazon pay,g-pay...");
	}

	public static void main(String[] args) {
		System.out.println("Login to Amazon is done successfully :)");
		System.out.println();
		Amazon.Order();
		Amazon.addToCart();
		Amazon.paymentmethod();
		System.out.println();
		System.out.println("logged out....");
	}

}
