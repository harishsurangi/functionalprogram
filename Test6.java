package com.example.pracitce;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Test6 {
   
	public static void main(String[] args) {
		
		
		List<Integer> numbers=List.of(15,45,1,89,42,65,89,12);
		
		
		Predicate<Integer> isEvenPredicate=x->x%2==0;
		
		Function<Integer,Integer>  squareFunction =x->x*x;
		
		Consumer<Integer> sysoutConsumer =System.out::println;
		
		
		numbers.stream().filter(isEvenPredicate).map(squareFunction).forEach(sysoutConsumer);
	}
} 
