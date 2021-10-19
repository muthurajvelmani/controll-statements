package org.output;

import java.util.Scanner;

public class SumOfAddNumberFromGivemLimit {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter limit");
		int sum=0;
	int num=s.nextInt();
	for(int i=0;i<num;i++) {
		if(i%2!=0) {
			sum=sum+i;
		}
	}
	System.out.println(sum+" is  sum of add number from given input number");
	}

}
