package programs;

public class print1to10WithoutUsingLOOP 
{
static	int n=1;
	
	public static void main(String[] args) 
	{
	
		print();
		
		
	}
	
public static void print()

{
		if(n<10)
		{
			System.out.println(n);
			n++;
			print();
			
		}
	}
	
}
