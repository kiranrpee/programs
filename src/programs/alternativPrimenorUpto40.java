package programs;

import com.sun.java_cup.internal.runtime.Scanner;

public class alternativPrimenorUpto40 {

	public static void main(String[] args) 
	{
		int size=0;
		
		System.out.println("enter the range");
java.util.Scanner sc=new java.util.Scanner(System.in);
int range=sc.nextInt();
	
for(int i=2;i<=range;i++)
{
	prime(i);
}

	}
	
	
	public static void prime(int n)
	{
		int[] arr=new int[20];
		int size=0;
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				//System.out.println("its not prime nor"+n);
				break;
			}
			else
			{
				
				System.out.println("its prime nor"+n);

				
					arr[size]=n;
					size++;
					break;
				
				
				
				
			}
			
			
		}
		
		
		
		
	}
	
	

}
