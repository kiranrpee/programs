package programs;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class sortchracter
{

	public static void main(String[] args) 
	{
	
		String s="azxyb";
		char[] s1=s.toCharArray();
		//LinkedHashSet<Object> list=new LinkedHashSet<>();
		TreeSet<Character> t=new TreeSet<>();
		for(int i=0;i<s1.length;i++)
		{
			t.add(s1[i]);
		}
		
		System.out.println(t);
	}
}
