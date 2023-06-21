package programs;

public class NumberinString
{
	static int mul=1;
	static int number=1;

	public static void main(String[] args) 
	{
	
		
		String s="i a1m goi123ng to fi321";
		
		 String[] s1 = s.split(" ");
		 for(int i=0;i<s1.length;i++)
		 {
			if((s1[i]>47) && (s1[i]<58))
			{
				number=number*10+s1[i];
			}
			
			
			 
		 }
	}
	
}
