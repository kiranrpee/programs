package programs;

public class pattern
{

	public static void main(String[] args) 
	{
	
		 int x=1;
		 int d1=0,d2=0;
		
	 for (int i = 0; i <3; i++)
	 {
		 
		 for (int j = 0; j < 3; j++)
		 {
			 
			 
			 if(i==j) 
			 {
				 d1=d1+x;
				 x++;
			 } 
			
		}
		 for (int j = 2; j >=0; j++)
		 {
			 
			 
			 if(i==j) 
			 {
				 d1=d1+x;
				 x++;
			 } 
			
		}
		 
		 System.out.println();
	 }
		 
		 
		
	System.out.println(d1);
	  
		
	}
}	

