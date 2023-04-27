package programs;

public class firstlargest {

	public static void main(String[] args) 
	{
	
		int count=0;
		String s="kkkkkkiirrrrrraaaannnnnan";
		 char[] s1 = s.toCharArray();
		for(int i=0;i<s1.length-1;i++)
		{
			for(int j=i+1;j<s1.length;j++)
			{
				if(s1[i]==s1[j])
				{
					count++;
					//s1[i]=0;
				}
				
				
			}
			
			System.out.println(s1[i]);
			System.out.println(count);
			count=0;
		}
	
		System.out.println(count);
	}

}
