package lab2;

import java.util.Scanner;

public class Q3_SumToEntered {
	
	/*
	 * Write a program that asks the user for a positive nonzero 
	 * integer value. The program should use a loop to get the sum 
	 * of all the integers from 1 up to the number entered. */

	public static void main(String[] args) {

		int sum=0;
        Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number : ");
		int num=sc.nextInt();
		
		if(num>0) {
			for(int i=1;i<=num;i++) {
			sum+=i;
			}
		}else 
			System.out.println("Invalid number");
			
		System.out.println("Total numbers 1 up to "+ num +" is :"+sum);

	}

    
}
