package com.sample;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringFrequency {

	public static void main(String[] args) {
		String name = "lakshminarayanan";
		
		Map<String, Long> frequency = Arrays.stream(name.split(""))
		      .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		System.out.println(frequency);

	}

}
