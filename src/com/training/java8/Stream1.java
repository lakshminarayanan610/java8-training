package com.training.java8;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Stream1 {

	public static void main(String[] args) {
		String input = "lakshminarayanan";
		
		Map<String, Long> countMap = Arrays.stream(input.split(""))
		      .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		System.out.println("countMap: " + countMap);
		      

	}

}
