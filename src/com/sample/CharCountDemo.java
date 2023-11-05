package com.sample;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharCountDemo {

	public static void main(String[] args) {
		String input = "ilovejavatechie";
		
		Map<String,Long> count = Arrays.stream(input.split(""))
		      .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(count);

	}

}
