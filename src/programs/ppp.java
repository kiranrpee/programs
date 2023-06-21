package programs;

public class ppp {

	static int count;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	String s="aabbbcaa";//a2b3c1a2
	
	 char[] s1 = s.toCharArray();
	for(int i=0;i<s1.length-1;i++)
	{
		System.out.print(s1[i]); 
		for(int j=i+1;j<s1.length;j++)
		{
			if(s1[i]==s1[j])
			{
				count++;
				s1[j]=0;
				
			}
			
			
			
			
		}
		
		System.out.print(count);	
		count=0;	
	}
	 
	
	
	
	
	}

}
