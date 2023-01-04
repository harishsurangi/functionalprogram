package com.example.pracitce;

import java.util.List;

public class Course {
	
	 private String name;
	 private String category;
	 private int reviewScore;
	 private  int noOfStudents;
	 
  
	 public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getCategory() {
		return category;
	}


	public void setCategory(String category) {
		this.category = category;
	}


	public int getReviewScore() {
		return reviewScore;
	}


	public void setReviewScore(int reviewScore) {
		this.reviewScore = reviewScore;
	}


	public int getNoOfStudents() {
		return noOfStudents;
	}


	public void setNoOfStudents(int noOfStudents) {
		this.noOfStudents = noOfStudents;
	}


	public Course(String name, String category, int reviewScore, int noOfStudents) {
		this.name = name;
		this.category = category;
		this.reviewScore = reviewScore;
		this.noOfStudents = noOfStudents;
	}


	@Override
	public String toString() {
		return name+":"+noOfStudents+":"+reviewScore; 
	}


	public static void main(String[] args) {
		
		List<Course> courses= List.of(
				 
				 new Course("spring","framework",98,20000),
				 new Course("spring boot","framework",95,18000),
				 new Course("api","microservices",97,22000),
				 new Course("microservices","microservices",96,25000),
				 new Course("docker","cloud",92,21000)
				 ) ;
		courses.stream().allMatch(course->course.getReviewScore()>90);
		 
	}
}
