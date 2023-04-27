package programs;

public class firstthreeminimum
{

	public static void main(String[] args) 
	{
	
		int sum=0;
		
		int[] a={7,-6,11,9,0,5};
		
		int fst=0;
		int sec=0;
		int thr=0;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>fst)
			{
				
				
				thr=sec;
				sec=fst;
				fst=a[i];
				
			}
			else if (a[i]>sec)
			{
				thr=sec;
				sec=a[i];
				
			}
			else if (a[i]>thr) {
				
			
			
				thr=a[i];
			}
		}
		System.out.println(fst);
		System.out.println(sec);
		System.out.println(thr);
		
		sum=sum+fst+sec+thr;
		
		System.out.println(sum);
		
	}
}
