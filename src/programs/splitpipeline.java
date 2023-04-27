package programs;

public class splitpipeline 
{
	static String s1;
	static String s2;
	static String s3;

	public static void main(String[] args) 
	
	{
	

		String s="apppium application appollo";
		 String[] arr = s.split(" ");
		 
			 s1=arr[0];
			 s2=arr[1];
			 s3=arr[2];
			 
//			 System.out.println(s1);
//			 System.out.println(s2);
//			 System.out.println(s3);
		
		for(int i=0;i<s3.length();i++)
		{
			if(s1.charAt(i)==s2.charAt(i) && s1.charAt(i)==s3.charAt(i))
			{
				System.out.print(s1.charAt(i));
			}
		}
			 
		
	}
	
}
