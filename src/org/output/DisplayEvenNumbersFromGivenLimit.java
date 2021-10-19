package org.output;

import java.util.Scanner;

public class DisplayEvenNumbersFromGivenLimit {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
	   System.out.println("enter the number limit to find even number");
		int num=s.nextInt();
	System.out.println("even numbers are ");
	for(int i=0;i<=num;i++)
	{
		if(i%2==0) {
			System.out.print(i+" ");          
	
	}
	}

	
	}

}
