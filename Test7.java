package com.example.pracitce;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Test7 {
 
	static List<Integer> numbers= List.of(12,9,13,4,2,4,12,15);
	
	public static void main(String[] args) {
		
		Predicate< Integer> isEvenPredicate = x->x%2==0; //true
		
		
		Predicate< Integer> isEvenPredicate2= new Predicate<Integer>() {

			@Override
			public boolean test(Integer x) {
				// TODO Auto-generated method stub
				return x%2==0;
			}
			
		};
		Function<Integer,Integer> squareFunction = x->x*x;//Integr

		
		Function< Integer,Integer> squareFunction2 = new  Function< Integer,Integer>(){

			@Override
			public Integer apply(Integer x) {
				// TODO Auto-generated method stub
				return x*x;
			}
			
		};
		Consumer<Integer> sysoutConsumer =System.out::println;//print
		
		Consumer<Integer> sysoutConsumer2 =new Consumer<Integer>(){

			@Override
			public void accept(Integer x) {
				// TODO Auto-generated method stub
				System.out.println(x);
			}
			
		};
		numbers.stream()
		.filter(isEvenPredicate)
		.map(squareFunction)
		.forEach(sysoutConsumer);
	}
}
 