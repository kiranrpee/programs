package programs;

public class trycatch 
{

	public static void main(String[] args) 
	{
	
		try
		{
			System.out.println("first");
		int d=1/0;
		System.out.println("second");
		}
		
		catch (Throwable e1) 
		{
		System.out.println("hello");
			
		}
	
	//	catch (Exception e) 
//		{
//		System.out.println("hi");
//		}
//		
		//System.out.println("me");
		
		
		finally
		{
			System.out.println("finally");
		}
	}
}
