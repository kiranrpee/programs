package programs;

import java.util.HashMap;
import java.util.Map.Entry;

public class mapduplicateprint
{

	public static void main(String[] args) {
		
	
	String s="kiran hosamani kiran belgaum hosamani ";
	HashMap<String,Integer> map=new HashMap<>();
	
	String[] s1 = s.split(" ");
	 for(int i=0;i<s1.length;i++)
	 {
		 
		 if(!map.containsKey(s1[i]))
		 {
			 map.put(s1[i],1);
		 }
		 else
		 {
			 Integer value = map.get(s1[i]);
			 value++;
			 map.put(s1[i], value);
			 
		 }
		 
	 }
	 
	 
	 for(Entry<String, Integer> data:map.entrySet())
	 {
		
		 if(data.getValue()>1)
		 {
			 System.out.println(data.getKey());
		 }
		 
	 }
	 
	
	
	
	}
	
}
