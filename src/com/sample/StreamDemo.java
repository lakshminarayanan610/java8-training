package com.sample;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamDemo {

	public static void main(String[] args) {

     List<Integer> listInteger = Arrays.asList(1,2,3,4,5,6,7,8);
     Optional<Integer> sum = listInteger.stream().reduce((a,b) -> a+b);
       
     System.out.println("sum: " + sum.get());
     
     Double average = listInteger.stream().mapToInt(e -> e).average().getAsDouble();
     
     System.out.println("average: " + average);
     
     List<Integer> listInteger2 = Arrays.asList(1,10,20,30,40,50,60);
     
     Double average1 = listInteger2.stream()
    		           .map(s -> s*s)
    		           .filter(s -> s>100)
    		           .mapToInt(s -> s)
    		           .average()
    		           .getAsDouble();
     
     System.out.println("average1: " + average1);
     
     List<Integer> toFindOddOrEven = Arrays.asList(3,4,4,20,30,21,31,61,51);
      
     List<Integer> oddList = toFindOddOrEven.stream()
    		                  .filter(n -> n%2==1)
    		                  .collect(Collectors.toList());
     
     System.out.println("oddList: " + oddList);
     
     List<Integer> evenList = toFindOddOrEven.stream()
             .filter(n -> n%2==0)
             .collect(Collectors.toList());
     
     System.out.println("evenList: " + evenList);
     
     Long oddCount = toFindOddOrEven.stream()
             .filter(n -> n%2==1)
             .collect(Collectors.counting());

      System.out.println("oddCount: " + oddCount);

      Long evenCount = toFindOddOrEven.stream()
         .filter(n -> n%2==0)
           .collect(Collectors.counting());

           System.out.println("evenCount: " + evenCount);
           
           Map<Integer,Long> evenMap = toFindOddOrEven.stream()
        	         .filter(n -> n%2==0)
        	           .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
           
           System.out.println("evenMap: " + evenMap);
	}

}
