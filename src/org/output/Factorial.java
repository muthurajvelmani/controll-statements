package org.output;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the  number to find factorials");
		int fact=1;
		int num =s.nextInt();
		for(int i=1;i<=num;i++) {
			fact=fact*i;
		}
		System.out.println("factorial of given   "+num+" is "+fact);
	}

}
