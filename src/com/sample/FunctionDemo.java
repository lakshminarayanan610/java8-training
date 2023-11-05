package com.sample;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionDemo {

	public static void main(String[] args) {
		
      Function<Integer, Integer> incrementFunction = num -> num + 1;
      System.out.println(incrementFunction.apply(2));
      
      Function<Integer, Integer> multiplyBy10Function = num -> num * 10;
      System.out.println(multiplyBy10Function.apply(5));
      
      Function<Integer, Integer> incrementAndMultiply = incrementFunction.andThen(multiplyBy10Function);
      System.out.println(incrementAndMultiply.apply(5));
      
      BiFunction<Integer, Integer, Integer> multiplyBiFunction = (n1, n2) -> (n1+1) * n2;
      System.out.println(multiplyBiFunction.apply(5, 10));
      
	}

}
