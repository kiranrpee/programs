package programs;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class repeat 
{

	public static void main(String[] args) 
	{
	
		int count=0;
		String s="aaabbcddd";
		LinkedHashSet<Character> l=new LinkedHashSet<>();
		
		for (int i = 0; i <s.length(); i++)
		{
		
			l.add(s.charAt(i));
			
		}
		
		//System.out.println(l);
		System.out.println(s);
		
		for( Character data:l)
		{
			for(int i=0;i<s.length();i++)
			{
		
				if(data==s.charAt(i))
				{
					count++;
				}
		
			}
			if(count>1)
			{	
			System.out.print(data+""+count);
			
			}
			else
			{
				System.out.print(data);
				
			}
			count=0;
			}
		
	}
	
}
