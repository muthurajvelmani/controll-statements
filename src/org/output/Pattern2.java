package org.output;

	import java.util.Scanner;

	public class Pattern2 {
	public static void main(String[] args) {
//		Scanner s=new Scanner(System.in);
//		System.out.println("enter the row");
//		int row=s.nextInt();
//		int i,j;
//		for(i=0;i<row;i++) {
//			
//			for(j=row-i;j>1;j--) {
//				System.out.print("" );
//			}
//			for( j=0;j<=i;j++) {
//				System.out.print("*");
//			
//			}
//		System.out.println();
//		}
//		
//	}
//	}
			int n=5,j,i;
				for ( i=0; i<n; i++)
				{
					for ( j=n-i; j>1; j--)
					{
						
						System.out.print(" ");
					}

				
					for ( j=0; j<=i; j++ )
					{
						
						System.out.print("* ");
					}

					
					System.out.println();
				}
			}
	}
			




