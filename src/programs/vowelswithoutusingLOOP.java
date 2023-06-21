package programs;

public class vowelswithoutusingLOOP 
{
static int n;
static char[] s1;
	public static void main(String[] args) 
	{
	
		String s="kiran";
		 s1= s.toCharArray();
	 n=s1.length;
	 if(n>0)
	 {
		 
		print(n-1);
	 }
		
	}
	
	public static void print (int n1)
	{
	if((n1<=s1.length-1) &&(n1>=0))
	{
		if((s1[n1]=='a')||(s1[n1]=='e')||(s1[n1]=='i')||(s1[n1]=='o')||(s1[n1]=='u'))
		{
			System.out.println(s1[n1]);
		}
		n1--;
		print(n1);
	}
		
	}
	
	
}
