package com.example.pracitce;

import java.util.List;
import java.util.function.Predicate;

public class Test5 {
   
	public static void main(String[] args) {
		
		List<Integer> numbers=List.of(15,45,1,89,42,65,89,12);
		
		List<String> names=List.of("harish","jagan","surangi");
		
		Predicate<? super Integer> predicate=number->number>10;
		numbers.stream().filter(predicate).forEach(System.out::println);
		
		names.stream().map(name->name+"  "+name.length()).forEach(System.out::println);
		
		
		int sum=numbers.stream().reduce(0,(x,y)->x);
		System.out.println(sum);
	}
}
