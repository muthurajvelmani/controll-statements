package org.output;

import java.util.Scanner;

public class Voters {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter the age of a person");
	int age=s.nextInt();
	if(age<18)
	{
		System.out.println("not eligible to vote");
	}
	else
	{
		System.out.println("eligible to vote");
	}
}
}
