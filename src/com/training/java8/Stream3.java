package com.training.java8;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Stream3 {

	public static void main(String[] args) {
		String input = "lakshminarayanan";
		
		String nonRepeat = Arrays.stream(input.split(""))
		      .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
		      .entrySet()
		      .stream()
		      .filter(e -> e.getValue()==1)
		      .map(e -> e.getKey())
		      .findFirst()
		      .get();
		
		System.out.println("nonRepeat: " + nonRepeat);
		     


		String repeat = Arrays.stream(input.split(""))
		      .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
		      .entrySet()
		      .stream()
		      .filter(e -> e.getValue()>1)
		      .map(e -> e.getKey())
		      .findFirst()
		      .get();
		
		System.out.println("repeat: " + repeat);
	}

}
