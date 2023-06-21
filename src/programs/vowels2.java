package programs;

public class vowels2
{
public static void main(String[] args) {
	
int count=0;
	String[] s= {"rakshit","chat","zoom"};
	String s1=s[0];
	String s2=s[1];
	String s3=s[2];
	
	
	for(int i=s1.length()-1;i>=0;i--)
	{
		//System.out.println(s1.charAt(i));
		if(s1.charAt(i)=='a'||s1.charAt(i)=='e'||s1.charAt(i)=='i'||s1.charAt(i)=='u')
		{
			count++;
		}
			
	}
	
	System.out.println(count);
}	
}
