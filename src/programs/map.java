package programs;

import java.util.HashMap;
import java.util.Set;

public class map 
{

	
	public static void main(String[] args) 
	{
	
		int[] a= {10,20,30,20,5};
		
		HashMap<Integer,Integer> map=new HashMap<>();
		
		for(int i=0;i<a.length;i++)
		{
			if(!map.containsKey(a[i]))
			{
				map.put(a[i],1);
				
				
			}
			else
			{
			
				// Integer data = map.get(a[i]);
				 //map.keySet()
			
			}
			
		}
		System.out.println(map.keySet());
		Set<Integer> keyvalue = map.keySet();
		
		
 		
	}
	
}
