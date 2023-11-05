package com.training.java8.second;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Counting {

	public static void main(String[] args) {
		String input = "lakshminarayanan";
		
		Map<Object, Long> occurance = Arrays.stream(input.split(""))
		      .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println("map " + occurance);

	}

}
