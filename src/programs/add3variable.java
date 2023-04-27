package programs;

public class add3variable 
{
	
	public static void main(String[] args) 
	{
	
		
		String s="hello";
		int l=s.length();
		String s1="world";
		
		s=s+s1;
		int l1=s.length();
		System.out.println(s);
		s1=s.substring(0,l);
		s=s.substring(l,l1);
		System.out.println(s);
		System.out.println(s1);
		
	}

}
