package com.codingdojo.java.phone;

public class PhoneTester {

	public static void main(String[] args) {
		Galaxy s9 = new Galaxy("S12", 10, "Sprint", "Woo Woo Woo!");
		IPhone iPhoneX = new IPhone("XI", 100, "T-Mobile", "Ring ring ring!");
		
		s9.displayInfo();
		System.out.println(s9.ring());
		System.out.println(s9.unlock());
		
		iPhoneX.displayInfo();
		System.out.println(iPhoneX.ring());
		System.out.println(iPhoneX.unlock());
	}

}
