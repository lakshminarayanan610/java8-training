package com.sample;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamSamplePrograms {

	public static void main(String[] args) {
		String input = "lakshminarayanan";
		
		Map<String, Long> count = Arrays.stream(input.split(""))
		      .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		System.out.println("Count" + count);
		
		
		int[] numbers = {5, 9, 11, 2, 8, 21, 1};
		
		List<String> startsWith = Arrays.stream(numbers)
		.boxed()
		.map(s -> Integer.toString(s))
		.filter(s -> s.startsWith("1"))
		.collect(Collectors.toList());
		
		System.out.println("startsWith" + startsWith);
		
		Arrays.stream(numbers).boxed().sorted(Comparator.comparing(null, null).reversed());
		          
				

	}

}
