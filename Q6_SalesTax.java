package lab2;

import java.util.Scanner;

public class Q6_SalesTax {
	/*
	 * Write a program that will ask the user to enter the amount of a purchase. The
	 * program should then compute the state and county tax sales tax. Assume the
	 * state sales tax is 4 percent and the county sales tax is 2 percent. The
	 * program should display the amount of the purchase , the state sales tax, the
	 * county sales tax, the total sales tax, and the total of the sale (which is
	 * the sum of the amount of purchase plus the total sales tax)
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter amount of a purchase : ");
		double amount = sc.nextDouble();

		double stateTax = amount * 4 / 100;
		double countyTax = amount * 2 / 100;

		double totalTax = stateTax + countyTax;

		double totalSale = totalTax + amount;

		System.out.println("The state sales tax is : " + stateTax);
		System.out.println("The county sales tax is : " + countyTax);
		System.out.println("The total sales tax is : " + totalTax);
		System.out.println("The total of sale is : " + totalSale);

	}

}
