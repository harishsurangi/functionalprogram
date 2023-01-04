package com.example.pracitce;

import java.util.List;

public class Test2 {
	
	
	public static void printAllNumbersInFunctional(List<Integer> numbers) {

		numbers.stream().forEach(System.out::println);
	}
	
	public static void printEvenNumbersInFunctional(List<Integer> numbers) {
		
		numbers.stream().filter(Test2::isEven).forEach(System.out::println);
		}
	public static boolean isEven(int number) {
		return number%2==0 ;
			
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 printAllNumbersInFunctional(List.of(2,56,8,45,65,54));
		 
		 printEvenNumbersInFunctional(List.of(2,56,8,45,65,54));
	}

}
