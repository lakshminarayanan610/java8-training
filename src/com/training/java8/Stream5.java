package com.training.java8;

import java.util.Arrays;

public class Stream5 {

	public static void main(String[] args) {
		
	  String[] strArray = {"java", "techie", "springboot", "microservices", "kubernetesaws"};
	  
	  String bigString = Arrays.stream(strArray)
	        .reduce((w1,w2) -> w1.length() > w2.length()?w1:w2)
	        .get();
	  System.out.println("bigString: " +bigString);

	}

}
