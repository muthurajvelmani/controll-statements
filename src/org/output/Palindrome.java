package org.output;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		int n= s.nextInt();
		int temp,r,sum = 0;
		temp=n;    
		  while(n>0){    
		   r=n%10;   
		   sum=(sum*10)+r;    
		   n=n/10;    
		  }    
		  if(temp==sum)    
		   System.out.println(sum+" is a palindrome number ");    
		  else    
		   System.out.println("not palindrome");    
		}  
		}  
	


