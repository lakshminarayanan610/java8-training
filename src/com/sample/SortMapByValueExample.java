package com.sample;

import java.util.*;
import java.util.stream.Collectors;

public class SortMapByValueExample {
    public static void main(String[] args) {
        // Create a sample map
        Map<String, Integer> unsortedMap = new HashMap<>();
        unsortedMap.put("Alice", 30);
        unsortedMap.put("Bob", 25);
        unsortedMap.put("Charlie", 35);
        unsortedMap.put("David", 28);
        unsortedMap.put("Dave", 32);

        // Sort the map by values in ascending order
        Map<String, Integer> sortedMap = unsortedMap.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e1,
                        LinkedHashMap::new // To maintain the order
                ));

        // Print the sorted map
        sortedMap.forEach((key, value) -> System.out.println(key + ": " + value));
    }
}
