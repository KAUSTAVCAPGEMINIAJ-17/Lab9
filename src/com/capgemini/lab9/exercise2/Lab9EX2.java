package com.capgemini.lab9.exercise2;

import java.util.Scanner;

public class Lab9EX2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Space s = ()->{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the string You Want: ");
			String f = sc.nextLine();
			sc.close();
			return f.replace(""," ").trim();
		};
		System.out.println("Output string: "+ s.addSpace());
	

	}

}
