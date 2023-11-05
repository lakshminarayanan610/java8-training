package com.sample;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class MapObjectSorting {

	public static void main(String[] args) {
		Map<Employee, Integer> employeeMap = new HashMap<>();
		employeeMap.put(new Employee(176, "Roshan", "IT", 60000), 60);
		employeeMap.put(new Employee(144, "Bikash", "CORE", 90000), 50);
		employeeMap.put(new Employee(127, "Bimal", "DEFENSE", 50000), 40);
		employeeMap.put(new Employee(288, "Sourav", "CIVIL", 40000), 90);
		employeeMap.put(new Employee(112, "Lakshmi", "ELECTRIC", 120000), 120);
		
		employeeMap.entrySet().stream()
		           .sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getId).reversed()))
		           .forEach(System.out::println);

	}

}
