package com.sample;

public class StringReverse {

	public static void main(String[] args) {
		String str = "IMHSKAL";
		int length = str.length();
		String reverse = "";
		
		for ( int i = length-1; i >= 0; i --) {
			reverse = reverse + str.charAt(i);
		}
       System.out.println("Reversed String: " + reverse);
       
    String str1 = "ABCD";
    String rev = "";
   	char a[] = str1.toCharArray();
   	int lengthChar = a.length;
   	for ( int i = lengthChar-1; i >= 0; i --) {
   		rev = rev + a[i];
   	}
      System.out.println("Reversed String: " + rev);
   
	}
}

