package com.class5;

import java.util.Scanner;

public class Homework {

	public static void main(String[] args) {
		
		int quiz;
		int midterm;
		int final1;
		
		Scanner inp=new Scanner(System.in);
		
		System.out.println("Please input your quiz, midterm and final scores");
		quiz =inp.nextInt();
		midterm=inp.nextInt();
		final1=inp.nextInt();
		double average= (quiz+midterm+final1)/3;
		char grade;
		
		if (average>=90) {
			grade='A';
		}else if (average>=70 && average<90) {
			grade='B';
		}else if (average>=50 && average<70) {
			grade='C';
		} else {
			grade='F';
		}
			System.out.println(grade);
		}
		
	}

