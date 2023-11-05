package com.sample;

import java.util.Arrays;

public class LongestString {

	public static void main(String[] args) {
	String[] strArray = {"shruthi", "lakshminarayanan", "gayathri", "deepika"};
	
	String longest = Arrays.stream(strArray)
	      .reduce((s1,s2) -> s1.length()>s2.length()?s1:s2)
	      .get();
    System.out.println(longest);
	
	}

}
