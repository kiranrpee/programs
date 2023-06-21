package programs;

public class sortwithoutcollection 
{

	public static void main(String[] args)
	{
		
	
	String s="azxyb";
	char[] s1 = s.toCharArray();
	
	for (int i = 0; i < s1.length-1; i++) {
		
		for (int j = i+1; j < s1.length; j++) 
		{
		
			if(s1[i]>s1[j])
			{
				char temp=s1[i];
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
