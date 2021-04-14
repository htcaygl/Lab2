package lab2;

import java.util.Scanner;

public class Q4_PercentageFM {
	/*
	 * Write a program that asks user for the number of males 
	 * and the number of females registered in a class. The 
	 * program should display the percentage of males and females 
	 * in the class.*/

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter female number in class : ");
		int female=sc.nextInt();
		
		System.out.print("Enter male number in class: ");
		int male=sc.nextInt();
		
		int sum= female+male;
		
		double perFemale=((double)female/sum)*100;
	    double perMale= ((double)male/sum)*100;
		
	    System.out.println("Female Percentage is "+perFemale );
	    System.out.println("Male Percentage is "+perMale );

	}

}
