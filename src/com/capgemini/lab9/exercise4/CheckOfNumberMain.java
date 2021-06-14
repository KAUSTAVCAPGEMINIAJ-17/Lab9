package com.capgemini.lab9.exercise4;
/**
 * @author Kaustav
 */
import java.util.Scanner;

public class CheckOfNumberMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter  the First number for Comparison:");
		int num = sc.nextInt();
		System.out.println("Enter  the Second number for Comparison:");
		int numToCompare =sc.nextInt();
		sc.close();
		CheckOfNumber checker1 = new CheckOfNumber(num);
	        
	        CheckInterface p = CheckOfNumber::isBigger;
	        boolean result = p.check(checker1,numToCompare);
	        if (result) {
	            System.out.println(checker1.getNum() + " is bigger than " + numToCompare);
	        }else {
	            System.out.println(checker1.getNum() + " is smaller than " + numToCompare);
	        }
	    }
	}