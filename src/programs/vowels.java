package programs;

public class vowels 
{
	static int count;
	public static void main(String[] args) 
	{
	
		String s1="vijay";
		String s2="vivek";
		String s3="jawahar";
		
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)=='a'||s1.charAt(i)=='e'||s1.charAt(i)=='i'||s1.charAt(i)=='o'||s1.charAt(i)=='u')
				{
				count++;
				
				
				}
			
		}
		System.out.println(count);
		count=0;
		
		for(int i=0;i<s2.length();i++)
		{
			if(s2.charAt(i)=='a'||s2.charAt(i)=='e'||s2.charAt(i)=='i'||s2.charAt(i)=='o'||s2.charAt(i)=='u')
				{
				count++;
				
				
				}
			
		}
		System.out.println(count);
		
		count=0;
		
	
		for(int i=0;i<s3.length();i++)
		{
			if(s3.charAt(i)=='a'||s3.charAt(i)=='e'||s3.charAt(i)=='i'||s3.charAt(i)=='o'||s3.charAt(i)=='u')
				{
				count++;
				
				
				}
			
		}
		System.out.println(count);
		
		
	}
	
	
	
	
}
