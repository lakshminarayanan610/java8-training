package com.sample;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.stream.Collectors;

public class GetFileName {

	public static void main(String[] args) {
		String fullFileName = "DocumentStaging/Sample-35337547.pdf";
		String filenameWithoutExtension = null;
		int lastIndex = fullFileName.indexOf(".");
		System.out.println("Extension: " +fullFileName.substring(lastIndex));
		if(lastIndex>0) {
			filenameWithoutExtension = fullFileName.substring(0, lastIndex);
            System.out.println("Filename without extension: " + filenameWithoutExtension);
		}
		String[] keyParts = filenameWithoutExtension.split("/");
        String fileName = keyParts[keyParts.length - 1];
        System.out.println("The filename is " + fileName);
        
        String label = Arrays.stream(fileName.split("-"))
              .skip(1)
              .collect(Collectors.joining("-"));
        System.out.println("Label: " +label);
        
        String policy = Arrays.stream(fileName.split("-")).skip(1).findFirst().get();
        System.out.println("The policy is " + policy);
        
        String policy1 = Arrays.stream(fileName.split("-")).skip(1).collect(Collectors.joining("-"));
        System.out.println("The policy1 is " + policy1);
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss'Z'");
        LocalDateTime now = LocalDateTime.now();
        String formattedDate = now.format(formatter);
        // Print the formatted date
        System.out.println(formattedDate);

        

	}

}
