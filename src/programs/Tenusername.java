package programs;

import java.util.Random;

public class Tenusername 
{

	static char username;
static	Random rnd=new Random(10);

	public static void main(String[] args) 
	{
		
		
		for (int i = 0; i<=10; i++)
		{
		
			 generate();
			
			
			
		}
	
		
		
		
	}
	
	public static void  generate()
	{
		
		
		for (int i = 0; i <=10; i++)
		{
		
		username=username+(char)i;
			//System.out.println((char)i);
			
		}
		System.out.println(username);
		//username=' ';
		 
	
		
	
	}
	
	
}
