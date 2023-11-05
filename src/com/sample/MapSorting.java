package com.sample;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class MapSorting {

	public static void main(String[] args) {
		Map<String, Integer> unSortedMap = new HashMap<>();
		unSortedMap.put("Eight", 8);
		unSortedMap.put("Nine", 9);
		unSortedMap.put("Ten", 10);
		unSortedMap.put("One", 1);
		unSortedMap.put("Three", 3);
		unSortedMap.put("Five", 5);
		unSortedMap.put("Seven", 7);
		
		unSortedMap.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
		System.out.println(unSortedMap.entrySet().stream().sorted(Map.Entry.comparingByValue()).collect(Collectors.toMap(e->e.getKey(), e->e.getValue())));
	

	}

}
