package programs;

public class countchar
{

	static int count;
	int kcount;
	int icount;
	public static void main(String[] args) 
	{
	
		String s="aaakkia";
		 char[] s1 = s.toCharArray();
		for(int i=0;i<s1.length-1;i++)
		{
			for(int j=i+1;j<s1.length;j++)
			{
				if(s1[i]==s1[j])
				{
					
					count++;
					s1[j]=0;
					
				}
				
			}
			
			System.out.println(s1[i]);
			System.out.println(count+1);
			count=0;
			
		}
		
		
	}
	
}
