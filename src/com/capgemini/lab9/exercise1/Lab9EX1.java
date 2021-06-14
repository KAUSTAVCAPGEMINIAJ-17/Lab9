package com.capgemini.lab9.exercise1;

import java.util.Scanner;

public class Lab9EX1{
	
 public static void main(String[] args) {
	
	 Power obj = () ->{
		 	Scanner sc = new Scanner(System.in);
		 	System.out.println("Enter the value of the base -A:");
		 	int A = sc.nextInt();
		 	System.out.println("Enter the value of the power -B:");
		 	int B = sc.nextInt();
		 	sc.close();
		return (long) Math.pow(A,B);
		};
		System.out.println("Therefore A to the power B is: "+obj.powerOfX());
 	}
}