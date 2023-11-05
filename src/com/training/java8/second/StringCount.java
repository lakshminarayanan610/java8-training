package com.training.java8.second;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;

import static java.util.stream.Collectors.*;

public class StringCount {

	public static void main(String[] args) {
		String input = "ilovejavatechie";
		
		Map<Object, Object> countMap = Arrays.stream(input.split(""))
		      .collect(groupingBy(Function.identity(), counting()))
		      .entrySet()
		      .stream()
		      .collect(toMap(s -> s.getKey(), s -> s.getValue()));

		System.out.println("countMap" +countMap);
	}

}
