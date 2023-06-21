package programs;

public class pattern3 
{

	
	public static void main(String[] args) 
	{
	
		String s="Kiran";
		for(int i=0;i<s.length();i++)
		{
			for(int j=0;j<=i;j++)
			{
			
			System.out.print(s.charAt(j));
//				s.charAt(j);
		}
			System.out.println();
		}
	}
}
