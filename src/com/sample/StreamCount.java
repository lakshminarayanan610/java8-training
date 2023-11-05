package com.sample;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamCount {

	public static void main(String[] args) {
		String input = "Lakshminarayanan";
			
		Map<String, Long> map = Arrays.stream(input.split(""))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		System.out.println("map: " + map);
		
		List<String> duplicate = Arrays.stream(input.split(""))
		.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
		.entrySet()
		.stream()
		.filter(x -> x.getValue() > 1)
		.map(x -> x.getKey())
		.collect(Collectors.toList());

        System.out.println("duplicate: " + duplicate);
        
        List<String> unique = Arrays.stream(input.split(""))
        		.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
        		.entrySet()
        		.stream()
        		.filter(x -> x.getValue() == 1)
        		.map(Map.Entry::getKey)
        		.collect(Collectors.toList());

                System.out.println("unique: " + unique);
                
                
        String findFirstUnique =  Arrays.stream(input.split(""))
        		.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
        		.entrySet()
        		.stream()
        		.filter(x -> x.getValue() == 1)
        		.findFirst()
        		.get().getKey();
                
                System.out.println("findFirstUnique: " + findFirstUnique);
                
        String findFirstDuplicate =  Arrays.stream(input.split(""))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(x -> x.getValue() > 1)
                .findFirst()
                .get().getKey();
                       
                System.out.println("findFirstDuplicate: " + findFirstDuplicate);
                        
        int[] numbers = {5, 9,21, 11, 2,2, 8, 21, 1};
                        
        Integer secondHighest = Arrays.stream(numbers)
                .boxed()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .get();
                        
                System.out.println("secondHighest: " + secondHighest);
                        
        Integer secondLowest = Arrays.stream(numbers)
                .boxed()
                .distinct()
                .sorted()
                .skip(1)
                .findFirst()
                .get();
                                
                System.out.println("secondLowest: " + secondLowest);
                                
        String[] strArray = {"java", "lakshmi", "microservices", "springboot", "lakshminarayanan"};
                                
        String longestString = Arrays.stream(strArray)
           		.reduce((word1, word2) -> word1.length() > word2.length() ? word1 : word2)
           		.get();
                                
                System.out.println("longestString: " + longestString);
                                
        List<String> starstWith = Arrays.stream(numbers)
                 .boxed()
                 .map(s -> Integer.toString(s))
                 .filter(s -> s.startsWith("2"))
                 .collect(Collectors.toList());
                    
                System.out.println("starstWith: " + starstWith);
                    
        List<String> nos = Arrays.asList("1", "2", "3", "4");
                    
        String results = String.join("-", nos);
                    
                System.out.println("results: " + results);
                    
        IntStream.range(1, 10)
                .skip(1)
                .limit(8)
                .forEach(System.out::println);
	}
}
