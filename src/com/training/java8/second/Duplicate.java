package com.training.java8.second;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Duplicate {

	public static void main(String[] args) {
		String name = "deepikagayathrishruthi";
		
		Map<String, Long> duplicateMap = Arrays.stream(name.split(""))
		      .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
		      .entrySet()
		      .stream()
		      .filter(e -> e.getValue() > 1)
		      .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
		
		System.out.println("Duplicate Map " + duplicateMap);
		
		List<String> duplicateList = Arrays.stream(name.split(""))
		      .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
		      .entrySet()
		      .stream()
		      .filter(e -> e.getValue() > 1)
		      .map(e -> e.getKey())
		      .collect(Collectors.toList());
		System.out.println("Duplicate List " + duplicateList);

	}

}
