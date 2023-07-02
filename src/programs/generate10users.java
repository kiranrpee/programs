package programs;

import java.util.Random;

public class generate10users
{
	static char[] ch= {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
	
	static String word="";
	

	public static void main(String[] args) 
	{
		for (int i = 0; i <=10; i++) 
		{
		namegeneratra();
		
		}
		
	}
	
	
	public static  int gen() 
	{
		Random rnd=new Random();
		return rnd.nextInt(26);
	}
	
	public static void namegeneratra() 
	{
		for (int i = 0; i <=5; i++)
		{
		
			int position = gen();
			word=word+ch[position];
			
		}
		
		System.out.println(word);
		word="";
		
		
	}
}
