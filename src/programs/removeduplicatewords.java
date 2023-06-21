package programs;

public class removeduplicatewords 
{

	public static void main(String[] args) 
	{
	
		String s="kiran hi kiran shubham swapnil swapnil";
		
	 String[] s1 = s.split(" ");
	 
	 for(int i=0;i<s1.length-1;i++)
	 {
		 for(int j=i+1;j<s1.length;j++)
		 {
			 if(s1[i].equals(s1[j]))
			 {
				
				 
				 s1[j]="0";
				 
			 }
		 }
	 }
		
	 
	 for (int i = 0; i < s1.length; i++) 
	 {
	
		 System.out.println(s1[i]);
	}
	}
	
}
