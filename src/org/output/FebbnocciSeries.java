package org.output;
import java.util.Scanner;
public class FebbnocciSeries {
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
  System.out.println("enter number");
int num1=0,num2=1,num3;
int count=s.nextInt();
for(int i=2;i<=count;i++) {
num3=num1+num2;
	num1=num2;
    num2=num3;
  //  count=count+1;

System.out.println(num3);
}
}
}
//		int N=100 ,num1 = 0, num2 = 1;
//
//		int counter = 0;
//
//		// Iterate till counter is N
//		while (counter < N) {
//
//			// Print the number
//			System.out.print(num1 + " ");
//
//			// Swap
//			int num3 = num2 + num1;
//			num1 = num2;
//			num2 = num3;
//			counter = counter + 1;
//		}
//	}
//}
//
//	