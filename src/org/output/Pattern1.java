package org.output;

import java.util.Scanner;

public class Pattern1 {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter the row");
	int row=s.nextInt();
	int i,j;
	for(i=0;i<row;i++) {//0,0<5,0,1.
		for( j=0;j<=i;j++) {//0,0<1,0,1.1,1<=1,1,2.
			System.out.print("*");
			
		}
	System.out.println();
	}
	
}
}
