package com.training.java8;

import java.util.Arrays;
import java.util.Comparator;

public class Stream4 {

	public static void main(String[] args) {
		int[] numbers = {5,9,11,2,8,21,1};
		
		Integer highest = Arrays.stream(numbers)
		      .boxed()
		      .sorted(Comparator.reverseOrder())
		      .skip(1)
		      .findFirst().get();
		
        System.out.println("secondhighest: " + highest);
        
        Integer secondLowest = Arrays.stream(numbers)
  		      .boxed()
  		      .sorted()
  		      .skip(1)
  		      .findFirst().get();
  		
          System.out.println("secondLowest: " + secondLowest);
	}

}
