package org.output;

import java.util.Scanner;

public class Armstrong1 {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter the number");
	int num=s.nextInt();
	  int  temp, total = 0,number;

      number = num;
      while (number != 0)
      {
          temp = number % 10;
          total = total + temp*temp*temp;
          number=number/10;
      }

      if(total == num)
          System.out.println( " is an Armstrong number");
      else {
    	  
      
          System.out.println( " is not an Armstrong number");
  }
}
}



