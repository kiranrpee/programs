package programs;

import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeSet;

public class welcometotys
{

	public static void main(String[] args) 
	{
	
		
		String s="welcome to tyss welcome to office";
		 String[] s1 = s.split(" ");
		 
		// TreeSet<String> t=new TreeSet<>();
		 HashSet<String> t=new HashSet<>();
		 for(int i=0;i<s1.length;i++)
		 {
			 t.add(s1[i]);
		 }
		 
		 for (String string : t)
		 {
			
		System.out.print(string+" ");
			 
		 }
		 
		 
	}
}
