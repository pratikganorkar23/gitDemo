package com.in28minutes.rest.webservices.restfulwebservices.test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Test {

	public static void main(String [] args) {
//		System.out.println("Hello World");
		Map<String, Integer> wordMap = new HashMap<String, Integer>();
		String tempStr = "Hello my friend name is rahul He is good boy";
		Arrays.asList(tempStr.split(" ")).stream().forEach(word -> wordMap.put(word, wordMap.getOrDefault(word, 0)+1));
		System.out.println("wordCount: " + wordMap.toString());
		
		wordMap.entrySet().stream().filter(entry -> entry.getValue()>1).forEach(System.out::println);
		System.out.println("wordCount: " + wordMap.keySet() + "::" + wordMap.values());
	}
}
