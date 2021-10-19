package org.output;

import java.util.Scanner;

public class PrimeNumOrNot {
public static void main(String[] args) {
	System.out.println("enter the number");
	Scanner s=new Scanner(System.in);
	int num=s.nextInt();
	if(num%2==0) {
		System.out.println("not aprime number");
	}
	else
	{
		System.out.println(" prime number");
	}
	
}
}
