package projectUpload;

import java.util.Scanner;

public class missingNumber {
	
	public static void main(String []args) {

		Scanner sc=new Scanner(System.in);
		int sum=0;
		System.out.print("Enter the number of elements to be added : ");
		int b=sc.nextInt();
	    int a[]=new int[b];
		for (int i=0;i<a.length;i++) {
			 a[i]=sc.nextInt();
			  sum=sum+a[i];
		}
		
		int c=((b+1)*(b+2))/2 - sum;
		System.out.println("The missing number is " +c);
	}
}