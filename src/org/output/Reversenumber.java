package org.output;
import java.util.Scanner;
public class Reversenumber {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("********enter the number********");
  int num=s.nextInt();
  int reverse=0;
  while(num!=0) {
	  int r;
	  r=num%10;
	               //741%10=1
	                 //74%10=4
                    	  //7%10=7
	  reverse=reverse*10+r;
	                        //0=0*10+1-->1
	                          //1=1*10+4-->14
	                           //14=14*10+7-->147
	  num=num/10;
	              //741/10-->74
                 //74/10-->7 
	             //7/10-->0.7
  }
System.out.println("reverse of number is "+reverse);


}
}
