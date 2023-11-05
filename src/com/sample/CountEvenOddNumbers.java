package com.sample;

public class CountEvenOddNumbers {

	public static void main(String[] args) {
		
		int num = 1234568;
		System.out.println("Int " + num/10);
		int oddCount = 0;
		int evenCount = 0;
		int numCheck = 0;
		
		while(num>0) {
			numCheck = num%10;
			if (numCheck%2 == 0) {
				evenCount++;
			} else {
				oddCount++;
			}
			num = num/10;
		}
		 System.out.println("Even number count " + evenCount);
		 System.out.println("Odd number count " + oddCount);
	}
	
}
