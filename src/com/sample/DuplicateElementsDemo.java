package com.sample;

import java.security.KeyStore.Entry;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateElementsDemo {

	public static void main(String[] args) {
		String input = "ilovejavatechie";
		
		List<String> duplicateElement = Arrays.stream(input.split(""))
		      .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
              .entrySet()
              .stream()
              .filter(s -> s.getValue()>1)
              .map(s -> s.getKey())
              .collect(Collectors.toList());
		
		System.out.println(duplicateElement);
              
	}

}
