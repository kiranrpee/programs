package programs;

public class removeduplicate
{

	public static void main(String[] args) 
	{
	
		String s="Technology";
		 char[] s1 = s.toCharArray();
		 
		 for(int i=0;i<s1.length-1;i++)
		 {
			 for(int j=i+1;j<s1.length;j++)
			 {
				 if(s1[i]==s1[j])
				 {
					 s1[i]=0;
				 }
			 }
		 }
		 
		 for(int i=0;i<s1.length;i++)
		 {
			 System.out.print(s1[i]);
		 }
		 
		
		
	}
	
	
}
