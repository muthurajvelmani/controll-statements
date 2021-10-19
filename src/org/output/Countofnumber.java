package org.output;

import java.util.Scanner;

public class Countofnumber {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
System.out.println("***enter the number*** ");
		int n=s.nextInt();
		int count=0;
		while(n!=0) {
			//789456!=0
			//78945!=0
			//7894!=0
			//789!=0
			//78!=0
			//7!=0
			//0.7=0-->x
			n=n/10;
			//789456/10=78945
			//78945/10=7894
			//7894/10=789
			//789/10=78
			//78/10=7
			//7/10=0.7
			count++;
		}
			System.out.println("count of this number is "+count);
		
		
		
	}
}
