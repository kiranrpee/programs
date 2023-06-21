package programs;

public class duplicatesin2array 
{

	public static void main(String[] args) 
	{
	
		int[] a= {10,20,30,40,50};
		int[] a1= {30,40,50,50};
		
		for(int i=0;i<a.length;i++)
		{
			for (int j = 0; j < a1.length; j++) 
			{
			
				if(a[i]==a1[j])
				{
					System.out.println(a[i]);
					break;
				}
				
			}
		}
		
		
	}
	
}
