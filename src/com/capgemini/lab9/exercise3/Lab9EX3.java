package com.capgemini.lab9.exercise3;

import java.util.Scanner;

public class Lab9EX3 {
   public static void main(String[] args) {
	
	   Username u = ()->{
		   Scanner sc = new Scanner(System.in);
		   System.out.println("Enter your username: ");
		   String UN = sc.next();
		   System.out.println("Enter your password :");
		   String password = sc.next();
		   sc.close();
		   if(UN.equals("Kaustav") && password.equals("KaustavMukherjee123@")) 
			   return true;
		   return false;
	   };
	   
	   if(u.checkUserName()) {
		   System.out.println("Valid user Name and Password");
	   }else {
		   System.out.println("Wrong Password or Username,Please Check Again");
	   }
   }
}