package programs;

public class mock
{

	public static void main(String[] args) 
	{
	
		String s="i am selenium";
		String rev="";
		 String[] s1 = s.split(" ");
		 String[] s2=new String[2];
		 for(int i=0;i<s1.length;i++)
		 {
			// System.out.println(s1[i]);
			 rev=rev+s1[i];
		 }
		 
		//System.out.println(rev);
		 
		 String fst=rev.substring(0,8); 
		   String scnd = rev.substring(8, 10);
		 
		    String thrd = rev.substring(10,11);
		  System.out.print(thrd+" ");
		  
		  
		   System.out.print(scnd+" ");
		  
		
		  
		  for(int i=fst.length()-1;i>=0;i--)
		  {
			 System.out.print(fst.charAt(i));
			  
			 
		  
		  }
		 
		
	}
	
}
