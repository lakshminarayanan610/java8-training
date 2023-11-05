package com.sample;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamDemo2 {

	public static void main(String[] args) {
		
		 List<Integer> listInteger = Arrays.asList(22,33,222,234,542,432,123,238,28);
		 
		 listInteger.stream()
		            .map(s -> Integer.toString(s))
		            .filter(s -> s.startsWith("2"))
		            .forEach(System.out::println);
		 
		 List<Integer> duplicateList = Arrays.asList(1,2,3,11,22,1,22,33,44,33,22,1,44);
		 
		 List<Integer> duplicateLists = duplicateList.stream()
		              .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
		              .entrySet()
		              .stream()
		              .filter(s -> s.getValue() > 1)
		              .map(s -> s.getKey())
		              .collect(Collectors.toList());
		              
		 System.out.println("duplicateLists" + duplicateLists);
		 
		 Set<Integer> duplicateLists2 = duplicateList.stream()
				                         .filter(e -> Collections.frequency(duplicateList, e)>1)
				                         .collect(Collectors.toSet());
	              
	 System.out.println("duplicateLists2" + duplicateLists2);
	 
	 int max = duplicateList.stream().max(Comparator.comparing(Integer::valueOf)).get();
	 System.out.println("max " + max); 
	 
	 int min = duplicateList.stream().min(Comparator.comparing(Integer::valueOf)).get();
	 System.out.println("min " + min); 
	 
	 int secondHighest = duplicateList.stream().distinct().sorted(Collections.reverseOrder()).skip(1).findFirst().get();
	 System.out.println("secondHighest " + secondHighest); 
	 
	 int secondLowest = duplicateList.stream().distinct().sorted().skip(1).findFirst().get();
	 System.out.println("secondLowest " + secondLowest); 
	}

}
