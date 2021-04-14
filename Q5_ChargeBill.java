package lab2;

import java.util.Scanner;

public class Q5_ChargeBill {

	/*
	 * Write a program that computes the tax and tip on a restaurant bill. The
	 * program should ask the user to enter the charge for the meal. The tax should
	 * be 6.75 percent of the meal charge. The tip should be 20 percent of the total
	 * after adding tax. Display the meal charge, tax amount, tip amount, and total
	 * bill on the screen.
	 * 
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the charge for the meal:");
		double charge = sc.nextDouble();

		double tax = charge * 6.75 / 100;

		double total = charge + tax;

		double tip = total * 20 / 100;

		double bill = total + tip;

		System.out.println("Meal Charge is:" + charge);
		System.out.println("Tax amount is:" + tax);
		System.out.println("Tip amount is:" + tip);
		System.out.println("Total Bill is:" + bill);

	}

}
