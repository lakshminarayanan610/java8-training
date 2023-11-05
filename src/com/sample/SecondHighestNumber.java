package com.sample;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class SecondHighestNumber {

	public static void main(String[] args) {
		int[] number = {5, 9, 11, 2, 8, 21, 1};
		
		int secondHighest = Arrays.stream(number)
				            .boxed()
				            .sorted(Comparator.reverseOrder())
				            .skip(2)
				            .findFirst()
				            .get();
		
		System.out.println(secondHighest);
		

	}

}
