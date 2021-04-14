package lab2;

import java.util.Scanner;

public class Q1_UserInput_Largest {

	/*
	 * Write a program with a loop that lets the user enter 
	 * a series of integer numbers. After all the numbers 
	 * have been entered,  the program should display the 
	 * largest and smallest numbers entered.*/
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your first number:");
		int firstNum = sc.nextInt();

		int largest = firstNum;
		int smallest = firstNum;

		do {
			
			System.out.println("Enter your next number:");
			int newNum = sc.nextInt();

			System.out.println("Do you want to another number: 0-No, 1-Yes");
			int cont = sc.nextInt();

			if (cont == 1) {

				if (newNum > largest) {
					largest = newNum;

				} else if (newNum < smallest) {
					smallest = newNum;
				}
			} else if (cont == 0) {
				if (newNum > largest) {
					largest = newNum;

				} else if (newNum < smallest) {
					smallest = newNum;
				}

				break;
			} else {
				System.out.println("Please enter 0 or 1");

			}   
			
		} while (true);

		System.out.println("Smallest number is: " + smallest);
		System.out.println("Largest number is: " + largest);

	}

}
