package programs;

import java.util.LinkedHashSet;

public class alphabetsort2
{

	public static void main(String[] args) 
	{
	
		String s="kiran";
		 char[] s1 = s.toCharArray();
		 

		 
		 for (int i = 0; i < s1.length-1; i++) 
		 {
		
			 for (int j = i+1; j < s1.length; j++) 
			 {
			
				 if(s1[i]>s1[j])
				 {
					 Character temp=s1[i];
					 s1[i]=s1[j];
					 s1[j]=temp;
				 }
			}
		}
		 
		 
		 for (int i = 0; i < s1.length; i++) {
			
			 System.out.println(s1[i]);
		}
		 
	}
	
}
