package programs;

import java.util.LinkedHashMap;
import java.util.TreeSet;

import com.sun.java_cup.internal.runtime.Scanner;

public class anargamwithCollection 
{

	public static void main(String[] args) 
	{
	
	//Scanner sc=new java.util.Scanner(System.in);
		
		
		java.util.Scanner sc=new java.util.Scanner(System.in);
		
		LinkedHashMap<String,Integer> map=new LinkedHashMap<>();
		
		System.out.println("enter the nor of words");
		int n=sc.nextInt();
		String[] s=new String[n];
		Character[] ch=new Character[5];
		for(int i=0;i<n;i++)
		{
			s[i]=sc.nextLine();
		}
		
		for(int i=0;i<s.length;i++)
		{
			TreeSet<Character> ti = new TreeSet<>();
			String text = s[i];
			for(int j=0;j<text.length();j++)
			{
				
				ti.add(text.charAt(j));
		
			}
		
			System.out.println(ti);
			
		
			
		
		}
			
		
		
	}
	
}
