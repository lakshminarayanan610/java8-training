package com.sample;

public class CountNumber {

	public static void main(String[] args) {
		int num = 1234512324;
		int count = 0;
		
		while(num>0) {
			num = num/10;
			count++;
		}
       System.out.println("Number count " + count);
	}

}
