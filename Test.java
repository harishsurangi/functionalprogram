package com.example.pracitce;

import java.util.List;

public class Test {
	
	
	public static void printAllNumbers(List<Integer> numbers) {
	  for(int number:numbers) {
		  System.out.println(number);
	  }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 printAllNumbers(List.of(2,56,8,45,65,54));
	}

}
