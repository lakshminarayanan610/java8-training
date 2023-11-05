package com.sample;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class HighestPaidDemo {

	public static void main(String[] args) {
		List<Employee> employeeList = new ArrayList<>();
		employeeList.add(new Employee(176, "Roshan", "IT", 60000));
		employeeList.add(new Employee(144, "Bikash", "CORE", 90000));
		employeeList.add(new Employee(127, "Bimal", "CIVIL", 50000));
		employeeList.add(new Employee(288, "Sourav", "CIVIL", 40000));
		employeeList.add(new Employee(112, "Lakshmi", "ELECTRIC", 120000));
		
		Employee highestSalaryEmployee = employeeList.stream()
				                         .sorted((o1, o2) -> (int) o1.getSalary() - o2.getSalary())
				                         .findFirst()
				                         .get();
		
		System.out.println(highestSalaryEmployee);
		
		List<Employee> sortedList = employeeList.stream()
				                    .sorted(Comparator.comparing(Employee::getSalary, Comparator.reverseOrder()))
				                    .collect(Collectors.toList());
		
		System.out.println(sortedList);
		
		List<Employee> sortedList1 = employeeList.stream()
		            .sorted(Comparator.comparing(Employee::getSalary).reversed())
		            .collect(Collectors.toList());
		
		System.out.println(sortedList1);
		
		Employee maxEmplyee = employeeList.stream()
		            .collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary))).get();
		
		System.out.println(maxEmplyee);
		
		Employee minEmployee = employeeList.stream()
				               .collect(Collectors.minBy(Comparator.comparingInt(Employee::getSalary))).get();
		System.out.println(minEmployee);
		
		Map<String, Optional<Employee>> employeeList1 = employeeList.stream()
		            .collect(Collectors.groupingBy(Employee::getDept, 
		            		Collectors.maxBy(Comparator.comparing(Employee::getSalary))));
		
		employeeList1.forEach((key, value) -> System.out.println(key +"-"+ value.get()));
		
		System.out.println("toMap"+employeeList.stream()
		            .collect(Collectors.toMap(employee -> employee.getId() + "-" + employee.getName(),
		            		                   (employee -> employee))));
		
		System.out.println("mapping" + employeeList.stream()        
		                                           .collect(Collectors.groupingBy(Employee::getId,
		                                        		                          Collectors.mapping(Employee::getSalary, Collectors.toList()))));
		                                        
	}

}
