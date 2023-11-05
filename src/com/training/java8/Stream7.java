package com.training.java8;

import java.util.Arrays;

public class Stream7 {

	public static void main(String[] args) {
		int[] numbers = {5,9,11,2,8,21,1,111};
		
		int sum = Arrays.stream(numbers)
				        .sum();
		System.out.println("sum: " + sum);

	}

}
