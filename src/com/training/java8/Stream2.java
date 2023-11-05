package com.training.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Stream2 {

	public static void main(String[] args) {
		String input = "lakshminarayanan";
		
		List<String> duplicate = Arrays.stream(input.split(""))
		       .collect(Collectors.groupingBy(s->s, Collectors.counting()))
		       .entrySet()
		       .stream()
		       .filter(s -> s.getValue()>1)
		       .map(Map.Entry::getKey)
		       .collect(Collectors.toList());
		       
		System.out.println("duplicate" +duplicate);
		
		List<String> unique = Arrays.stream(input.split(""))
			       .collect(Collectors.groupingBy(s->s, Collectors.counting()))
			       .entrySet()
			       .stream()
			       .filter(s -> s.getValue()==1)
			       .map(e -> e.getKey())
			       .collect(Collectors.toList());
			       
			System.out.println("Unique" +unique);
			
			
			Map<Object, Object> mapValue = Arrays.stream(input.split(""))
		       .collect(Collectors.groupingBy(s->s, Collectors.counting()))
		       .entrySet()
		       .stream()
		       .filter(s -> s.getValue()>1)
		       .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
			
			System.out.println("map: "+mapValue);

	}

}
