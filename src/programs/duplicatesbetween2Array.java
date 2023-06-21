package programs;

import java.util.HashMap;
import java.util.Map.Entry;

public class duplicatesbetween2Array 
{

	public static void main(String[] args) 
	{
	
		
		int[] a= {10,20,30,40,50};
		int[] a1= {30,40,50,50};
		
		HashMap<Integer,Integer> map=new HashMap<>();
		for (int i = 0; i < a.length; i++)
		{
			if(!map.containsKey(a[i]))
			{
				map.put(a[i],1);
			}
			else
			{
				int x=map.get(a[i]);
				x++;
				map.put(a[i],x);
			}
		}
		
		for (int i = 0; i < a1.length; i++)
		{
			if(!map.containsKey(a1[i]))
			{
				map.put(a1[i],1);
			}
			else
			{
				int x=map.get(a1[i]);
				x++;
				map.put(a1[i],x);
			}
		}
		
		
		for( Entry<Integer, Integer> data:map.entrySet())
		{
			if(data.getValue()>1)
			{
				System.out.println(data);
			}
		}
		
	}
	
	
}
