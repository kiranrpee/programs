package programs;

public class shiftRotation
{

	public static void main(String[] args) 
	{
	
		int[] a= {1,2,3,4,5};
		// o/p= 34512
		int count=0;
		
		for(int i=2;i<a.length;i++)
		{
			System.out.println(a[i]);
			if((i==a.length-1)&&(count==0))
			{
				i=-1;
				count++;
			}
		}
		
	
		
	}
	
}
