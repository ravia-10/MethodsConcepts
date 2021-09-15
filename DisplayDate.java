package com.xworkz.methods;

import java.util.Date;

public class DisplayDate {

	public static void displayDate() {
		System.out.println((new Date()));//"new" is  keyword,
	}

	public static void main(String[] args) {
		System.out.println("Beginning of program");
		System.out.println();
		DisplayDate.displayDate();
		System.out.println();
		System.out.println("End of program");
	}

}
