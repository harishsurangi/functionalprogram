package com.example.pracitce;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class Test4 {
   
	public static void main(String[] args) {
		
		List<String> fruits=List.of("apple","banana","mango");
		
		Predicate<? super String> predicate=fruit->fruit.startsWith("c");
		
		Optional<String> optional=fruits.stream().filter(predicate).findFirst();
		//it may not contain we need to handle null pointer exception
		System.out.println(optional);
		System.out.println(optional.isEmpty());
		System.out.println(optional.isPresent());
		System.out.println(optional.get());
	}
}
