package com.training.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream6 {

	public static void main(String[] args) {
		int[] numbers = {5,9,11,2,8,21,1,111};
		
		List<String> startsWith = Arrays.stream(numbers)
		      .boxed()
		      .map(s -> Integer.toString(s))
		      .filter(s -> s.startsWith("1"))
		      .collect(Collectors.toList());
		
		System.out.println("startsWith:" +startsWith);

	}

}
