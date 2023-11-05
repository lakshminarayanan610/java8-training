package com.sample;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int num = 1234567;
		
		int rev = 0;
		
		while(num!=0) {
			int reminder = num % 10;
			System.out.println("reminder: " +reminder);
			rev = rev * 10 + reminder;
			System.out.println("rev: " +rev);
			num = num/10;
			System.out.println("num: " +num);
		}
		System.out.println("reversed number: " +rev);
	}

}
