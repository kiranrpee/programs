package programs;

public class noradd 
{

	static int sum;
public static void main(String[] args) 
{

	int s1=0;
	String s="123kish1h23hi";
	for(int i=0;i<s.length();i++)
	{
		char ch = s.charAt(i);
		System.out.println(ch);
		int ch1=(int)ch;
		if((s.charAt(i)>='0'&& s.charAt(i)<='9'))
		{
		
		
		s1=s1+s.charAt(i);
//		//	System.out.print(ch+" ");
//			System.out.println((char)ch1);
//			sum=sum+(Integer)ch1;
		}
	}
	
	System.out.println(s1);
}
	
}
