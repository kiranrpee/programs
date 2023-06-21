package programs;

public class splitpipeline2 
{

	public static void main(String[] args) 
	{
	
		
		String s="kiran||m||hosamani";
		
		  char[] s1 = s.toCharArray();
		 for(int i=0;i<s1.length;i++)
		 {
			 if(s1[i]=='|')
			 {
				 s1[i]=' ';
			 }
				 
		 }
		
		 for (int i = 0; i < s1.length; i++)
		 {
		
			 System.out.println(s1[i]);
		 }
		
		 
		 
	}
}
