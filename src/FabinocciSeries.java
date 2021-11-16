
public class FabinocciSeries {
	public static void main(String[] args) {


		//Fibonacci series

		//		int n1=0;
		//		int n2=1;
		//		int sum=0;
		//
		//		System.out.print(n1+" "+n2);	// 0  1
		//		for (int i = 2; i <= 10; i++) {
		//			sum=n1+n2;				// 0+1 //1+1 //1+2 //2+3
		//			System.out.print(" "+sum);//1
		//			n1=n2;					// 1
		//			n2=sum;					// 1
		//
		//		}






		//Resverse a string

		//		String st="ABCD";
		//		String rev="";
		//		
		//		for (int i = st.length()-1; i >= 0; i--) {
		//			rev=rev+st.charAt(i);
		//		}
		//		System.out.println(rev);







		//Reverse a number

		//		Scanner e=new Scanner(System.in);
		//		System.out.println("Enter the numbers");
		//		int val = e.nextInt();
		//		
		//		StringBuffer ss=new StringBuffer();
		//		
		//		ss.append(val);
		//		ss.reverse();
		//		
		//		System.out.println("Reverse of numbers = "+ss);







		//		Palindrome scequence using string

		//		        0123456
		//		String s="abcdcba";
		//		
		//		int i=0,j=s.length()-1;
		//		
		//		while (i<j) {
		//			if (s.charAt(i)!=s.charAt(j)) {
		//				System.out.println("Not a palindrome");
		//				System.exit(0);
		//			}
		//			i++;
		//			j--;
		//		}
		//		System.out.println("It is a palindrome");








		//maximum value in array

		//		int a[]= {1,4,7,9,8,2};
		//		
		//		
		//		int maxValue=0;
		//		
		//		for (int i = 0; i < a.length; i++) {
		//			if (a[i]>maxValue) {
		//				maxValue=a[i];
		//			}
		//		}	
		//		System.out.println("maximum value = "+maxValue);







		//		minimum value in array

		//		int b[]= {9,4,7,1,8,2};
		//		
		//		int maxMin=0;
		//		
		//		for (int i = 0; i < b.length; i++) {
		//			if (b[i]>maxMin) {
		//				maxMin=b[i];
		//			}
		//			for (int j = 0; j < b.length; j++) {
		//				if (maxMin>b[j]) {
		//					maxMin=b[j];
		//				}
		//			}
		//		}
		//		System.out.println("minimum value = "+maxMin);




		//Odd or Even

		int a=24;

		if (a%2==0) {
			System.out.println("Even");
		}
		else {
			System.out.println("Odd");
		}













	}

}
