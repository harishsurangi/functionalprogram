package com.example.pracitce;

import java.util.List;

public class Test3 {
	
	
	public static void printOddNumbers(List<Integer> numbers) {
	 
		numbers.stream().filter(number->number%2!=0).forEach(System.out::println);
	}
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  List<Integer> numbers= List.of(12,9,13,4,6,2,4,12,15);
	  printOddNumbers(numbers);
	  
	  List<String> names=List.of("Spring","Spring Boot","API","Microservices","AWS","PCF","Azure",
			  "Docker","Kubenates");
	  
	  names.stream().map(course->course+""+course.length()).forEach(System.out::println);	
	  
	  names.stream().filter(name->name.contains("Spring"))
	  .forEach(System.out::println);
	  
	  
	  names.stream().filter(name->name.length()>4)
	  .forEach(System.out::println);
	  
	}

}
