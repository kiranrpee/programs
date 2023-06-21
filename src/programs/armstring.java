package programs;

import com.sun.java_cup.internal.runtime.Scanner;

public class armstring
{
 static int sum;
	
	public static void main(String[] args) 
	{
		
	java.util.Scanner sc=new java.util.Scanner(System.in);
	System.out.println("enter the nor");
		int n=sc.nextInt();
		int number=n;
		while(n!=0)
		{
		int n1=n%10;
		armstrong(n1);
		n=n/10;
		}
		//System.out.println(sum);
	if(sum==number)
	{
		System.out.println("armstrong number");
	}
	else
	{
		System.out.println("normal number");
	}
	}
	
	public static void armstrong(int n1)
	{
	
		sum=sum+n1*n1*n1;
	
		
	}
	

	
	
}
