package programs;

import java.util.LinkedHashSet;

public class example 
{
static int count;
	public static void main(String[] args) 
	{
	
		String s="aaabbccccd";
		 char[] s1 = s.toCharArray();
		 
		 LinkedHashSet<Character> list=new LinkedHashSet<>();
		 
 		 
		 for(int i=0;i<s1.length;i++)
		 {
			 list.add(s1[i]);
		 }
		
		 System.out.println(list);
		 
		 for(Character l:list)
		 {
			 for(int j=0;j<s1.length;j++)
			 {
				 if(l==s1[j])
				 {
					 count++;
				 }
				
			 }
			
			 System.out.print(l+""+count);
			 count=0;
		 }
		 
		 
		 
		 
		 
	}
	
}
