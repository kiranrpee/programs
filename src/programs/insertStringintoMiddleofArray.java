package programs;

import java.util.ArrayList;

public class insertStringintoMiddleofArray {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		
		String[] s= {"kiran","shubhham","swapnil"};
		
		ArrayList<String> a=new ArrayList<>();
		for(int i=0;i<s.length;i++)
		{
			
			a.add(s[i]);
		}
		
		System.out.println(a);
		
	int	midd=a.size()/2;
	
	a.add(midd,"bandi");
		
	System.out.println(a);		
	
	}

}
