package com.sample;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StartsWithElement {

	public static void main(String[] args) {
		int[] number = {5, 9, 11, 2, 8, 21, 1};
		
		List<String> startsWith = Arrays.stream(number)
		      .boxed()
		      .map(s -> Integer.toString(s))
		      .filter(s -> s.startsWith("1"))
		      .collect(Collectors.toList());
		System.out.println(startsWith);

	}

}
