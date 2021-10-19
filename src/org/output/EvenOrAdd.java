package org.output;

import java.util.Scanner;

public class EvenOrAdd {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=s.nextInt();
		if(num%2==0)
		{
			System.out.println("entered number is  even");
		}
		else
		{
			System.out.println("entered numer is odd");
		}
	}

}
