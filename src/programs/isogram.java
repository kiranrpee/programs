package programs;

public class isogram
{

	public static void main(String[] args) 
	{
	
		String s="banglore";
		char[] s1=s.toCharArray();
		
		for(int i=0;i<s1.length-1;i++)
		{
			for(int j=i+1;j<s1.length;j++)
			{
				
				if(s1[i]==s1[j])
				{
					s1[j]=0;
				}
				
			}
		}
		//System.out.println(s1);
		
		for(int i=0;i<s1.length;i++)
		{
			if(s1[i]==0)
			{
				System.out.println("isogram");
				break;
			}
			else
			{
				System.out.println("not isogram");
				break;
			}
		}
		
		
		
	}
	
}
