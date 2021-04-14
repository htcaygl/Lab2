package lab2;

import java.util.Scanner;

public class Q2_Cookies {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter number of cookies : ");
		int num=sc.nextInt();
		
		int cal=num*40*30;
		
		System.out.println("You ate "+cal +" calori.");

	}

}
